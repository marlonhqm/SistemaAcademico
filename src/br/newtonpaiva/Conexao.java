package br.newtonpaiva;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
	
	public static String status = "N�o conectou";
	 
    public Conexao() {
	}
	
	public static java.sql.Connection getConexaoMySQL() {
	 Connection connection = null;
	 try {
		 	String driverName = "com.mysql.jdbc.Driver";                        
		 	Class.forName(driverName);
	 
		 	// Configurando a nossa conex�o com um banco de dados//
	        String serverName = "localhost";
	 	    String mydatabase ="siscad";
	        String url = "jdbc:mysql://" + serverName + "/" + mydatabase;
	        String username = "root";      
	        String password = "";
	 
	        connection = DriverManager.getConnection(url, username, password);
	 
	 
	        if (connection != null) {
	 
	            status = ("Sucesso!");
	 
	        } else {
	 
	            status = ("N�o foi possivel realizar conex�o");
	        }
	 
	        return connection;
	 
	        } catch (ClassNotFoundException e) {  //Driver n�o encontrado
	 
	            System.out.println("O driver expecificado nao foi encontrado.");
	 
	            return null;
	 
	        } catch (SQLException e) {
	 
	//N�o conseguindo se conectar ao banco
	 
	            System.out.println("Nao foi possivel conectar ao Banco de Dados.");
	 
	            return null;
	 
	        }
	 
	    }
	public static String statusConection() {
		 
        return status;
 
    }
	
	public static boolean FecharConexao() {
		 
        try {
 
            Conexao.getConexaoMySQL().close();
 
            return true;
 
        } catch (SQLException e) {
 
            return false;
 
        }
 
  
 
    }
}
