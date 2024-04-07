package com.game.controller;

import com.game.gui.Batanha;
import com.game.model.Cartas;
import com.game.model.Jogadores;
import com.game.model.Usuario;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/**
 *
 * @author caiop
 */
public class Controller_Batalha implements ActionListener {

    //jpainel que este controller controla
    private Batanha bat = new Batanha();
    //outros controllers para fazer trocas de telas
    private Controller_NivelOne niv1;
    private Controller_Lateral blr;
    //variaveis para poder controlar melhor cada jogador da batanha
    private Jogadores ply;
    private Jogadores npc;
    //lista para o controlhe de que cartas estao no campo de batalha
    private ArrayList<Cartas> CampoBatalha_Ply = new ArrayList<>(3);
    private ArrayList<Cartas> CampoBatalha_Npc = new ArrayList<>(3);
    //lista para controlar as cartas disponiveis para colocar no campo de batalha do jogador
    private ArrayList<Cartas> CartaEscolha = new ArrayList<>(5);
    //definindo o tamanha dos botes e labels para que a img nao altere seu tamanho
    int width = 125;
    int height = 177;

    //Contrutor da classe
    public Controller_Batalha(Jogadores player, Jogadores npc) {
        this.ply = player;
        this.npc = npc;
        this.bat.getBtn_Voltar().addActionListener(this);
        this.bat.getBtn_Jogar().addActionListener(this);
        this.bat.getBtn_Carta1().addActionListener(this);
        this.bat.getBtn_Carta2().addActionListener(this);
        this.bat.getBtn_Carta3().addActionListener(this);
        this.bat.getBtn_Carta4().addActionListener(this);
        this.bat.getBtn_Carta5().addActionListener(this);

        this.bat.getLbl_Npc().setText(this.npc.getNome());
        this.bat.getLbl_Usu().setText(this.ply.getNome());
        this.AtualizaVidaJogadores();
        this.LimparCampoBatalhaNpc();
        this.LimparCampoBatalhaPlayer();
        this.CarregarCartas();
    }

    //Para poder chamar o jPainel para a tela
    public Batanha getBat() {
        return bat;
    }

    //medatado para verificar a vida das carta e dos jogares
    private boolean ControleVida(int vida) {
        if (vida <= 0) {
            return true;
        } else {
            return false;
        }
    }

    //medatado para atualiza os dados na tela tanto para o player e npc
    private void AtualizaVidaJogadores() {
        this.bat.getLbl_Vida_Npc().setText(String.valueOf(this.npc.getVida()));
        this.bat.getLbl_Vida_Usuario().setText(String.valueOf(this.ply.getVida()));
    }

    //medatado para controlar se tem pontos o suficiete para colocar a carta no campo de baltaha
    private boolean ControleMoeda(int custo, int possui) {
        if (possui >= custo) {
            ply.setMoeda(possui - custo);
            return true;
        } else {
            return false;
        }
    }

    //medatado para limitar o max de ponto de acao e adicionar +1 a cada virada de turno
    private void MaxMoedas() {
        if (this.ply.getMoeda() < 10) {
            ply.setMoeda(ply.getMoeda() + 1);
        }
        if (this.npc.getMoeda() < 10) {
            npc.setMoeda(npc.getMoeda() + 1);
        }
    }
//medatado para jutar os outros medatos e ter o maior controlhe da ordem de execucao e verivicar o resultado da partida

    private void Turno() {
        this.AtualizaVidaJogadores();
        this.CarregarCampoPlayer();
        this.CarregarCartas();

        this.NpcEscolheCartasParaCampoBatalha();
        this.CarregarCampoNpc();

        this.Combate();
        if (ControleVida(this.npc.getVida())) {
            this.Ganhador();
            niv1 = new Controller_NivelOne();
            blr = new Controller_Lateral();
            Main.main.trocaGame(blr.getBlr(), niv1.getNiv());
        }
        if (ControleVida(this.ply.getVida())) {
            JOptionPane.showMessageDialog(null, "Vc Perdeu", "Resultado", JOptionPane.INFORMATION_MESSAGE);
            niv1 = new Controller_NivelOne();
            blr = new Controller_Lateral();
            Main.main.trocaGame(blr.getBlr(), niv1.getNiv());
        }

        this.CarregarCampoPlayer();
        this.CarregarCartas();

        this.MaxMoedas();
        this.bat.getLbl_Mana().setText(String.valueOf(ply.getMoeda()));
    }
//medatado para resetar todas os daods que estao no campo de batalha do npc para o padrao definido

