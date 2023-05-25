package com.sistema.estoque.VIEW;

import com.sistema.login.VIEW.Login;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Estoque extends JFrame {


    private JPanel PainelEstoque;
    private JButton inicioButton;

    public Estoque(){
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

}
