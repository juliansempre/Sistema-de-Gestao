package com.sistema.estoque.VIEW;

import com.sistema.login.DTO.LoginDTO;
import com.sistema.login.VIEW.Login;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Estoque extends JFrame {

    private String nome;
    private JPanel PainelEstoque;
    private JButton inicioButton;
    private JLabel Bemvindo;

    public Estoque(String nomeUsuario){
        this.nome = nomeUsuario;
        bemvindo();

        ConfiguracoesDoPainel();
        inicioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Login login = new Login();
                login.setVisible(true);

                dispose();

            }
        });
    }
    public void ConfiguracoesDoPainel(){

        setContentPane(PainelEstoque);
        setTitle("Estoque");
        setSize(300,400);
        setBounds(0, 0, 300, 400); // define as coordenadas X e Y do botão e o seu tamanho
        setLocationRelativeTo(null); // centraliza a janela na tela
        setVisible(true);
        //Botões
    }
    public void bemvindo(){
        Bemvindo.setText("Bem vindo " + nome);

    }

}