    private void LimparCampoBatalhaPlayer() {
        javax.swing.ImageIcon originalIcon = new javax.swing.ImageIcon(getClass().getResource("/Cartas/Costa.png"));
        java.awt.Image scaledImage = originalIcon.getImage().getScaledInstance(width, height, java.awt.Image.SCALE_SMOOTH);
        javax.swing.ImageIcon scaledIcon = new javax.swing.ImageIcon(scaledImage);

        this.bat.getLbl_Campo_Ply1().setText("0");
        this.bat.getLbl_Campo_Ply1().setFont(this.bat.getLbl_Campo_Ply1().getFont().deriveFont(Font.BOLD, 0));
        this.bat.getLbl_Campo_Ply1().setIcon(scaledIcon);

        this.bat.getLbl_Campo_Ply2().setText("0");
        this.bat.getLbl_Campo_Ply2().setFont(this.bat.getLbl_Campo_Ply2().getFont().deriveFont(Font.BOLD, 0));
        this.bat.getLbl_Campo_Ply2().setIcon(scaledIcon);

        this.bat.getLbl_Campo_Ply3().setText("0");
        this.bat.getLbl_Campo_Ply3().setFont(this.bat.getLbl_Campo_Ply3().getFont().deriveFont(Font.BOLD, 0));
        this.bat.getLbl_Campo_Ply3().setIcon(scaledIcon);

        this.bat.getLbl_Atk_Ply1().setText("--");
        this.bat.getLbl_Vida_Ply1().setText("--");

        this.bat.getLbl_Atk_Ply2().setText("--");
        this.bat.getLbl_Vida_Ply2().setText("--");

        this.bat.getLbl_Atk_Ply3().setText("--");
        this.bat.getLbl_Vida_Ply3().setText("--");

    }

    //medatado para resetar todas os daods que estao no campo de batalha do player para o padrao definido
    private void LimparCampoBatalhaNpc() {
        javax.swing.ImageIcon originalIcon = new javax.swing.ImageIcon(getClass().getResource("/Cartas/Costa.png"));
        java.awt.Image scaledImage = originalIcon.getImage().getScaledInstance(width, height, java.awt.Image.SCALE_SMOOTH);
        javax.swing.ImageIcon scaledIcon = new javax.swing.ImageIcon(scaledImage);

        this.bat.getLbl_Campo_NPC1().setText("0");
        this.bat.getLbl_Campo_NPC1().setFont(this.bat.getLbl_Campo_NPC1().getFont().deriveFont(Font.BOLD, 0));
        this.bat.getLbl_Campo_NPC1().setIcon(scaledIcon);

        this.bat.getLbl_Campo_NPC1().setText("0");
        this.bat.getLbl_Campo_NPC1().setFont(this.bat.getLbl_Campo_NPC1().getFont().deriveFont(Font.BOLD, 0));
        this.bat.getLbl_Campo_NPC1().setIcon(scaledIcon);

        this.bat.getLbl_Campo_NPC2().setText("0");
        this.bat.getLbl_Campo_NPC2().setFont(this.bat.getLbl_Campo_NPC2().getFont().deriveFont(Font.BOLD, 0));
        this.bat.getLbl_Campo_NPC2().setIcon(scaledIcon);

        this.bat.getLbl_Campo_NPC3().setText("0");
        this.bat.getLbl_Campo_NPC3().setFont(this.bat.getLbl_Campo_NPC3().getFont().deriveFont(Font.BOLD, 0));
        this.bat.getLbl_Campo_NPC3().setIcon(scaledIcon);

        this.bat.getLbl_Atk_Npc1().setText("--");
        this.bat.getLbl_Vida_Npc1().setText("--");

        this.bat.getLbl_Atk_Npc2().setText("--");
        this.bat.getLbl_Vida_Npc2().setText("--");

        this.bat.getLbl_Atk_Npc3().setText("--");
        this.bat.getLbl_Vida_Npc3().setText("--");
    }

