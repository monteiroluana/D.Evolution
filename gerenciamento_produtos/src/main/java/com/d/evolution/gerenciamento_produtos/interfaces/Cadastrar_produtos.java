/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.d.evolution.gerenciamento_produtos.interfaces;

import com.d.evolution.gerenciamento_produtos.Produto;
import com.d.evolution.gerenciamento_produtos.Sistema;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author luana.mpereira5
 */
public class Cadastrar_produtos extends javax.swing.JFrame {

    static Sistema sis = new Sistema();

    /**
     * Creates new form Cadastrar_produtos
     */
    public Cadastrar_produtos() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane2 = new javax.swing.JTabbedPane();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        atualizarButton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        fieldNome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        fieldDescricao = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        fieldPrecoCompra = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        fieldPrecoVenda = new javax.swing.JTextField();
        fieldQuantidade = new javax.swing.JTextField();
        buttonSalvar = new javax.swing.JToggleButton();
        jLabel6 = new javax.swing.JLabel();
        cat1 = new javax.swing.JCheckBox();
        cat2 = new javax.swing.JCheckBox();
        cat3 = new javax.swing.JCheckBox();
        cat4 = new javax.swing.JCheckBox();
        cat5 = new javax.swing.JCheckBox();
        jTabbedPane3 = new javax.swing.JTabbedPane();
        jTabbedPane4 = new javax.swing.JTabbedPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null}
            },
            new String [] {
                "Nome", "Descrição", "Compra", "Venda", "Quantidade", "Data"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabela.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(tabela);
        if (tabela.getColumnModel().getColumnCount() > 0) {
            tabela.getColumnModel().getColumn(0).setResizable(false);
            tabela.getColumnModel().getColumn(1).setResizable(false);
            tabela.getColumnModel().getColumn(2).setResizable(false);
            tabela.getColumnModel().getColumn(3).setResizable(false);
            tabela.getColumnModel().getColumn(4).setResizable(false);
            tabela.getColumnModel().getColumn(5).setResizable(false);
        }

        atualizarButton.setText("Atualizar");
        atualizarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atualizarButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(atualizarButton)
                .addContainerGap())
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 423, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(atualizarButton))
        );

        jTabbedPane1.addTab("Visualizar  Produtos", jPanel3);

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setText("Nome");

        jLabel2.setText("Descrição");

        fieldDescricao.setColumns(20);
        fieldDescricao.setRows(5);
        jScrollPane1.setViewportView(fieldDescricao);

        jLabel3.setText("Quantidade");

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Valores", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N

        jLabel4.setText("Compra");

        jLabel5.setText("Venda");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(fieldPrecoCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(fieldPrecoVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fieldPrecoCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fieldPrecoVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        buttonSalvar.setText("Salvar");
        buttonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSalvarActionPerformed(evt);
            }
        });

        jLabel6.setText("Categoria");

        cat1.setText("1");

        cat2.setText("2");

        cat3.setText("3");

        cat4.setText("4");

        cat5.setText("5");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(fieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel1))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3)
                                .addComponent(fieldQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(cat1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(cat2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(cat3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(cat4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(cat5)))
                            .addGap(0, 0, Short.MAX_VALUE)))
                    .addComponent(jLabel6))
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(buttonSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(fieldQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cat1)
                            .addComponent(cat2)
                            .addComponent(cat3)
                            .addComponent(cat4)
                            .addComponent(cat5))
                        .addGap(12, 12, 12)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(buttonSalvar)))
                .addGap(35, 35, 35))
        );

        jTabbedPane1.addTab("Cadastrar Produtos", jPanel2);
        jTabbedPane1.addTab("Excluir produtos", jTabbedPane3);
        jTabbedPane1.addTab("Alterar Produtos", jTabbedPane4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 428, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(116, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSalvarActionPerformed
        String categoria = "";
        Timestamp hoje = new Timestamp(System.currentTimeMillis());//armazena a data e hora do sistema
        Produto pro = new Produto();
        Sistema sis = new Sistema();
        //pega os dados dos campos e os adiciona ao objeto pro da classe produto
        pro.setDescricao(fieldDescricao.getText());
        pro.setNome(fieldNome.getText());
        pro.setPreco_compra(Double.parseDouble(fieldPrecoCompra.getText()));
        pro.setPreco_venda(Double.parseDouble(fieldPrecoVenda.getText()));
        pro.setQuantidade(Integer.parseInt(fieldQuantidade.getText()));
        pro.setTime(hoje);
        sis.inserir(pro);
        //----------------------------------------------------------------------

        //código para pegar a categoria
        if (cat1.isSelected()) {
            categoria += " - " + cat1.getText();
        }
        if (cat2.isSelected()) {
            categoria += " - " + cat1.getText();
        }
        if (cat3.isSelected()) {
            categoria += " - " + cat1.getText();
        }
        if (cat4.isSelected()) {
            categoria += " - " + cat1.getText();
        }
        if (cat5.isSelected()) {
            categoria += " - " + cat1.getText();
        }
        /* já que é possível ter mais de uma categoria o programa tem q correr todas as categorias existentes
         * e concatenar as Strings, se o usuário selecionar a categoria 1, 2 e 3 a String categoria ficará "1 - 2 - 3"
         */
        if (!categoria.isEmpty())//se a String NÃO estiver fazia quer dizer o usuário escolheu algo
        {
            pro.setCategoria(categoria);//add a categoria ao objeto
            sis.categoriaProduto(pro); //chama a classe que adiciona a categoria ao banco
        }

        //limpa os campos
        fieldNome.setText("");
        fieldDescricao.setText("");
        fieldPrecoCompra.setText("");
        fieldPrecoVenda.setText("");
        fieldQuantidade.setText("");
        //---------------------------
    }//GEN-LAST:event_buttonSalvarActionPerformed

    private void atualizarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atualizarButtonActionPerformed
        try {
            atualizaTabela();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Cadastrar_produtos.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Cadastrar_produtos.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_atualizarButtonActionPerformed

    static public void atualizaTabela() throws ClassNotFoundException, SQLException {
        //Este método atualiza a tabela com os dados novos
        List<Produto> lista = sis.listar();//o método listar busca todos os produtos no banco e retorna um array cheio deles
        DefaultTableModel model = (DefaultTableModel) tabela.getModel();
        model.setRowCount(0);//zera a tabela para colocar os dados novos
        for (int i = 0; i < lista.size(); i++) {
            Produto pro = lista.get(i);
            if (pro != null) {
                Object[] row = new Object[6];
                row[0] = pro.getNome();
                row[1] = pro.getDescricao();
                row[2] = pro.getPreco_compra();
                row[3] = pro.getPreco_venda();
                row[4] = pro.getQuantidade();
                row[5] = pro.getTime();
                model.addRow(row);
            }
        }
    }

    public static void main() {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Cadastrar_produtos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cadastrar_produtos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cadastrar_produtos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cadastrar_produtos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cadastrar_produtos().setVisible(true);
                try {
                    atualizaTabela();//chamar o método "atualiza tabela" aqui faz com que o programa já se inicie com a tabela criada
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(Cadastrar_produtos.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(Cadastrar_produtos.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton atualizarButton;
    private javax.swing.JToggleButton buttonSalvar;
    private javax.swing.JCheckBox cat1;
    private javax.swing.JCheckBox cat2;
    private javax.swing.JCheckBox cat3;
    private javax.swing.JCheckBox cat4;
    private javax.swing.JCheckBox cat5;
    private javax.swing.JTextArea fieldDescricao;
    private javax.swing.JTextField fieldNome;
    private javax.swing.JTextField fieldPrecoCompra;
    private javax.swing.JTextField fieldPrecoVenda;
    private javax.swing.JTextField fieldQuantidade;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JTabbedPane jTabbedPane4;
    static javax.swing.JTable tabela;
    // End of variables declaration//GEN-END:variables
}
