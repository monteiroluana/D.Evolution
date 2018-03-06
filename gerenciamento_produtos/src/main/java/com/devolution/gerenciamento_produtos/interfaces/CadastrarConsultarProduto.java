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
public class CadastrarConsultarProduto extends javax.swing.JFrame {

    static Sistema sis = new Sistema();
    EditarProduto tela = new EditarProduto();

    /**
     * Creates new form Cadastrar_produtos
     */
    public CadastrarConsultarProduto() {
        initComponents();

        //faz com que a coluna do ID não seja mostrada ao usuário
        tableConsultaProduto.getColumnModel().getColumn(0).setMinWidth(0);
        tableConsultaProduto.getColumnModel().getColumn(0).setMaxWidth(0);
        tableConsultaProduto.getColumnModel().getColumn(0).setWidth(0);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane2 = new javax.swing.JTabbedPane();
        tabbedMain = new javax.swing.JTabbedPane();
        panelConsultar = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableConsultaProduto = new javax.swing.JTable();
        buttonExcluir = new javax.swing.JButton();
        buttonEditar = new javax.swing.JButton();
        panelPesquisar = new javax.swing.JPanel();
        buttonPesquisar = new javax.swing.JButton();
        fieldPesquisar = new javax.swing.JTextField();
        lblLogo = new javax.swing.JLabel();
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

        tableConsultaProduto.setModel(new javax.swing.table.DefaultTableModel(
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
        tableConsultaProduto.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(tableConsultaProduto);
        if (tableConsultaProduto.getColumnModel().getColumnCount() > 0) {
            tableConsultaProduto.getColumnModel().getColumn(0).setResizable(false);
            tableConsultaProduto.getColumnModel().getColumn(1).setResizable(false);
            tableConsultaProduto.getColumnModel().getColumn(2).setResizable(false);
            tableConsultaProduto.getColumnModel().getColumn(3).setResizable(false);
            tableConsultaProduto.getColumnModel().getColumn(4).setResizable(false);
            tableConsultaProduto.getColumnModel().getColumn(5).setResizable(false);
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

        panelPesquisar.setBorder(javax.swing.BorderFactory.createTitledBorder("Pesquisar Produto"));

        buttonPesquisar.setText("Pesquisar");
        buttonPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPesquisarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelPesquisarLayout = new javax.swing.GroupLayout(panelPesquisar);
        panelPesquisar.setLayout(panelPesquisarLayout);
        panelPesquisarLayout.setHorizontalGroup(
            panelPesquisarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPesquisarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(fieldPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(buttonPesquisar)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        panelPesquisarLayout.setVerticalGroup(
            panelPesquisarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPesquisarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelPesquisarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonPesquisar)
                    .addComponent(fieldPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        lblLogo.setText("Logo");

        javax.swing.GroupLayout panelConsultarLayout = new javax.swing.GroupLayout(panelConsultar);
        panelConsultar.setLayout(panelConsultarLayout);
        panelConsultarLayout.setHorizontalGroup(
            panelConsultarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelConsultarLayout.createSequentialGroup()
                .addGroup(panelConsultarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelConsultarLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 562, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelConsultarLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(buttonEditar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(buttonExcluir))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelConsultarLayout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(lblLogo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(panelPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        panelConsultarLayout.setVerticalGroup(
            panelConsultarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelConsultarLayout.createSequentialGroup()
                .addGroup(panelConsultarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelConsultarLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(panelPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelConsultarLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(lblLogo)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelConsultarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonEditar)
                    .addComponent(buttonExcluir))
                .addContainerGap())
        );

        tabbedMain.addTab("Consultar Produtos", panelConsultar);

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(panelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCadastroLayout.createSequentialGroup()
                        .addComponent(panelCategoria6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(111, 111, 111))
                    .addGroup(panelCadastroLayout.createSequentialGroup()
                        .addGroup(panelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(buttonSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
        );
        panelCadastroLayout.setVerticalGroup(
            panelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCadastroLayout.createSequentialGroup()
                .addGap(0, 23, Short.MAX_VALUE)
                .addGroup(panelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCadastroLayout.createSequentialGroup()
                        .addComponent(panelCategoria6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22)
                        .addComponent(buttonSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(buttonCancelar)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panelCadastroLayout.createSequentialGroup()
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
                        .addGap(27, 27, 27))))
        );

        tabbedMain.addTab("Cadastrar Produto", panelCadastro);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tabbedMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tabbedMain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tabbedMain.getAccessibleContext().setAccessibleName("Consultar Produtos");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonExcluirActionPerformed
//OK?

        //Verifica se há itens selecionados para exclusão.
        if (tableConsultaProduto.getSelectedRow() >= 0) {

            //Obtém a linha do item selecionado
            final int row = tableConsultaProduto.getSelectedRow();

            //Obtém o nome do produto da linha indicada para exibição
            //de mensagem de confirmação de exclusão utilizando seu número
            String produto = (String) tableConsultaProduto.getValueAt(row, 2);

            //Mostra o diálogo de confirmação de exclusão
            int resposta = JOptionPane.showConfirmDialog(rootPane,
                    "Excluir o produto \"" + produto + "\"?",
                    "Confirmar exclusão", JOptionPane.YES_NO_OPTION);

            //Se o valor de resposta for "Sim" para a exclusão
            if (resposta == JOptionPane.YES_OPTION) {
                try {
                    //Obtém o ID do produto
                    Integer id = (Integer) tableConsultaProduto.getValueAt(row, 0);

                    //Instânciando a Classe Sistema
                    //Chamando o método de excluir produto;
                    sis.excluir(id);

                    //Atualiza a lista após a "exclusão"
                    atualizaTabela();

                } catch (Exception e) {
                    //Se ocorrer algum erro técnico, mostra-o no console,
                    //mas esconde-o do usuário
                    e.printStackTrace();

                    //Exibe uma mensagem de erro genérica ao usuário
                    JOptionPane.showMessageDialog(rootPane, e.getMessage(),
                            "Falha na Exclusão", JOptionPane.ERROR_MESSAGE);
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "Produto não selecionado!");
        }
    }//GEN-LAST:event_buttonExcluirActionPerformed

    private void buttonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEditarActionPerformed
        //ARRUMAR PARA CHAMAR PANEL

        try {
            //Obtém a linha selecionada da tabela de resultados
            final int row = tableConsultaProduto.getSelectedRow();

            //Obtém o valor do ID da coluna "ID" da tabela de resultados
            Integer id = (Integer) tableConsultaProduto.getValueAt(row, 0);
            //Com o ID da coluna, chama o serviço de produto para
            //obter o produto com dados atualizados do mock
            Produto produto = Sistema.obter(id);
            System.out.println("TelaCadastrar>Editar> ProdutoID> " + id);
            //Cria uma nova instância da tela de edição,
            //configura o produto selecionado como elemento a
            //ser editado e mostra a tela de edição.
            //Para exibir a tela, é necessário adicioná-la ao
            //componente de desktop, o "pai" da janela corrente
            tela.dispose();
            tela = new EditarProduto();
            tela.setProduto(produto);
            tela.setTitle(produto.getNome());
            this.getParent().add(tela);
            tela.toFront();

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
        //NECESSÁRIO IMPLEMENTAR PESQUISA/ CONSULTA DE PRODUTOS E LISTAGEM
        //Solução provisória ... por enquanto ele vai chamar o método atualizar
        try {
            sis.listar();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(CadastrarConsultarProduto.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_buttonPesquisarActionPerformed

    private void buttonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSalvarActionPerformed
        String categoria = "";
        Timestamp hoje = new Timestamp(System.currentTimeMillis());//armazena a data e hora do sistema
        Produto pro = new Produto();

        //pega os dados dos campos e os adiciona ao objeto pro da classe produto
        pro.setDescricao(fieldDescricao.getText());
        pro.setNome(fieldNome.getText());
        pro.setPrecoCompra(Double.parseDouble(fieldPrecoCompra.getText()));
        pro.setPrecoVenda(Double.parseDouble(fieldPrecoVenda.getText()));
        pro.setQuantidade(Integer.parseInt(fieldQntd.getText()));

        pro.setTime(hoje);
        try {
            sis.inserir(pro);

            System.out.println("jcheckbox: " + cat1);

            //código para pegar a categoria
            if (cat1.isSelected()) {

                //converte jcheckbox para string e dps para int
                //pro.setCategoria(Integer.parseInt(cat1.toString()));
                //categoria += " - " + cat1.getText();
            }
            if (cat2.isSelected()) {
                pro.setCategoria(Integer.parseInt(cat2.toString()));
                //categoria += " - " + cat1.getText();
            }
            if (cat3.isSelected()) {
                pro.setCategoria(Integer.parseInt(cat3.toString()));
                //categoria += " - " + cat1.getText();
            }
            if (cat4.isSelected()) {
                pro.setCategoria(Integer.parseInt(cat4.toString()));
                //categoria += " - " + cat1.getText();
            }
            if (cat5.isSelected()) {
                pro.setCategoria(Integer.parseInt(cat5.toString()));
                //categoria += " - " + cat1.getText();
            }

            /* já que é possível ter mais de uma categoria o programa tem q correr todas as categorias existentes
         * e concatenar as Strings, se o usuário selecionar a categoria 1, 2 e 3 a String categoria ficará "1 - 2 - 3"
             */
//        if (!categoria.isEmpty())//se a String NÃO estiver fazia quer dizer o usuário escolheu algo
//        {
//            pro.setCategoria(categoria);//add a categoria ao objeto
            sis.inserirCatProd(pro.getIdProduto(), pro.getIdCategoria()); //chama a classe que adiciona a categoria ao banco
//        }

        } catch (SQLException ex) {
            Logger.getLogger(CadastrarConsultarProduto.class.getName()).log(Level.SEVERE, null, ex);
        }

        //limpa os campos
        fieldNome.setText("");
        fieldDescricao.setText("");
        fieldPrecoCompra.setText("");
        fieldPrecoVenda.setText("");
        fieldQntd.setText("");

    }//GEN-LAST:event_buttonSalvarActionPerformed

    static public void atualizaTabela() throws ClassNotFoundException, SQLException {
        //Este método atualiza a tabela com os dados novos
        List<Produto> lista = sis.listar();//o método listar busca todos os produtos no banco e retorna um array cheio deles

        DefaultTableModel model = (DefaultTableModel) tableConsultaProduto.getModel();

        model.setRowCount(0);//zera a tabela para colocar os dados novos

        for (int i = 0; i < lista.size(); i++) {
            Produto pro = lista.get(i);
            if (pro != null) {
                Object[] row = new Object[7];
                row[0] = pro.getIdProduto();
                row[1] = pro.getNome();
                row[2] = pro.getDescricao();
                row[3] = pro.getPrecoCompra();
                row[4] = pro.getPrecoVenda();
                row[5] = pro.getQuantidade();
                row[6] = pro.getTime();

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
            java.util.logging.Logger.getLogger(CadastrarConsultarProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastrarConsultarProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastrarConsultarProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastrarConsultarProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastrarConsultarProduto().setVisible(true);
                try {
                    atualizaTabela();//chamar o método "atualiza tabela" aqui faz com que o programa já se inicie com a tabela criada
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(CadastrarConsultarProduto.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(CadastrarConsultarProduto.class.getName()).log(Level.SEVERE, null, ex);
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
    private javax.swing.JTextField fieldPesquisar;
    private javax.swing.JTextField fieldPrecoCompra;
    private javax.swing.JTextField fieldPrecoVenda;
    private javax.swing.JTextField fieldQntd;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JLabel lblCompra;
    private javax.swing.JLabel lblDescricao;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblQntd;
    private javax.swing.JLabel lblVenda;
    private javax.swing.JPanel panelCadastro;
    private javax.swing.JPanel panelCategoria6;
    private javax.swing.JPanel panelConsultar;
    private javax.swing.JPanel panelPesquisar;
    private javax.swing.JPanel panelValores;
    private javax.swing.JTabbedPane tabbedMain;
    static javax.swing.JTable tableConsultaProduto;
    // End of variables declaration//GEN-END:variables
}
