package br.com.infox.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.infox.entidades.Professor;

public class ProfessorDAO {
<<<<<<< HEAD


	private Connection con = Conexao.getConnection();
=======
<<<<<<< HEAD

private Connection con = Conexao.getConnection();
=======
	
	private Connection con = Conexao.getConnection();
>>>>>>> 690cb9829f1cafbfc5850e578f4bd2d50b1fc298
>>>>>>> 06bf4517ac507a8f128966235204ad40b0dc7315
	
	
	public void Cadastrar(Professor professor){
		
		String sql = "INSERT INTO professor(matriculaProfessor, dataNascProfessor, telefoneProfessor, nomeProfessor, senha, emailProfessor)VALUES(?,?,?,?,?,?)";
		
		try {
			
			
			PreparedStatement preparador = con.prepareStatement(sql);
			
			preparador.setInt(1, professor.getMatriculaProfessor());
			preparador.setString(2, professor.getDataNascProfessor());
			preparador.setString(3, professor.getTelefoneProfessor());
			preparador.setString(4, professor.getNomeProfessor());
			preparador.setString(5, professor.getSenha());
			preparador.setString(6, professor.getEmailProfessor());
			
			
			preparador.execute();
			preparador.close();
			
			System.out.println("Professor cadastrado no sistema!");
			
		} catch (SQLException e) {
			// TODO: handle exception

			System.out.println("N�o foi poss�vel cadastrar no sistema.");

			e.printStackTrace();
		}
		 
	}
	
	
	
	public void Alterar(Professor professor){
		
<<<<<<< HEAD
		String sql = "UPDATE professor SET dataNascProfessor=?, telefoneProfessor=?, nomeProfessor=?, senha=?, emailProfessor=? WHERE matriculaProfessor=?";
=======
		String sql = "UPDATE professor SET matriculaProfessor=?, dataNascProfessor=?, telefoneProfessor=?, nomeProfessor=?, senha=?, emailProfessor=? WHERE matriculaProfessor=?";
>>>>>>> 06bf4517ac507a8f128966235204ad40b0dc7315
		
		try {
			
			
			PreparedStatement preparador = con.prepareStatement(sql);
<<<<<<< HEAD
			preparador.setString(1, professor.getDataNascProfessor());
			preparador.setString(2, professor.getTelefoneProfessor());
			preparador.setString(3, professor.getNomeProfessor());
			preparador.setString(4, professor.getSenha());
			preparador.setString(5, professor.getEmailProfessor());
			preparador.setInt(6, professor.getMatriculaProfessor());
=======
			preparador.setInt(1, professor.getMatriculaProfessor());
			preparador.setString(2, professor.getDataNascProfessor());
			preparador.setString(3, professor.getTelefoneProfessor());
			preparador.setString(4, professor.getNomeProfessor());
			preparador.setString(5, professor.getSenha());
			preparador.setString(7, professor.getEmailProfessor());
>>>>>>> 06bf4517ac507a8f128966235204ad40b0dc7315
			
			
			preparador.execute();
			preparador.close();
			
			System.out.println("Professor alterado no sistema!");
			
		} catch (SQLException e) {
			// TODO: handle exception

			System.out.println("N�o foi poss�vel alterar no sistema.");

			e.printStackTrace();
		}
		 
	}
	
	
	
	
	
	public void Excluir(Professor professor){
		
		String sql = "DELETE FROM professor WHERE matriculaProfessor=?";
		
		try {
			
			
			PreparedStatement preparador = con.prepareStatement(sql);
			preparador.setInt(1, professor.getMatriculaProfessor());
			
			
			
			preparador.execute();
			preparador.close();
			
			System.out.println("Professor exclu�do no sistema!");
			
		} catch (SQLException e) {
			// TODO: handle exception

			System.out.println("N�o foi poss�vel excluir no sistema.");

			e.printStackTrace();
		}
		 
	}
	
<<<<<<< HEAD

	
	public List<Professor>BuscarTodos(){
		
		String sql ="SELECT * FROM professor";
		List<Professor> prolista = new ArrayList<Professor>();

		
		try {
			
			PreparedStatement preparador = con.prepareStatement(sql);
			ResultSet resul = preparador.executeQuery();
			

			while(resul.next()){
				
				Professor pro = new Professor();
				
				
				pro.setMatriculaProfessor(resul.getInt("matriculaProfessor"));
				pro.setDataNascProfessor(resul.getString("dataNascProfessor"));
				pro.setTelefoneProfessor(resul.getString("telefoneProfessor"));
				pro.setNomeProfessor(resul.getString("nomeProfessor"));
				pro.setSenha(resul.getString("senha"));
				pro.setEmailProfessor(resul.getString("emailProfessor"));
				
				prolista.add(pro);

				
				
				
				
			}
			preparador.close();
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Na� foi poss�vel fazer a busca.");
		}
		return prolista;
		
	}
	
