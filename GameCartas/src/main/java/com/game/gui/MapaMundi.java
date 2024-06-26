/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.game.gui;

import com.game.model.Usuario;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author caiop
 */
public class MapaMundi extends javax.swing.JPanel {

    /**
     * Creates new form Login
     */
    
    public MapaMundi() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ImageIcon icone = new ImageIcon(getClass().getResource("/Img/MapaMundi.png"));
        Image img = icone.getImage();
        jDesktopPane1 = new javax.swing.JDesktopPane(){
            public void paintComponent(Graphics g){
                g.drawImage(img,0,0,getWidth(),getHeight(),this);
            }
        };
        btn_Nivel1 = new javax.swing.JButton();

        setMaximumSize(new java.awt.Dimension(1200, 720));
        setMinimumSize(new java.awt.Dimension(1200, 720));
        setPreferredSize(new java.awt.Dimension(1200, 720));

        jDesktopPane1.setMaximumSize(new java.awt.Dimension(1200, 720));
        jDesktopPane1.setMinimumSize(new java.awt.Dimension(1200, 720));
        jDesktopPane1.setPreferredSize(new java.awt.Dimension(1200, 720));

        btn_Nivel1.setBackground(new java.awt.Color(96, 153, 102));
        btn_Nivel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_Nivel1.setForeground(new java.awt.Color(237, 241, 214));
        btn_Nivel1.setText("Nivel 1");

        jDesktopPane1.setLayer(btn_Nivel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(367, 367, 367)
                .addComponent(btn_Nivel1)
                .addContainerGap(743, Short.MAX_VALUE))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap(563, Short.MAX_VALUE)
                .addComponent(btn_Nivel1)
                .addGap(125, 125, 125))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        getAccessibleContext().setAccessibleName("1200");
        getAccessibleContext().setAccessibleDescription("720");
    }// </editor-fold>//GEN-END:initComponents

    public JButton getBtn_Nivel1() {
        return btn_Nivel1;
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Nivel1;
    private javax.swing.JDesktopPane jDesktopPane1;
    // End of variables declaration//GEN-END:variables
}
