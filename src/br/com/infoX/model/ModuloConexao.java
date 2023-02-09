package br.com.infoX.model;

import java.sql.*;

/**
 * Conexão com SGBD
 *
 * @author Giovani V. Chaves
 * @version 1.1
 */
public class ModuloConexao {

    /**
     * Método responsável pela conexão com o SGBD
     *
     * @return conexao
     */
    public static Connection conectar() {
        Connection conexao;
        String driver = "com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/dbinfox?characterEncoding=utf-8";
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