    //metado para atualizar os dados das cartas que estao no campo de batalha do player
    private void CarregarCampoPlayer() {
        LimparCampoBatalhaPlayer();
        //Para o player
        for (Cartas cartas : CampoBatalha_Ply) {
            javax.swing.ImageIcon originalIcon = new javax.swing.ImageIcon(getClass().getResource(cartas.getImg()));
            java.awt.Image scaledImage = originalIcon.getImage().getScaledInstance(width, height, java.awt.Image.SCALE_SMOOTH);
            javax.swing.ImageIcon scaledIcon = new javax.swing.ImageIcon(scaledImage);
            if (this.bat.getLbl_Campo_Ply1().getText() == "0") {
                this.bat.getLbl_Campo_Ply1().setText(cartas.getNome());
                this.bat.getLbl_Atk_Ply1().setText(String.valueOf(cartas.getAtaque()));
                this.bat.getLbl_Vida_Ply1().setText(String.valueOf(cartas.getVida()));
                this.bat.getLbl_Campo_Ply1().setIcon(scaledIcon);
            } else if (this.bat.getLbl_Campo_Ply2().getText() == "0") {
                this.bat.getLbl_Campo_Ply2().setText(cartas.getNome());
                this.bat.getLbl_Atk_Ply2().setText(String.valueOf(cartas.getAtaque()));
                this.bat.getLbl_Vida_Ply2().setText(String.valueOf(cartas.getVida()));
                this.bat.getLbl_Campo_Ply2().setIcon(scaledIcon);
            } else if (this.bat.getBtn_Carta3().getText() == "0") {
                this.bat.getLbl_Campo_Ply3().setText(cartas.getNome());
                this.bat.getLbl_Atk_Ply3().setText(String.valueOf(cartas.getAtaque()));
                this.bat.getLbl_Vida_Ply3().setText(String.valueOf(cartas.getVida()));
                this.bat.getLbl_Campo_Ply3().setIcon(scaledIcon);
            }
        }

    }

//metado para atualizar os dados das cartas que estao no campo de batalha do npc
    private void CarregarCampoNpc() {
        this.LimparCampoBatalhaNpc();
        int i = 1;
        for (Cartas cartas : CampoBatalha_Npc) {

            javax.swing.ImageIcon originalIcon = new javax.swing.ImageIcon(getClass().getResource(cartas.getImg()));
            java.awt.Image scaledImage = originalIcon.getImage().getScaledInstance(width, height, java.awt.Image.SCALE_SMOOTH);
            javax.swing.ImageIcon scaledIcon = new javax.swing.ImageIcon(scaledImage);
            if (i == 1) {
                this.bat.getLbl_Campo_NPC1().setText(cartas.getNome());
                this.bat.getLbl_Atk_Npc1().setText(String.valueOf(cartas.getAtaque()));
                this.bat.getLbl_Vida_Npc1().setText(String.valueOf(cartas.getVida()));
                this.bat.getLbl_Campo_NPC1().setIcon(scaledIcon);
            } else if (i == 2) {
                this.bat.getLbl_Campo_NPC2().setText(cartas.getNome());
                this.bat.getLbl_Atk_Npc2().setText(String.valueOf(cartas.getAtaque()));
                this.bat.getLbl_Vida_Npc2().setText(String.valueOf(cartas.getVida()));
                this.bat.getLbl_Campo_NPC2().setIcon(scaledIcon);
            } else if (i == 3) {
                this.bat.getLbl_Campo_NPC3().setText(cartas.getNome());
                this.bat.getLbl_Atk_Npc3().setText(String.valueOf(cartas.getAtaque()));
                this.bat.getLbl_Vida_Npc3().setText(String.valueOf(cartas.getVida()));
                this.bat.getLbl_Campo_NPC3().setIcon(scaledIcon);
            }
            i++;
        }
    }

//metado responsavel de limpar todos os slot de cartas disponiveis para colocar no campo de batalha
    private void LimparCartas() {

        this.bat.getBtn_Carta1().setEnabled(false);
        this.bat.getBtn_Carta1().setText("0");
        this.bat.getBtn_Carta1().setFont(this.bat.getBtn_Carta1().getFont().deriveFont(Font.BOLD, 0));
        javax.swing.ImageIcon originalIcon = new javax.swing.ImageIcon(getClass().getResource("/Cartas/Costa.png"));
        java.awt.Image scaledImage = originalIcon.getImage().getScaledInstance(width, height, java.awt.Image.SCALE_SMOOTH);
        javax.swing.ImageIcon scaledIcon = new javax.swing.ImageIcon(scaledImage);
        this.bat.getBtn_Carta1().setIcon(scaledIcon);

        this.bat.getBtn_Carta2().setEnabled(false);
        this.bat.getBtn_Carta2().setText("0");
        this.bat.getBtn_Carta2().setFont(this.bat.getBtn_Carta1().getFont().deriveFont(Font.BOLD, 0));
        this.bat.getBtn_Carta2().setIcon(scaledIcon);

        this.bat.getBtn_Carta3().setEnabled(false);
        this.bat.getBtn_Carta3().setText("0");
        this.bat.getBtn_Carta3().setFont(this.bat.getBtn_Carta1().getFont().deriveFont(Font.BOLD, 0));
        this.bat.getBtn_Carta3().setIcon(scaledIcon);

        this.bat.getBtn_Carta4().setEnabled(false);
        this.bat.getBtn_Carta4().setText("0");
        this.bat.getBtn_Carta4().setFont(this.bat.getBtn_Carta1().getFont().deriveFont(Font.BOLD, 0));
        this.bat.getBtn_Carta4().setIcon(scaledIcon);

        this.bat.getBtn_Carta5().setEnabled(false);
        this.bat.getBtn_Carta5().setText("0");
        this.bat.getBtn_Carta5().setFont(this.bat.getBtn_Carta1().getFont().deriveFont(Font.BOLD, 0));
        this.bat.getBtn_Carta5().setIcon(scaledIcon);
    }

//metado responsavel de carregar e atualizar os dados todas as cartas disponiveis para colocar no campo de batalha
    private void CarregarCartas() {
        LimparCartas();
        this.bat.getLbl_Mana().setText(String.valueOf(ply.getMoeda()));

        if (ply.getDeck().isEmpty()) {
            LimparCartas();
        } else {
            for (Cartas cartas : ply.getDeck()) {
                javax.swing.ImageIcon originalIcon = new javax.swing.ImageIcon(getClass().getResource(cartas.getImg()));
                java.awt.Image scaledImage = originalIcon.getImage().getScaledInstance(width, height, java.awt.Image.SCALE_SMOOTH);
                javax.swing.ImageIcon scaledIcon = new javax.swing.ImageIcon(scaledImage);
                if (this.bat.getBtn_Carta1().getText() == "0") {
                    this.bat.getBtn_Carta1().setText(cartas.getNome());
                    this.bat.getBtn_Carta1().setEnabled(true);
                    this.bat.getBtn_Carta1().setIcon(scaledIcon);
                } else if (this.bat.getBtn_Carta2().getText() == "0") {
                    this.bat.getBtn_Carta2().setText(cartas.getNome());
                    this.bat.getBtn_Carta2().setEnabled(true);
                    this.bat.getBtn_Carta2().setIcon(scaledIcon);
                } else if (this.bat.getBtn_Carta3().getText() == "0") {
                    this.bat.getBtn_Carta3().setText(cartas.getNome());
                    this.bat.getBtn_Carta3().setEnabled(true);
                    this.bat.getBtn_Carta3().setIcon(scaledIcon);
                } else if (this.bat.getBtn_Carta4().getText() == "0") {
                    this.bat.getBtn_Carta4().setText(cartas.getNome());
                    this.bat.getBtn_Carta4().setEnabled(true);
                    this.bat.getBtn_Carta4().setIcon(scaledIcon);
                } else if (this.bat.getBtn_Carta5().getText() == "0") {
                    this.bat.getBtn_Carta5().setText(cartas.getNome());
                    this.bat.getBtn_Carta5().setEnabled(true);
                    this.bat.getBtn_Carta5().setIcon(scaledIcon);
                } else {
                    break;
                }
            }
        }
    }

