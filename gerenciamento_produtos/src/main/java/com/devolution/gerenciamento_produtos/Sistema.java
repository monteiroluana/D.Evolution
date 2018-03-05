package com.devolution.gerenciamento_produtos;

import com.devolution.gerenciamento_produtos.interfaces.Cadastrar_produtos;
import java.sql.Connection;
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

    public void inserirCatProd(int idProd, int idCat) {

        try {
            Connection conn = Conexao.obterConexao();
            PreparedStatement stmt = conn.prepareStatement("INSERT INTO PRODUTO_CATEGORIA (id_produto, id_categoria)"
                    + "Values(?, ?)");
            stmt.setInt(1, idProd);
            stmt.setInt(2, idCat);
            stmt.execute();
            
        } catch (ClassNotFoundException | SQLException ex) {
            System.err.println(ex.getMessage());
        }
    }
    
    
    public void inserir(Produto produto) throws SQLException {
        
        int chaveGerada = 0;

        String sql = "INSERT INTO PRODUTOBD.PRODUTO (nome, descricao, preco_compra, preco_venda,"
                + " quantidade, dt_cadastro) VALUES (?, ?, ?, ?, ?, ?)";
        
         Connection conn = null;

        try {
            conn = Conexao.obterConexao();
            PreparedStatement stmt = conn.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);

            stmt.setString(1, produto.getNome());
            stmt.setString(2, produto.getDescricao());
            stmt.setDouble(3, produto.getPreco_compra());
            stmt.setDouble(4, produto.getPreco_venda());
            stmt.setInt(5, produto.getQuantidade());
            stmt.setTimestamp(6, produto.getTime());

            stmt.execute();
            
            //Recuperando a chave gerada
            ResultSet rs = stmt.getGeneratedKeys();
            
            if(rs.next()){
            chaveGerada = rs.getInt(1);
            }
            
            produto.setId_categoria(chaveGerada);
            
            //método para inserir na tabela produto_Categoria
            inserirCatProd(produto.getId_produto(), produto.getId_categoria());                                                
            

        } catch (ClassNotFoundException | SQLException ex) {
            System.err.println(ex.getMessage());
            
        } finally {
            conn.close();
        }
    }

    public void editar(Produto produto) throws ClassNotFoundException, SQLException {

        String sql = "UPDATE produto SET  nome = ?, descricao = ?, preco_compra = ?, preco_venda = ?,"
                + " quantidade = ?"
                + " WHERE id = ?";
        
        Connection conn = null;

        try {
            conn = Conexao.obterConexao();
            PreparedStatement stmt = conn.prepareStatement(sql);

            stmt.setString(1, produto.getNome());
            stmt.setString(2, produto.getDescricao());
            stmt.setDouble(3, produto.getPreco_compra());
            stmt.setDouble(4, produto.getPreco_venda());
            stmt.setInt(5, produto.getQuantidade());
            stmt.setInt(6, produto.getId_produto());

            stmt.executeUpdate();

        } catch (SQLException e) {
            System.err.println(e.getMessage());

        } finally {
            conn.close();
        }
    }

    public void excluir(Produto produto) throws ClassNotFoundException, SQLException {
        String sql = "Delete from PRODUTO where id = ?";
        
        Connection conn = null;

        try {
            conn = Conexao.obterConexao();
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, produto.getId_produto());
            stmt.execute();

        } catch (SQLException e) {
            System.err.println(e.getMessage());
        } finally {
            conn.close();
        }
    }

    public static void main(String[] args) {
        //listar as categorias dos produtos da lista
        cad.main();
    }
}
