/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.game.gui;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JTextPane;


/**
 *
 * @author caiop
 */
public class Cadastro_Conta extends javax.swing.JPanel {

    /**
     * Creates new form Login
     */
    public Cadastro_Conta() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_Usuario = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt_Senha1 = new javax.swing.JPasswordField();
        btn_Limpar = new javax.swing.JButton();
        btn_Entrar = new javax.swing.JButton();
        btn_Voltar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        cbox_Raca = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtp_Bonus = new javax.swing.JTextPane();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt_Senha2 = new javax.swing.JPasswordField();

        setMaximumSize(new java.awt.Dimension(1500, 800));
        setMinimumSize(new java.awt.Dimension(1500, 800));
        setPreferredSize(new java.awt.Dimension(1500, 800));

        jPanel1.setBackground(new java.awt.Color(96, 153, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(20, 20, 20, 20, new java.awt.Color(64, 81, 59)));

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 2, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(237, 241, 214));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Cadastro de Conta");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(237, 241, 214));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Usuario");

        txt_Usuario.setBackground(new java.awt.Color(96, 153, 102));
        txt_Usuario.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        txt_Usuario.setForeground(new java.awt.Color(237, 241, 214));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(237, 241, 214));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Conf Senha");

        txt_Senha1.setBackground(new java.awt.Color(96, 153, 102));
        txt_Senha1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        txt_Senha1.setForeground(new java.awt.Color(237, 241, 214));

        btn_Limpar.setBackground(new java.awt.Color(96, 153, 102));
        btn_Limpar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_Limpar.setForeground(new java.awt.Color(237, 241, 214));
        btn_Limpar.setText("Limpar");

        btn_Entrar.setBackground(new java.awt.Color(96, 153, 102));
        btn_Entrar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_Entrar.setForeground(new java.awt.Color(237, 241, 214));
        btn_Entrar.setText("Salvar");

        btn_Voltar.setBackground(new java.awt.Color(96, 153, 102));
        btn_Voltar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_Voltar.setForeground(new java.awt.Color(237, 241, 214));
        btn_Voltar.setText("Voltar");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(237, 241, 214));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Bonus");

        cbox_Raca.setBackground(new java.awt.Color(96, 153, 102));
        cbox_Raca.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        cbox_Raca.setForeground(new java.awt.Color(237, 241, 214));
        cbox_Raca.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Humano", "Besta", "Anao", "Elfo", "Demonio" }));

        txtp_Bonus.setBackground(new java.awt.Color(96, 153, 102));
        txtp_Bonus.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtp_Bonus.setForeground(new java.awt.Color(237, 241, 214));
        txtp_Bonus.setText("ola");
        jScrollPane1.setViewportView(txtp_Bonus);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(237, 241, 214));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Raca");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(237, 241, 214));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Senha");

        txt_Senha2.setBackground(new java.awt.Color(96, 153, 102));
        txt_Senha2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        txt_Senha2.setForeground(new java.awt.Color(237, 241, 214));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbox_Raca, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txt_Senha1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(btn_Limpar, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(btn_Entrar, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(txt_Senha2, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(395, 395, 395)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 83, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_Voltar, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbox_Raca, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addGap(123, 123, 123)
                        .addComponent(btn_Voltar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_Senha1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_Senha2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_Limpar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_Entrar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 153, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    public JButton getBtn_Entrar() {
        return btn_Entrar;
    }

    public void setBtn_Entrar(JButton btn_Entrar) {
        this.btn_Entrar = btn_Entrar;
    }

    public JButton getBtn_Limpar() {
        return btn_Limpar;
    }

    public void setBtn_Limpar(JButton btn_Limpar) {
        this.btn_Limpar = btn_Limpar;
    }

    public JButton getBtn_Voltar() {
        return btn_Voltar;
    }

    public void setBtn_Voltar(JButton btn_Voltar) {
        this.btn_Voltar = btn_Voltar;
    }

    public JPasswordField getTxt_Senha1() {
        return txt_Senha1;
    }

    public void setTxt_Senha1(JPasswordField txt_Senha1) {
        this.txt_Senha1 = txt_Senha1;
    }

    public JPasswordField getTxt_Senha2() {
        return txt_Senha2;
    }

    public void setTxt_Senha2(JPasswordField txt_Senha2) {
        this.txt_Senha2 = txt_Senha2;
    }

    public JTextField getTxt_Usuario() {
        return txt_Usuario;
    }

    public void setTxt_Usuario(JTextField txt_Usuario) {
        this.txt_Usuario = txt_Usuario;
    }

    public JTextPane getTxtp_Bonus() {
        return txtp_Bonus;
    }

    public void setTxtp_Bonus(JTextPane txtp_Bonus) {
        this.txtp_Bonus = txtp_Bonus;
    }

    public JComboBox<String> getCbox_Raca() {
        return cbox_Raca;
    }

    public void setCbox_Raca(JComboBox<String> cbox_Raca) {
        this.cbox_Raca = cbox_Raca;
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Entrar;
    private javax.swing.JButton btn_Limpar;
    private javax.swing.JButton btn_Voltar;
    private javax.swing.JComboBox<String> cbox_Raca;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPasswordField txt_Senha1;
    private javax.swing.JPasswordField txt_Senha2;
    private javax.swing.JTextField txt_Usuario;
    private javax.swing.JTextPane txtp_Bonus;
    // End of variables declaration//GEN-END:variables
}
