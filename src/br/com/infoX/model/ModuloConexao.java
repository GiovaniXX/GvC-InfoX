package br.com.infoX.model;

import java.sql.*;

public class ModuloConexao {

    public static Connection conectar() {
        Connection conexao;
        String driver = "com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/dbinfox";
        String user = "root";
        String password = "PerfectWorld2023@$";

        try {
            Class.forName(driver);
            conexao = DriverManager.getConnection(url, user, password);
            return conexao;
        } catch (ClassNotFoundException | SQLException e) {
            //System.out.println(e); //--> Linha para apresentação do erro do banco de dados
            return null;
        }
    }
}