package com.game.gui;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

/**
 *
 * @author caiop
 */
public class Batanha extends javax.swing.JPanel {

    /**
     * Creates new form Batanha
     */
    public Batanha() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1_Fundo = new javax.swing.JPanel();
        jPanel_Cartas = new javax.swing.JPanel();
        btn_Carta2 = new javax.swing.JButton();
        btn_Carta3 = new javax.swing.JButton();
        btn_Carta4 = new javax.swing.JButton();
        btn_Carta5 = new javax.swing.JButton();
        ImageIcon icone = new ImageIcon(getClass().getResource("/Img/Mana.png"));
        Image img = icone.getImage();
        jDesktopPane1 = new javax.swing.JDesktopPane(){
            public void paintComponent(Graphics g){
                g.drawImage(img,0,0,getWidth(),getHeight(),this);
            }
        };
        jDesktopPane1 = new javax.swing.JDesktopPane();
        lbl_Mana = new javax.swing.JLabel();
        btn_Voltar = new javax.swing.JButton();
        btn_Jogar = new javax.swing.JButton();
        btn_Carta1 = new javax.swing.JButton();
        jPanel_Lateral_Player = new javax.swing.JPanel();
        lbl_Img_Usuario = new javax.swing.JLabel();
        lbl_Usu = new javax.swing.JLabel();
        lbl_Vida_Usuario = new javax.swing.JLabel();
        jPanel_Campo = new javax.swing.JPanel();
        lbl_Campo_NPC1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lbl_Vida_Npc1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lbl_Atk_Npc1 = new javax.swing.JLabel();
        lbl_Campo_NPC2 = new javax.swing.JLabel();
        lbl_Campo_NPC3 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        lbl_Vida_Npc2 = new javax.swing.JLabel();
        lbl_Vida_Npc3 = new javax.swing.JLabel();
        lbl_Atk_Npc2 = new javax.swing.JLabel();
        lbl_Atk_Npc3 = new javax.swing.JLabel();
        lbl_Campo_Ply1 = new javax.swing.JLabel();
        lbl_Campo_Ply2 = new javax.swing.JLabel();
        lbl_Campo_Ply3 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lbl_Vida_Ply1 = new javax.swing.JLabel();
        lbl_Vida_Ply2 = new javax.swing.JLabel();
        lbl_Vida_Ply3 = new javax.swing.JLabel();
        lbl_Atk_Ply2 = new javax.swing.JLabel();
        lbl_Atk_Ply1 = new javax.swing.JLabel();
        lbl_Atk_Ply3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel_Lateral_NPC = new javax.swing.JPanel();
        lbl_Img_Inimigo = new javax.swing.JLabel();
        lbl_Vida_Npc = new javax.swing.JLabel();
        lbl_Npc = new javax.swing.JLabel();

        jPanel1_Fundo.setBackground(new java.awt.Color(34, 40, 49));

        jPanel_Cartas.setBackground(new java.awt.Color(49, 54, 63));

        btn_Carta2.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        btn_Carta2.setText("Vazio");
        btn_Carta2.setEnabled(false);

        btn_Carta3.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        btn_Carta3.setText("Vazio");
        btn_Carta3.setEnabled(false);

        btn_Carta4.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        btn_Carta4.setText("Vazio");
        btn_Carta4.setEnabled(false);

        btn_Carta5.setText("Vazio");
        btn_Carta5.setEnabled(false);

        lbl_Mana.setFont(new java.awt.Font("Rockwell", 1, 48)); // NOI18N
        lbl_Mana.setForeground(new java.awt.Color(118, 171, 174));
        lbl_Mana.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_Mana.setText("5");

