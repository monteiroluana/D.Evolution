/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.devolution.gerenciamento_produtos.interfaces;

import com.devolution.gerenciamento_produtos.Produto;
import com.devolution.gerenciamento_produtos.Sistema;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
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
        
        //faz com que a coluna do ID não seja mostrada ao usuário
        tabela.getColumnModel().getColumn(0).setMinWidth(0);
        tabela.getColumnModel().getColumn(0).setMaxWidth(0);
        tabela.getColumnModel().getColumn(0).setWidth(0);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane2 = new javax.swing.JTabbedPane();
        tabbedMain = new javax.swing.JTabbedPane();
        panelVisualizar = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        buttonExcluir = new javax.swing.JButton();
        buttonEditar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        buttonPesquisar = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        panelCadastro = new javax.swing.JPanel();
        lblNome = new javax.swing.JLabel();
        fieldNome = new javax.swing.JTextField();
        lblQntd = new javax.swing.JLabel();
        fieldQntd = new javax.swing.JTextField();
        panelCategoria6 = new javax.swing.JPanel();
        cat1 = new javax.swing.JCheckBox();
        cat4 = new javax.swing.JCheckBox();
        cat2 = new javax.swing.JCheckBox();
        cat3 = new javax.swing.JCheckBox();
        cat5 = new javax.swing.JCheckBox();
        lblDescricao = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        fieldDescricao = new javax.swing.JTextArea();
        panelValores = new javax.swing.JPanel();
        lblCompra = new javax.swing.JLabel();
        fieldPrecoCompra = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        lblVenda = new javax.swing.JLabel();
        fieldPrecoVenda = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        buttonSalvar = new javax.swing.JButton();
        buttonCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nome", "Descrição", "Compra (R$)", "Venda (R$)", "Quantidade", "Data"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
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

        buttonExcluir.setText("Excluir");
        buttonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonExcluirActionPerformed(evt);
            }
        });

        buttonEditar.setText("Editar");
        buttonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEditarActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Pesquisar Produto"));

        buttonPesquisar.setText("Pesquisar");
        buttonPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPesquisarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(buttonPesquisar)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonPesquisar)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jLabel1.setText("Logo");

        javax.swing.GroupLayout panelVisualizarLayout = new javax.swing.GroupLayout(panelVisualizar);
        panelVisualizar.setLayout(panelVisualizarLayout);
        panelVisualizarLayout.setHorizontalGroup(
            panelVisualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelVisualizarLayout.createSequentialGroup()
                .addGroup(panelVisualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelVisualizarLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 478, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelVisualizarLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(buttonEditar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(buttonExcluir))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelVisualizarLayout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        panelVisualizarLayout.setVerticalGroup(
            panelVisualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelVisualizarLayout.createSequentialGroup()
                .addGroup(panelVisualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelVisualizarLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelVisualizarLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jLabel1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelVisualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonEditar)
                    .addComponent(buttonExcluir))
                .addContainerGap())
        );

        tabbedMain.addTab("Gerenciar/ Visualizar Produtos", panelVisualizar);

        lblNome.setText("Nome");

        lblQntd.setText("Quantidade");

        panelCategoria6.setBorder(javax.swing.BorderFactory.createTitledBorder("Categoria"));

        cat1.setText("1");

        cat4.setText("4");

        cat2.setText("2");

        cat3.setText("3");

        cat5.setText("5");

        javax.swing.GroupLayout panelCategoria6Layout = new javax.swing.GroupLayout(panelCategoria6);
        panelCategoria6.setLayout(panelCategoria6Layout);
        panelCategoria6Layout.setHorizontalGroup(
            panelCategoria6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCategoria6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelCategoria6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cat1)
                    .addComponent(cat2)
                    .addComponent(cat3)
                    .addComponent(cat4)
                    .addComponent(cat5))
                .addContainerGap(77, Short.MAX_VALUE))
        );
        panelCategoria6Layout.setVerticalGroup(
            panelCategoria6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCategoria6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cat1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cat2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cat3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cat4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cat5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lblDescricao.setText("Descrição");

        fieldDescricao.setColumns(20);
        fieldDescricao.setRows(5);
        jScrollPane1.setViewportView(fieldDescricao);

        panelValores.setBorder(javax.swing.BorderFactory.createTitledBorder("Valores"));

        lblCompra.setText("Compra");

        lblVenda.setText("Venda");

        jLabel6.setText("R$");

        javax.swing.GroupLayout panelValoresLayout = new javax.swing.GroupLayout(panelValores);
        panelValores.setLayout(panelValoresLayout);
        panelValoresLayout.setHorizontalGroup(
            panelValoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelValoresLayout.createSequentialGroup()
                .addGroup(panelValoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelValoresLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(fieldPrecoCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelValoresLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(lblCompra)))
                .addGroup(panelValoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelValoresLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                        .addComponent(jLabel6)
                        .addGap(37, 37, 37))
                    .addGroup(panelValoresLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(panelValoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(panelValoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelValoresLayout.createSequentialGroup()
                        .addComponent(fieldPrecoVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelValoresLayout.createSequentialGroup()
                        .addComponent(lblVenda)
                        .addGap(47, 47, 47))))
        );
        panelValoresLayout.setVerticalGroup(
            panelValoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelValoresLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelValoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelValoresLayout.createSequentialGroup()
                        .addGroup(panelValoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblVenda)
                            .addComponent(lblCompra))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelValoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fieldPrecoCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fieldPrecoVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelValoresLayout.createSequentialGroup()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(25, 25, 25))
        );

        buttonSalvar.setText("Salvar");
        buttonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSalvarActionPerformed(evt);
            }
        });

        buttonCancelar.setText("Cancelar");

        javax.swing.GroupLayout panelCadastroLayout = new javax.swing.GroupLayout(panelCadastro);
        panelCadastro.setLayout(panelCadastroLayout);
        panelCadastroLayout.setHorizontalGroup(
            panelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCadastroLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(panelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelValores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblDescricao)
                    .addComponent(jScrollPane1)
                    .addGroup(panelCadastroLayout.createSequentialGroup()
                        .addGroup(panelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNome)
                            .addComponent(fieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 37, Short.MAX_VALUE)
                        .addGroup(panelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fieldQntd, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblQntd))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(panelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCadastroLayout.createSequentialGroup()
                        .addComponent(panelCategoria6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCadastroLayout.createSequentialGroup()
                        .addGroup(panelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(buttonCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
                            .addComponent(buttonSalvar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(43, 43, 43))))
        );
        panelCadastroLayout.setVerticalGroup(
            panelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCadastroLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(panelCategoria6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(buttonSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(buttonCancelar)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(panelCadastroLayout.createSequentialGroup()
                .addGap(0, 23, Short.MAX_VALUE)
                .addGroup(panelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblQntd, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblNome, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fieldQntd))
                .addGap(18, 18, 18)
                .addComponent(lblDescricao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(panelValores, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );

        tabbedMain.addTab("Cadastrar Produtos", panelCadastro);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tabbedMain, javax.swing.GroupLayout.PREFERRED_SIZE, 503, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tabbedMain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonExcluirActionPerformed
       //ARRUMAR

//Verifica se há itens selecionados para exclusão.
        //Caso negativo, ignora o comando
        if (tabela.getSelectedRow() >= 0) {

            //Obtém a linha do item selecionado
            final int row = tabela.getSelectedRow();

            //Obtém o nome do produto da linha indicada para exibição
            //de mensagem de confirmação de exclusão utilizando seu número
            String produto = (String) tabela.getValueAt(row, 2);

            //Mostra o diálogo de confirmação de exclusão
            int resposta = JOptionPane.showConfirmDialog(rootPane,
                    "Excluir o produto \"" + produto + "\"?",
                    "Confirmar exclusão", JOptionPane.YES_NO_OPTION);

            //Se o valor de resposta for "Sim" para a exclusão
            if (resposta == JOptionPane.YES_OPTION) {
                try {
                    //Obtém o ID do produto
                    Integer id = (Integer) tabela.getValueAt(row, 0);

                    //Solicita ao serviço a inativação do produto com o ID
               //     ServicoProduto.excluirProduto(id);

                    //Atualiza a lista após a "exclusão"
                    this.atualizaTabela();

                } catch (Exception e) {
                    //Se ocorrer algum erro técnico, mostra-o no console,
                    //mas esconde-o do usuário
                    e.printStackTrace();

                    //Exibe uma mensagem de erro genérica ao usuário
                    JOptionPane.showMessageDialog(rootPane, e.getMessage(),
                            "Falha na Exclusão", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }//GEN-LAST:event_buttonExcluirActionPerformed

    private void buttonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEditarActionPerformed
        //ARRUMAR PARA CHAMAR PANEL
        
        try {
            //Obtém a linha selecionada da tabela de resultados
            final int row = tabela.getSelectedRow();

            //Obtém o valor do ID da coluna "ID" da tabela de resultados
            Integer id = (Integer) tabela.getValueAt(row, 0);

            //Com o ID da coluna, chama o serviço de produto para
            //obter o produto com dados atualizados do mock
            Produto jogo = ServicoProduto.obterProduto(id);

            //Cria uma nova instância da tela de edição,
            //configura o produto selecionado como elemento a
            //ser editado e mostra a tela de edição.
            //Para exibir a tela, é necessário adicioná-la ao
            //componente de desktop, o "pai" da janela corrente
            formEditarJogo.dispose();
            formEditarJogo = new FormEditarJogo();
            formEditarJogo.setProduto(jogo);
            formEditarJogo.setTitle(jogo.getNome());
            this.getParent().add(formEditarJogo);
            this.openFrameInCenter(formEditarJogo);
            formEditarJogo.toFront();

        } catch (Exception e) {
            //Se ocorrer algum erro técnico, mostra-o no console,
            //mas esconde-o do usuário
            e.printStackTrace();

            //Exibe uma mensagem de erro genérica ao usuário
            JOptionPane.showMessageDialog(rootPane, "Não é possível "
                    + "exibir os detalhes deste produto.",
                    "Erro ao abrir detalhe", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_buttonEditarActionPerformed

    private void buttonPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPesquisarActionPerformed
    //NESCESSÁRIO IMPLEMENTAR PESQUISA/ CONSULTA DE PRODUTOS E LISTAGEM
    }//GEN-LAST:event_buttonPesquisarActionPerformed

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
        pro.setQuantidade(Integer.parseInt(fieldQntd.getText()));
        
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
        fieldQntd.setText("");
        //---------------------------
    }//GEN-LAST:event_buttonSalvarActionPerformed

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
    private javax.swing.JButton buttonCancelar;
    private javax.swing.JButton buttonEditar;
    private javax.swing.JButton buttonExcluir;
    private javax.swing.JButton buttonPesquisar;
    private javax.swing.JButton buttonSalvar;
    private javax.swing.JCheckBox cat1;
    private javax.swing.JCheckBox cat2;
    private javax.swing.JCheckBox cat3;
    private javax.swing.JCheckBox cat4;
    private javax.swing.JCheckBox cat5;
    private javax.swing.JTextArea fieldDescricao;
    private javax.swing.JTextField fieldNome;
    private javax.swing.JTextField fieldPrecoCompra;
    private javax.swing.JTextField fieldPrecoVenda;
    private javax.swing.JTextField fieldQntd;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lblCompra;
    private javax.swing.JLabel lblDescricao;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblQntd;
    private javax.swing.JLabel lblVenda;
    private javax.swing.JPanel panelCadastro;
    private javax.swing.JPanel panelCategoria6;
    private javax.swing.JPanel panelValores;
    private javax.swing.JPanel panelVisualizar;
    private javax.swing.JTabbedPane tabbedMain;
    static javax.swing.JTable tabela;
    // End of variables declaration//GEN-END:variables
}
