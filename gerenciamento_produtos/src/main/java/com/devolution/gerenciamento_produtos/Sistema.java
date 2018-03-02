package com.devolution.gerenciamento_produtos;

import com.devolution.gerenciamento_produtos.interfaces.Cadastrar_produtos;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author rodrigo.nhsilva
 */
public class Sistema {

    static Cadastrar_produtos cad = new Cadastrar_produtos();

    public List<Produto> listar() throws ClassNotFoundException, SQLException {
        List<Produto> lista = new ArrayList<Produto>();

        //conexão com o banco
        try (Connection conn = Conexao.obterConexao();
                PreparedStatement stmt = conn.prepareStatement("SELECT * FROM PRODUTOBD.PRODUTO");
                ResultSet resultados = stmt.executeQuery();) {

            while (resultados.next()) {
                String nome = resultados.getString("nome");
                String descricao = resultados.getString("descricao");
                double venda = resultados.getDouble("preco_venda");
                double compra = resultados.getDouble("preco_compra");
                int quantidadde = resultados.getInt("quantidade");
                Timestamp data = resultados.getTimestamp("dt_cadastro");
                Produto pro = new Produto();
                pro.setNome(nome);
                pro.setDescricao(descricao);
                pro.setPreco_compra(compra);
                pro.setPreco_venda(venda);
                pro.setQuantidade(quantidadde);
                pro.setTime(data);
                lista.add(pro);
            }
        }
        return lista;
    }

    public void categoriaProduto(Produto produto) {

        try {
            //essa classe ainda não funciona completamente            
            Connection conn = Conexao.obterConexao();
            PreparedStatement pegaID = conn.prepareStatement("SELECT * FROM PRODUTOBD.PRODUTO WHERE NOME = (?) AND DESCRICAO = (?)");
            pegaID.setString(1, produto.getNome());
            pegaID.setString(2, produto.getDescricao());
            ResultSet resultados = pegaID.executeQuery();
            int id = resultados.getInt("id");//o erro acontece nessa linha. Aparentemente a query retorna vazia mesmo colocando dados certos
            produto.setId_produto(id);
            //código que pega o id do produto recém adicionado ao banco
            PreparedStatement stmt = conn.prepareStatement("INSERT INTO PRODUTO_CATEGORIA (PRODUTOBD.PRODUTO.ID,"
                    + " ID_CATEGORIA) VALUES (?, ?)");
            stmt.setInt(1, produto.getId_produto());
            stmt.setInt(2, produto.getId_categoria());
            stmt.execute();
        } catch (ClassNotFoundException ex) {
            System.err.println(ex.getMessage());
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    public void inserir(Produto produto) {
        
        try {
            Connection conn = Conexao.obterConexao();
            PreparedStatement stmt = conn.prepareStatement("INSERT INTO PRODUTOBD.PRODUTO (nome, descricao, preco_compra, preco_venda,"
                    + " quantidade, dt_cadastro) VALUES (?, ?, ?, ?, ?, ?)");
            stmt.setString(1, produto.getNome());
            stmt.setString(2, produto.getDescricao());
            stmt.setDouble(3, produto.getPreco_compra());
            stmt.setDouble(4, produto.getPreco_venda());
            stmt.setInt(5, produto.getQuantidade());
            stmt.setTimestamp(6, produto.getTime());

            stmt.execute();

        } catch (ClassNotFoundException ex) {
            System.err.println(ex.getMessage());
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    public void excluir(int id) throws ClassNotFoundException, SQLException {
        String sql = "Delete from PRODUTO where id = ?";

        try {
            Connection conn = Conexao.obterConexao();
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.execute();

        } catch (SQLException e) {
            System.err.println(e.getMessage());
        } finally {
            Connection conn = (Connection) new Conexao();
            conn.close();
        }
    }
    
    public void editar (Produto produto){
       
        String sql = "UPDATE produto SET  nome = ?, descricao = ?, preco_compra = ?, preco_venda = ?,"
                + " quantidade = ?"
                + " WHERE id = ? ";

        try {
            Connection conn = Conexao.obterConexao();
            PreparedStatement stmt = conn.prepareStatement(sql);
            

            preparedStatement.setString(1, produto.getNome());
            preparedStatement.setString(2, produto.getDescricao());
            preparedStatement.setDouble(3, produto.getPreco_compra());
            preparedStatement.setDouble(4, produto.getPreco_venda());
            preparedStatement.setInt(5, produto.getQuantidade());
            
            stmt.execute();

            //Executa o comando no banco de dados;
            preparedStatement.execute();
        } finally {
            //Se o statement ainda estiver aberto, realiza seu fechamento
            if (preparedStatement != null && !preparedStatement.isClosed()) {
                preparedStatement.close();
            }
            //Se a conexão ainda estiver aberta, realiza seu fechamento
            if (connection != null && !connection.isClosed()) {
                connection.close();
            }
        }
    }

    public static void main(String[] args) {
        //listar as categorias dos produtos da lista
        cad.main();
    }
}