        jDesktopPane1.setLayer(lbl_Mana, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_Mana, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addComponent(lbl_Mana, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        btn_Voltar.setBackground(new java.awt.Color(118, 171, 174));
        btn_Voltar.setFont(new java.awt.Font("Rockwell", 0, 24)); // NOI18N
        btn_Voltar.setForeground(new java.awt.Color(238, 238, 238));
        btn_Voltar.setText("Voltar");

        btn_Jogar.setBackground(new java.awt.Color(118, 171, 174));
        btn_Jogar.setFont(new java.awt.Font("Rockwell", 0, 24)); // NOI18N
        btn_Jogar.setForeground(new java.awt.Color(238, 238, 238));
        btn_Jogar.setText("Jogar");

        btn_Carta1.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        btn_Carta1.setText("Vazio");
        btn_Carta1.setEnabled(false);

        javax.swing.GroupLayout jPanel_CartasLayout = new javax.swing.GroupLayout(jPanel_Cartas);
        jPanel_Cartas.setLayout(jPanel_CartasLayout);
        jPanel_CartasLayout.setHorizontalGroup(
            jPanel_CartasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_CartasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(btn_Carta1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_Carta2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_Carta3, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_Carta4, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_Carta5, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel_CartasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_Voltar, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
                    .addComponent(btn_Jogar, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel_CartasLayout.setVerticalGroup(
            jPanel_CartasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_CartasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_CartasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jDesktopPane1)
                    .addComponent(btn_Carta3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_Carta4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_Carta5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel_CartasLayout.createSequentialGroup()
                        .addComponent(btn_Jogar, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_Voltar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btn_Carta2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_Carta1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel_Lateral_Player.setBackground(new java.awt.Color(49, 54, 63));

        lbl_Img_Usuario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(34, 40, 49), 5));

        lbl_Usu.setFont(new java.awt.Font("Rockwell", 1, 24)); // NOI18N
        lbl_Usu.setForeground(new java.awt.Color(118, 171, 174));
        lbl_Usu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_Usu.setText("NPC");

        lbl_Vida_Usuario.setFont(new java.awt.Font("Rockwell", 1, 24)); // NOI18N
        lbl_Vida_Usuario.setForeground(new java.awt.Color(118, 171, 174));
        lbl_Vida_Usuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_Vida_Usuario.setText("100");
        lbl_Vida_Usuario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(34, 40, 49), 5));

        javax.swing.GroupLayout jPanel_Lateral_PlayerLayout = new javax.swing.GroupLayout(jPanel_Lateral_Player);
        jPanel_Lateral_Player.setLayout(jPanel_Lateral_PlayerLayout);
        jPanel_Lateral_PlayerLayout.setHorizontalGroup(
            jPanel_Lateral_PlayerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_Usu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel_Lateral_PlayerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_Lateral_PlayerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_Img_Usuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_Vida_Usuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel_Lateral_PlayerLayout.setVerticalGroup(
            jPanel_Lateral_PlayerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_Lateral_PlayerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_Img_Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_Usu, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(lbl_Vida_Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel_Campo.setBackground(new java.awt.Color(49, 54, 63));

        lbl_Campo_NPC1.setForeground(new java.awt.Color(118, 171, 174));
        lbl_Campo_NPC1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_Campo_NPC1.setText("Vazio");
        lbl_Campo_NPC1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 0, 51), 2));

        jLabel2.setForeground(new java.awt.Color(118, 171, 174));
        jLabel2.setText("Vida:");

        lbl_Vida_Npc1.setForeground(new java.awt.Color(118, 171, 174));
        lbl_Vida_Npc1.setText("10");

        jLabel4.setForeground(new java.awt.Color(118, 171, 174));
        jLabel4.setText("Atk:");

        lbl_Atk_Npc1.setForeground(new java.awt.Color(118, 171, 174));
        lbl_Atk_Npc1.setText("20");

        lbl_Campo_NPC2.setForeground(new java.awt.Color(118, 171, 174));
        lbl_Campo_NPC2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_Campo_NPC2.setText("Vazio");
        lbl_Campo_NPC2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 0, 51), 2));

