package com.d.evolution.gerenciamento_produtos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author rodrigo.nhsilva
 */
public class Sistema {

    //conexão com o banco
    private Connection obterConexao() throws ClassNotFoundException, SQLException {

        Class.forName("com.mysql.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/PRODUTOBD", "root", "");
        return conn;
    }

    public List<Categoria> listar() throws ClassNotFoundException, SQLException {
        List<Categoria> lista = new ArrayList<Categoria>();

        try (Connection conn = obterConexao();
                PreparedStatement stmt = conn.prepareStatement("SELECT * FROM PRODUTOBD.CATEGORIA");
                ResultSet resultados = stmt.executeQuery();) {
            while (resultados.next()) {
                int id = resultados.getInt("id");
                String nome = resultados.getString("nome");
                Categoria ca = new Categoria();
                ca.setId(id);
                ca.setNome(nome);

                lista.add(ca);
            }
        }
        return lista;
    }
    
    public void inserir ()throws ClassNotFoundException, SQLException{
    try (Connection conn = obterConexao();
                PreparedStatement stmt = conn.prepareStatement("INSERT INTO PRODUTOBD.PRODUTO (nome, descricao, preco_compra, preco_venda,"
                        + " quantidade, dt_cadastro VALUES (?, ?, ?, ?, ?, ?))");
                ResultSet resultados = stmt.executeQuery();){}
    
    }

    public static void main(String[] args){
        //listar as categorias dos produtos da lista
        Sistema sistema = new Sistema();
        try {
            List<Categoria> lista = sistema.listar();
            for (Categoria ca : lista) {
                System.out.println(ca.getId() + ", " + ca.getNome());
            }
        }catch (ClassNotFoundException ex ){
            System.err.println(ex.getMessage());
        }catch (SQLException e){
            System.err.println(e.getMessage());
        }
    }
}
