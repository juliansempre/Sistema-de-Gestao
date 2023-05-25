package com.sistema.login.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ConexaoDAO {
    public Connection ConectaBD;

    public Connection ConectaBD(){
        Connection conn = null;
        try{
            String url = "jdbc:mysql://localhost:3306/sistema?user=root&password=";
            conn = DriverManager.getConnection(url);
        }catch(SQLException erro){
            JOptionPane.showMessageDialog(null, "Tem um erro na classe de conexaoDAO" + erro.getMessage());
        }
        return conn;
    }
}