        lbl_Campo_NPC3.setForeground(new java.awt.Color(118, 171, 174));
        lbl_Campo_NPC3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_Campo_NPC3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 0, 51), 2));

        jLabel12.setForeground(new java.awt.Color(118, 171, 174));
        jLabel12.setText("Vida:");

        jLabel13.setForeground(new java.awt.Color(118, 171, 174));
        jLabel13.setText("Vida:");

        jLabel14.setForeground(new java.awt.Color(118, 171, 174));
        jLabel14.setText("Atk:");

        jLabel15.setForeground(new java.awt.Color(118, 171, 174));
        jLabel15.setText("Atk:");

        lbl_Vida_Npc2.setForeground(new java.awt.Color(118, 171, 174));
        lbl_Vida_Npc2.setText("10");

        lbl_Vida_Npc3.setForeground(new java.awt.Color(118, 171, 174));
        lbl_Vida_Npc3.setText("10");

        lbl_Atk_Npc2.setForeground(new java.awt.Color(118, 171, 174));
        lbl_Atk_Npc2.setText("20");

        lbl_Atk_Npc3.setForeground(new java.awt.Color(118, 171, 174));
        lbl_Atk_Npc3.setText("20");

        lbl_Campo_Ply1.setForeground(new java.awt.Color(118, 171, 174));
        lbl_Campo_Ply1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_Campo_Ply1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 153), 2));

        lbl_Campo_Ply2.setForeground(new java.awt.Color(118, 171, 174));
        lbl_Campo_Ply2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_Campo_Ply2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 153), 2));

        lbl_Campo_Ply3.setForeground(new java.awt.Color(118, 171, 174));
        lbl_Campo_Ply3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_Campo_Ply3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 153), 2));

        jLabel3.setForeground(new java.awt.Color(118, 171, 174));
        jLabel3.setText("Vida:");

        jLabel5.setForeground(new java.awt.Color(118, 171, 174));
        jLabel5.setText("Vida:");

        jLabel6.setForeground(new java.awt.Color(118, 171, 174));
        jLabel6.setText("Vida:");

        jLabel7.setForeground(new java.awt.Color(118, 171, 174));
        jLabel7.setText("Atk:");

        jLabel8.setForeground(new java.awt.Color(118, 171, 174));
        jLabel8.setText("Atk:");

        jLabel9.setForeground(new java.awt.Color(118, 171, 174));
        jLabel9.setText("Atk:");

        lbl_Vida_Ply1.setForeground(new java.awt.Color(118, 171, 174));
        lbl_Vida_Ply1.setText("10");

        lbl_Vida_Ply2.setForeground(new java.awt.Color(118, 171, 174));
        lbl_Vida_Ply2.setText("10");

        lbl_Vida_Ply3.setForeground(new java.awt.Color(118, 171, 174));
        lbl_Vida_Ply3.setText("10");

        lbl_Atk_Ply2.setForeground(new java.awt.Color(118, 171, 174));
        lbl_Atk_Ply2.setText("20");

        lbl_Atk_Ply1.setForeground(new java.awt.Color(118, 171, 174));
        lbl_Atk_Ply1.setText("20");

        lbl_Atk_Ply3.setForeground(new java.awt.Color(118, 171, 174));
        lbl_Atk_Ply3.setText("20");

        javax.swing.GroupLayout jPanel_CampoLayout = new javax.swing.GroupLayout(jPanel_Campo);
        jPanel_Campo.setLayout(jPanel_CampoLayout);
        jPanel_CampoLayout.setHorizontalGroup(
            jPanel_CampoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_CampoLayout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addGroup(jPanel_CampoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbl_Campo_Ply1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_Campo_NPC1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel_CampoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel_CampoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_Vida_Npc1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_Atk_Npc1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_Vida_Ply1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_Atk_Ply1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(147, 147, 147)
                .addGroup(jPanel_CampoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_CampoLayout.createSequentialGroup()
                        .addComponent(lbl_Campo_NPC2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel_CampoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel_CampoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_Vida_Npc2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_Atk_Npc2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(109, 109, 109)
                        .addComponent(lbl_Campo_NPC3, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel_CampoLayout.createSequentialGroup()
                        .addComponent(lbl_Campo_Ply2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel_CampoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel_CampoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_Vida_Ply2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_Atk_Ply2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(109, 109, 109)
                        .addComponent(lbl_Campo_Ply3, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel_CampoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel_CampoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_Vida_Npc3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_Atk_Npc3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_Vida_Ply3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_Atk_Ply3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(81, 81, 81))
            .addComponent(jSeparator1)
        );
        jPanel_CampoLayout.setVerticalGroup(
            jPanel_CampoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_CampoLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel_CampoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_CampoLayout.createSequentialGroup()
                        .addGroup(jPanel_CampoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(lbl_Vida_Npc3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel_CampoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(lbl_Atk_Npc3)))
                    .addGroup(jPanel_CampoLayout.createSequentialGroup()
                        .addGroup(jPanel_CampoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(lbl_Vida_Npc2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel_CampoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(lbl_Atk_Npc2)))
                    .addComponent(lbl_Campo_NPC3, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_Campo_NPC2, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel_CampoLayout.createSequentialGroup()
                        .addGroup(jPanel_CampoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(lbl_Vida_Npc1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel_CampoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(lbl_Atk_Npc1)))
                    .addComponent(lbl_Campo_NPC1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                .addGroup(jPanel_CampoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_CampoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lbl_Campo_Ply1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbl_Campo_Ply2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbl_Campo_Ply3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel_CampoLayout.createSequentialGroup()
                        .addGroup(jPanel_CampoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(lbl_Vida_Ply1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel_CampoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(lbl_Atk_Ply1)))
                    .addGroup(jPanel_CampoLayout.createSequentialGroup()
                        .addGroup(jPanel_CampoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(lbl_Vida_Ply2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel_CampoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(lbl_Atk_Ply2)))
                    .addGroup(jPanel_CampoLayout.createSequentialGroup()
                        .addGroup(jPanel_CampoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(lbl_Vida_Ply3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel_CampoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(lbl_Atk_Ply3))))
                .addGap(21, 21, 21))
        );

        jPanel_Lateral_NPC.setBackground(new java.awt.Color(49, 54, 63));

        lbl_Img_Inimigo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(34, 40, 49), 5));

        lbl_Vida_Npc.setFont(new java.awt.Font("Rockwell", 1, 24)); // NOI18N
        lbl_Vida_Npc.setForeground(new java.awt.Color(118, 171, 174));
        lbl_Vida_Npc.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_Vida_Npc.setText("100");
        lbl_Vida_Npc.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(34, 40, 49), 5));

        lbl_Npc.setFont(new java.awt.Font("Rockwell", 1, 24)); // NOI18N
        lbl_Npc.setForeground(new java.awt.Color(118, 171, 174));
        lbl_Npc.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_Npc.setText("NPC");

        javax.swing.GroupLayout jPanel_Lateral_NPCLayout = new javax.swing.GroupLayout(jPanel_Lateral_NPC);
        jPanel_Lateral_NPC.setLayout(jPanel_Lateral_NPCLayout);
        jPanel_Lateral_NPCLayout.setHorizontalGroup(
            jPanel_Lateral_NPCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_Npc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel_Lateral_NPCLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_Lateral_NPCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_Img_Inimigo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_Vida_Npc, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel_Lateral_NPCLayout.setVerticalGroup(
            jPanel_Lateral_NPCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_Lateral_NPCLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_Img_Inimigo, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_Npc, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbl_Vida_Npc, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1_FundoLayout = new javax.swing.GroupLayout(jPanel1_Fundo);
        jPanel1_Fundo.setLayout(jPanel1_FundoLayout);
        jPanel1_FundoLayout.setHorizontalGroup(
            jPanel1_FundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1_FundoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1_FundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel_Lateral_NPC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel_Lateral_Player, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1_FundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel_Campo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel_Cartas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1_FundoLayout.setVerticalGroup(
            jPanel1_FundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1_FundoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1_FundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1_FundoLayout.createSequentialGroup()
                        .addComponent(jPanel_Campo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel_Cartas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1_FundoLayout.createSequentialGroup()
                        .addComponent(jPanel_Lateral_NPC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel_Lateral_Player, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1_Fundo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1_Fundo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    public JButton getBtn_Carta1() {
        return btn_Carta1;
    }

    public JButton getBtn_Carta2() {
        return btn_Carta2;
    }

    public JButton getBtn_Carta3() {
        return btn_Carta3;
    }

    public JButton getBtn_Carta4() {
        return btn_Carta4;
    }

    public JButton getBtn_Carta5() {
        return btn_Carta5;
    }

    public JLabel getLbl_Img_Inimigo() {
        return lbl_Img_Inimigo;
    }

    public JLabel getLbl_Img_Usuario() {
        return lbl_Img_Usuario;
    }

    public JLabel getLbl_Mana() {
        return lbl_Mana;
    }

    public JLabel getLbl_Npc() {
        return lbl_Npc;
    }

    public JLabel getLbl_Usu() {
        return lbl_Usu;
    }

    public JLabel getLbl_Vida_Npc() {
        return lbl_Vida_Npc;
    }

    public JLabel getLbl_Vida_Usuario() {
        return lbl_Vida_Usuario;
    }

    public JButton getBtn_Voltar() {
        return btn_Voltar;
    }

    

    public JButton getBtn_Jogar() {
        return btn_Jogar;
    }

    public JLabel getLbl_Atk_Npc1() {
        return lbl_Atk_Npc1;
    }

    public JLabel getLbl_Atk_Npc2() {
        return lbl_Atk_Npc2;
    }

    public JLabel getLbl_Atk_Npc3() {
        return lbl_Atk_Npc3;
    }

    public JLabel getLbl_Atk_Ply1() {
        return lbl_Atk_Ply1;
    }

    public JLabel getLbl_Atk_Ply2() {
        return lbl_Atk_Ply2;
    }

    public JLabel getLbl_Atk_Ply3() {
        return lbl_Atk_Ply3;
    }

    public JLabel getLbl_Campo_NPC1() {
        return lbl_Campo_NPC1;
    }

    public JLabel getLbl_Campo_NPC2() {
        return lbl_Campo_NPC2;
    }

    public JLabel getLbl_Campo_NPC3() {
        return lbl_Campo_NPC3;
    }

    public JLabel getLbl_Campo_Ply1() {
        return lbl_Campo_Ply1;
    }

    public JLabel getLbl_Campo_Ply2() {
        return lbl_Campo_Ply2;
    }

    public JLabel getLbl_Campo_Ply3() {
        return lbl_Campo_Ply3;
    }

    public JLabel getLbl_Vida_Npc1() {
        return lbl_Vida_Npc1;
    }

    public JLabel getLbl_Vida_Npc2() {
        return lbl_Vida_Npc2;
    }

    public JLabel getLbl_Vida_Npc3() {
        return lbl_Vida_Npc3;
    }

    public JLabel getLbl_Vida_Ply1() {
        return lbl_Vida_Ply1;
    }

    public JLabel getLbl_Vida_Ply2() {
        return lbl_Vida_Ply2;
    }

    public JLabel getLbl_Vida_Ply3() {
        return lbl_Vida_Ply3;
    }
    

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Carta1;
    private javax.swing.JButton btn_Carta2;
    private javax.swing.JButton btn_Carta3;
    private javax.swing.JButton btn_Carta4;
    private javax.swing.JButton btn_Carta5;
    private javax.swing.JButton btn_Jogar;
    private javax.swing.JButton btn_Voltar;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1_Fundo;
    private javax.swing.JPanel jPanel_Campo;
    private javax.swing.JPanel jPanel_Cartas;
    private javax.swing.JPanel jPanel_Lateral_NPC;
    private javax.swing.JPanel jPanel_Lateral_Player;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lbl_Atk_Npc1;
    private javax.swing.JLabel lbl_Atk_Npc2;
    private javax.swing.JLabel lbl_Atk_Npc3;
    private javax.swing.JLabel lbl_Atk_Ply1;
    private javax.swing.JLabel lbl_Atk_Ply2;
    private javax.swing.JLabel lbl_Atk_Ply3;
    private javax.swing.JLabel lbl_Campo_NPC1;
    private javax.swing.JLabel lbl_Campo_NPC2;
    private javax.swing.JLabel lbl_Campo_NPC3;
    private javax.swing.JLabel lbl_Campo_Ply1;
    private javax.swing.JLabel lbl_Campo_Ply2;
    private javax.swing.JLabel lbl_Campo_Ply3;
    private javax.swing.JLabel lbl_Img_Inimigo;
    private javax.swing.JLabel lbl_Img_Usuario;
    private javax.swing.JLabel lbl_Mana;
    private javax.swing.JLabel lbl_Npc;
    private javax.swing.JLabel lbl_Usu;
    private javax.swing.JLabel lbl_Vida_Npc;
    private javax.swing.JLabel lbl_Vida_Npc1;
    private javax.swing.JLabel lbl_Vida_Npc2;
    private javax.swing.JLabel lbl_Vida_Npc3;
    private javax.swing.JLabel lbl_Vida_Ply1;
    private javax.swing.JLabel lbl_Vida_Ply2;
    private javax.swing.JLabel lbl_Vida_Ply3;
    private javax.swing.JLabel lbl_Vida_Usuario;
    // End of variables declaration//GEN-END:variables
}