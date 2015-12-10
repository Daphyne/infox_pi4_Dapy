package br.com.infox.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
<<<<<<< HEAD


	public static Connection getConnection(){
=======
<<<<<<< HEAD

public static Connection getConnection(){
=======
	
	
	
	public static Connection getConnection(){
>>>>>>> 690cb9829f1cafbfc5850e578f4bd2d50b1fc298
>>>>>>> 06bf4517ac507a8f128966235204ad40b0dc7315
		
		Connection con = null;

		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bancoinfox","root","");
			System.out.println("Conectado com sucesso!");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Não conseguiu se conectar com o banco."+e.getMessage());
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Driver não encontrado.");
		}
		return con;
		
		
		
	}

<<<<<<< HEAD
=======
<<<<<<< HEAD

=======
>>>>>>> 690cb9829f1cafbfc5850e578f4bd2d50b1fc298
>>>>>>> 06bf4517ac507a8f128966235204ad40b0dc7315
}
