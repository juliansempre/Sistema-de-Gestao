package com.sistema.login.VIEW;

import com.sistema.estoque.VIEW.Estoque;
import com.sistema.login.DAO.LoginDAO;
import com.sistema.login.DTO.LoginDTO;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Login extends JFrame{
    private JTextField textField1;
    private JPasswordField passwordField1;
    private JButton entrarButton;
    private JPanel Painel;

    public Login() {
        ConfiguracoesDoPainel();

        entrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            //acao
            try {
                LoginDTO objLoginDTO = new LoginDTO();

                String Usuario = textField1.getText();
                String Senha = passwordField1.getText();

                objLoginDTO.setUsuario(Usuario);
                objLoginDTO.setSenha(Senha);
                System.out.println("Conectando usuário: " + objLoginDTO.getUsuario());

                LoginDAO objLoginDAO = new LoginDAO();
                ResultSet rsLoginDAO = objLoginDAO.autenticarUsuario(objLoginDTO);


                if(rsLoginDAO.next()){
                    //Chamar a tela que quero abrir
                    Estoque estoque = new Estoque();
                    estoque.setVisible(true);

                    dispose();
                }else {
                    //Usuario invalido aqui
                    JOptionPane.showMessageDialog(null,"Usuario ou senha invalida");
                }


            }catch (SQLException erro){
                JOptionPane.showMessageDialog(null,"Erro na view Login " + erro);
            }

            }
        });
    }

    public static void main(String[] args) {
    Login login = new Login();
    login.setVisible(true);
    }
    public void ConfiguracoesDoPainel(){

        setContentPane(Painel);
        setTitle("Sistema");
        setSize(300,400);
        setBounds(0, 0, 300, 400); // define as coordenadas X e Y do botão e o seu tamanho
        setLocationRelativeTo(null); // centraliza a janela na tela
        setVisible(true);
        //Botões
    }
}
