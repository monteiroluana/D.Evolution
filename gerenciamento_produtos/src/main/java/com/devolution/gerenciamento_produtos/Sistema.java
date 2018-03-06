package com.devolution.gerenciamento_produtos;

import com.devolution.gerenciamento_produtos.interfaces.CadastrarConsultarProduto;
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

    static CadastrarConsultarProduto cad = new CadastrarConsultarProduto();

    public List<Produto> listar() throws ClassNotFoundException, SQLException {
        List<Produto> lista = new ArrayList<Produto>();

        //conexão com o banco
        try (Connection conn = Conexao.obterConexao();
                PreparedStatement stmt = conn.prepareStatement("SELECT * FROM PRODUTOBD.PRODUTO");
                ResultSet resultados = stmt.executeQuery();) {

            while (resultados.next()) {
                Integer id = resultados.getInt("id");
                String nome = resultados.getString("nome");
                String descricao = resultados.getString("descricao");
                double venda = resultados.getDouble("preco_venda");
                double compra = resultados.getDouble("preco_compra");
                int quantidadde = resultados.getInt("quantidade");
                Timestamp data = resultados.getTimestamp("dt_cadastro");

                Produto pro = new Produto();
                pro.setIdProduto(id);
                pro.setNome(nome);
                pro.setDescricao(descricao);
                pro.setPrecoCompra(compra);
                pro.setPrecoVenda(venda);
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
                    + "VALUES(?, ?)");
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
            stmt.setDouble(3, produto.getPrecoCompra());
            stmt.setDouble(4, produto.getPrecoVenda());
            stmt.setInt(5, produto.getQuantidade());
            stmt.setTimestamp(6, produto.getTime());

            stmt.execute();

            //Recuperando a chave gerada
            ResultSet rs = stmt.getGeneratedKeys();

            if (rs.next()) {
                chaveGerada = rs.getInt(1);
            }

            produto.setIdCategoria(chaveGerada);

            //método para inserir na tabela produto_Categoria
            inserirCatProd(chaveGerada, produto.getIdCategoria()); //alterado getIdProduto para chaveGerada

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
            stmt.setDouble(3, produto.getPrecoCompra());
            stmt.setDouble(4, produto.getPrecoVenda());
            stmt.setInt(5, produto.getQuantidade());
            stmt.setInt(6, produto.getIdProduto());

            stmt.executeUpdate();

        } catch (SQLException e) {
            System.err.println(e.getMessage());

        } finally {
            conn.close();
        }
    }

    public void excluir(int id) throws ClassNotFoundException, SQLException {
        String sql = "Delete from PRODUTO where id = ?";

        Connection conn = null;

        try {
            conn = Conexao.obterConexao();
            PreparedStatement stmt = conn.prepareStatement(sql);
//            stmt.setInt(1, produto.getId_produto());
            stmt.setInt(1, id);
            stmt.execute();

        } catch (SQLException e) {
            System.err.println(e.getMessage());
        } finally {
            conn.close();
        }
    }

    public static Produto obter(Integer id) throws SQLException, Exception {

        String sql = "SELECT * FROM PRODUTOBD.PRODUTO WHERE id = ?";
        Connection conn = null;

        try {
            conn = Conexao.obterConexao();
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, id);

            ResultSet resultados = stmt.executeQuery();
            Produto pro = new Produto();
            {

                while (resultados.next()) {
                    String nome = resultados.getString("nome");
                    String descricao = resultados.getString("descricao");
                    double venda = resultados.getDouble("preco_venda");
                    double compra = resultados.getDouble("preco_compra");
                    int quantidadde = resultados.getInt("quantidade");
                    Timestamp data = resultados.getTimestamp("dt_cadastro");

                    pro.setNome(nome);
                    pro.setDescricao(descricao);
                    pro.setPrecoCompra(compra);
                    pro.setPrecoVenda(venda);
                    pro.setQuantidade(quantidadde);
                    pro.setTime(data);
                }
            }
            System.out.println("Sistema>Obter>produto " + pro.getNome());
            return pro;

        } catch (SQLException e) {
            System.err.println(e.getMessage());

        }
        return null;
    }

    public static void main(String[] args) {
        //listar as categorias dos produtos da lista
        cad.main();
    }
}
