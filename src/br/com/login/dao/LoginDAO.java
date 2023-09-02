/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.login.dao;


import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;

public class LoginDAO {
    
    public void cadastrarUsuario (String nome, String email, String senha) throws SQLException {
        Connection conexao = new Conexao().getConnection();
        String sql = "insert into usuario (nome,email, senha) values ('"+nome+"', '"+email+"', '"+senha+"')";
        
        System.out.println(sql);
        PreparedStatement statement = conexao.prepareStatement(sql);
        statement.execute();
        statement.close();
    }
}
