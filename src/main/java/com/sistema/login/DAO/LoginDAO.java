package com.sistema.login.DAO;

import com.sistema.login.DTO.LoginDTO;

import javax.swing.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginDAO {
    Connection conn;

    public ResultSet autenticarUsuario(LoginDTO objLoginDTO){
        conn = new ConexaoDAO().ConectaBD();
        try {
            String sql = "SELECT * FROM usuarios WHERE usuario = ? AND senha = ?";

            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, objLoginDTO.getUsuario());
            pstm.setString(2, objLoginDTO.getSenha());

            ResultSet rs = pstm.executeQuery();
            return rs;

        }catch (SQLException erro){
            JOptionPane.showMessageDialog(null, "Erro no LoginDAO: " + erro.getMessage());
            return null;
        }
    }
}
