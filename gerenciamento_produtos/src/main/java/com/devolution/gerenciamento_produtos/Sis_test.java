/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.devolution.gerenciamento_produtos;

import java.sql.SQLException;

/**
 *
 * @author Jonas
 */
public class Sis_test {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        
        Sistema s = new Sistema();
        Produto p1 = new Produto();
        
        p1.setNome("Produto 1");
        p1.setDescricao("Para maiores");
        p1.setCategoria("Cat um");
        p1.setId_produto(2);
        p1.setPreco_compra(50.0);
        p1.setPreco_venda(75.0);
        p1.setQuantidade(90);
        
//        s.inserir(p1);
        
        p1.setNome("produto extra");
        p1.setDescricao("produto alterado");
        
        s.editar(p1);
        
        
        
        
        
        
        
        
        
    }
    
}