    //metado responsavel por escolher quais cartas o npc ira colocar no seu campo e verificar se e possivel e ele tera 4 chances para colocar uma carta
    private void NpcEscolheCartasParaCampoBatalha() {
        if (this.CampoBatalha_Npc.size() < 3) {
            Random random = new Random();
            for (int i = 0; i < 4; i++) {
                int id = random.nextInt(this.npc.getDeck().size());
                Cartas card = this.npc.getDeck().get(id);
                if (card.getCusto() <= this.npc.getMoeda()) {
                    this.npc.setMoeda(this.npc.getMoeda() - card.getCusto());
                    this.CampoBatalha_Npc.add(card);
                    npc.getDeck().remove(card);
                }
                if (this.npc.getMoeda() == 0) {
                    break;
                }
            }
        }
    }

    //metado responsavel de relaizar a luta entre as cartas 
    private void Combate() {
        Random random = new Random();
        //cartas do player
        if (this.CampoBatalha_Ply != null) {
            for (Cartas carta : CampoBatalha_Ply) {
                int id = random.nextInt(this.CampoBatalha_Npc.size());
                if (id == 0) {
                    this.npc.setVida(this.npc.getVida() - carta.getAtaque());
                } else {
                    Cartas inimigo = this.CampoBatalha_Npc.get(id);
                    inimigo.setVida(inimigo.getVida() - carta.getAtaque());
                    if (ControleVida(inimigo.getVida())) {
                        this.npc.getDeck().add(inimigo);
                        this.CampoBatalha_Npc.remove(this.CampoBatalha_Npc.get(id));
                        this.LimparCampoBatalhaNpc();
                        this.CarregarCampoNpc();
                    }
                }
            }
        }
        //cartas do npc
        if (this.CampoBatalha_Npc != null) {
            for (Cartas carta : CampoBatalha_Npc) {
                int id = random.nextInt(this.CampoBatalha_Ply.size());
                if (id == 0) {
                    this.ply.setVida(this.npc.getVida() - carta.getAtaque());
                } else {
                    Cartas inimigo = this.CampoBatalha_Ply.get(id);
                    inimigo.setVida(inimigo.getVida() - carta.getAtaque());
                    if (ControleVida(inimigo.getVida())) {
                        this.ply.getDeck().add(inimigo);
                        this.CampoBatalha_Ply.remove(this.CampoBatalha_Ply.get(id));
                        this.LimparCampoBatalhaPlayer();
                        this.CarregarCampoPlayer();
                    }
                }
            }
        }
    }

