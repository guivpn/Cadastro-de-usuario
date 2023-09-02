/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.login.dao;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
    
    public Connection getConnection() throws SQLException {
    try {
        Connection conexao = DriverManager.getConnection("jdbc:mysql://127.0.0.1/login","root", "aluno");
        return conexao;
    } catch (SQLException e) { 
        System.out.println("Erro no caminho do banco");
    }
        return null;
    
    }
    //public Connection getConnection() throws SQLException {
    //Connection conexao = DriverManager.getConnection("jdbc:mysql://127.0.0.1/login","root", "aluno");
    //return conexao;
    
    //}
}
