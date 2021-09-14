package br.com.loja.dal;
import java.sql.*;
public class ModuloConexao {
    
    public static Connection conector(){
    
    java.sql.Connection conexao = null;
    
    //Configurando a Conexão
    String driver;
    driver = "com.mysql.jdbc.Driver";
    //Para o Netbeans 12, devemos ter o JAR e, 
    //Atualizar o driver
    //com.mysql.cj.jdbc.Driver
    
    //Variaveis para passar info do Banco de Dados
    String url ="jdbc:mysql://localhost:3306/dblojaetec";
    String user ="root";
    String password ="";
    
    try{
        Class.forName(driver);
        conexao = DriverManager.getConnection(url,user,password);
        return conexao;
  
    } catch(Exception ex){
        return null;
    }
    
}
}