    //metado responsavel por dar a msg que ganhaou a partida e mostrar que carta nova ele ganhou
    private void Ganhador() {
        Random random = new Random();
        int id = random.nextInt(Controller_Main.cartas.size());
        Controller_Main.usu.getDeck().add(Controller_Main.cartas.get(id));
        String msg = "Vc ganhou!! e recebeu uma carta " + Controller_Main.cartas.get(id).getNome() + ".";
        JOptionPane.showMessageDialog(null, msg, "Resultado", JOptionPane.INFORMATION_MESSAGE);
    }

    //se tivet um evento como clicar ira ativar este metado
    @Override
    public void actionPerformed(ActionEvent e) {
        //botao voltar para o mapa do nivel 1
        if (e.getSource() == this.bat.getBtn_Voltar()) {
            niv1 = new Controller_NivelOne();
            blr = new Controller_Lateral();
            Main.main.trocaGame(blr.getBlr(), niv1.getNiv());
        } //botao jogar que inicia a roda
        else if (e.getSource() == this.bat.getBtn_Jogar()) {
            this.Turno();
        } //botao com que contem a primeira carta diponivel para ser jogada
        else if (e.getSource() == this.bat.getBtn_Carta1()) {
            for (Cartas cartas : ply.getDeck()) {
                if (this.bat.getBtn_Carta1().getText() == cartas.getNome()) {
                    if (this.ControleMoeda(cartas.getCusto(), ply.getMoeda())) {
                        this.CampoBatalha_Ply.add(cartas);
                        ply.getDeck().remove(cartas);
                        this.bat.getBtn_Carta1().setEnabled(false);
                        this.bat.getBtn_Carta1().setText("0");
                        this.CarregarCampoPlayer();
                        break;
                    }
                }
            }
            this.CarregarCartas();
        } //botao com que contem a segunda carta diponivel para ser jogada
        else if (e.getSource() == this.bat.getBtn_Carta2()) {
            for (Cartas cartas : ply.getDeck()) {
                if (this.bat.getBtn_Carta2().getText() == cartas.getNome()) {
                    if (this.ControleMoeda(cartas.getCusto(), ply.getMoeda())) {
                        this.CampoBatalha_Ply.add(cartas);
                        ply.getDeck().remove(cartas);
                        this.bat.getBtn_Carta2().setEnabled(false);
                        this.bat.getBtn_Carta2().setText("0");
                        this.CarregarCampoPlayer();
                        break;
                    }
                }
            }
            this.CarregarCartas();
        } //botao com que contem a terceira carta diponivel para ser jogada
        else if (e.getSource() == this.bat.getBtn_Carta3()) {
            for (Cartas cartas : ply.getDeck()) {
                if (this.bat.getBtn_Carta3().getText() == cartas.getNome()) {
                    if (this.ControleMoeda(cartas.getCusto(), ply.getMoeda())) {
                        this.CampoBatalha_Ply.add(cartas);
                        ply.getDeck().remove(cartas);
                        this.bat.getBtn_Carta3().setEnabled(false);
                        this.bat.getBtn_Carta3().setText("0");
                        this.CarregarCampoPlayer();
                        break;
                    }
                }
            }
            this.CarregarCartas();
        } //botao com que contem a quarta carta diponivel para ser jogada
        else if (e.getSource() == this.bat.getBtn_Carta4()) {
            for (Cartas cartas : ply.getDeck()) {
                if (this.bat.getBtn_Carta4().getText() == cartas.getNome()) {
                    if (this.ControleMoeda(cartas.getCusto(), ply.getMoeda())) {
                        this.CampoBatalha_Ply.add(cartas);
                        ply.getDeck().remove(cartas);
                        this.bat.getBtn_Carta4().setEnabled(false);
                        this.bat.getBtn_Carta4().setText("0");
                        this.CarregarCampoPlayer();
                        break;
                    }
                }
            }
            this.CarregarCartas();
        } //botao com que contem a quinta carta diponivel para ser jogada
        else if (e.getSource() == this.bat.getBtn_Carta5()) {
            for (Cartas cartas : ply.getDeck()) {
                if (this.bat.getBtn_Carta5().getText() == cartas.getNome()) {
                    if (this.ControleMoeda(cartas.getCusto(), ply.getMoeda())) {
                        this.CampoBatalha_Ply.add(cartas);
                        ply.getDeck().remove(cartas);
                        this.bat.getBtn_Carta5().setEnabled(false);
                        this.bat.getBtn_Carta5().setText("0");
                        this.CarregarCampoPlayer();
                        break;
                    }
                }
            }
            this.CarregarCartas();
        }
    }
}