	public Professor BuscarMatricula(int matriculaProfessor){
		
		String sql = "SELECT * FROM professor WHERE matriculaProfessor=?";
		
		Professor pro = null;
=======
	
	public List<Professor> BuscarMatricula(int matriculaProfessor){
		
		String sql = "SELECT * FROM professor WHERE matriculaProfessor=?";
		List<Professor> prolista = new ArrayList<Professor>();
>>>>>>> 06bf4517ac507a8f128966235204ad40b0dc7315

		
		try {
			
			
			PreparedStatement preparador = con.prepareStatement(sql);
			preparador.setInt(1, matriculaProfessor);
			
			
			ResultSet resul = preparador.executeQuery();
			
<<<<<<< HEAD
			if(resul.next()){
				
				pro = new Professor();
=======
			while(resul.next()){
				
			Professor pro = new Professor();
			
>>>>>>> 06bf4517ac507a8f128966235204ad40b0dc7315
			
			pro.setMatriculaProfessor(resul.getInt("matriculaProfessor"));
			pro.setDataNascProfessor(resul.getString("dataNascProfessor"));
			pro.setTelefoneProfessor(resul.getString("telefoneProfessor"));
			pro.setNomeProfessor(resul.getString("nomeProfessor"));
			pro.setSenha(resul.getString("senha"));
			pro.setEmailProfessor(resul.getString("emailProfessor"));
			
<<<<<<< HEAD
			
			}
			preparador.close();
		} catch (SQLException e) {
			// TODO: handle exception

			System.out.println("N�o foi poss�vel consultar matr�cula no sistema.");

			e.printStackTrace();
		}
		return pro;
		 
	}
	

	public Professor autenticar(Professor professor){
		
		String sql = "SELECT * FROM professor WHERE matriculaProfessor=?";
		
		Professor profRetorno = null;
		
		try {
			
			
			PreparedStatement preparador = con.prepareStatement(sql);
			preparador.setInt(1, professor.getMatriculaProfessor());
			
			ResultSet resul = preparador.executeQuery();
			
			if(resul.next()){
				
			 profRetorno = new Professor();
			
			
			profRetorno.setMatriculaProfessor(resul.getInt("matriculaProfessor"));
			profRetorno.setDataNascProfessor(resul.getString("dataNascProfessor"));
			profRetorno.setTelefoneProfessor(resul.getString("telefoneProfessor"));
			profRetorno.setNomeProfessor(resul.getString("nomeProfessor"));
			profRetorno.setSenha(resul.getString("senha"));
			profRetorno.setEmailProfessor(resul.getString("emailProfessor"));
			
			
			}
			preparador.close();
		} catch (SQLException e) {
			// TODO: handle exception

			System.out.println("N�o foi poss�vel altenticar no sistema.");

			e.printStackTrace();
		}
		return profRetorno;
		 
	}
	public Boolean existeUsuario(Professor professor){
		
		String sql = "SELECT * FROM professor WHERE matriculaProfessor=?";
		boolean ret = false;
		
		try {
			
			
			PreparedStatement preparador = con.prepareStatement(sql);
			preparador.setInt(1, professor.getMatriculaProfessor());
			
			ResultSet resul = preparador.executeQuery();
			
			ret =resul.next();
			preparador.close();
		} catch (SQLException e) {
			// TODO: handle exception

			System.out.println("Professor n�o existe no sistema.");

			e.printStackTrace();
		}
		return ret;
		 
	}
	
	
	
	
=======
			prolista.add(pro);
			
			
			
			
			}
			
		} catch (SQLException e) {
			// TODO: handle exception

			System.out.println("N�o foi poss�vel consultar no sistema.");

			e.printStackTrace();
		}
		return prolista;
		 
	}

>>>>>>> 06bf4517ac507a8f128966235204ad40b0dc7315
}
