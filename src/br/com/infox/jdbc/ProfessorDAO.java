package br.com.infox.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.infox.entidades.Professor;

public class ProfessorDAO {

private Connection con = Conexao.getConnection();
	
	
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

			System.out.println("Não foi possível cadastrar no sistema.");

			e.printStackTrace();
		}
		 
	}
	
	
	
	public void Alterar(Professor professor){
		
		String sql = "UPDATE professor SET matriculaProfessor=?, dataNascProfessor=?, telefoneProfessor=?, nomeProfessor=?, senha=?, emailProfessor=? WHERE matriculaProfessor=?";
		
		try {
			
			
			PreparedStatement preparador = con.prepareStatement(sql);
			preparador.setInt(1, professor.getMatriculaProfessor());
			preparador.setString(2, professor.getDataNascProfessor());
			preparador.setString(3, professor.getTelefoneProfessor());
			preparador.setString(4, professor.getNomeProfessor());
			preparador.setString(5, professor.getSenha());
			preparador.setString(7, professor.getEmailProfessor());
			
			
			preparador.execute();
			preparador.close();
			
			System.out.println("Professor alterado no sistema!");
			
		} catch (SQLException e) {
			// TODO: handle exception

			System.out.println("Não foi possível alterar no sistema.");

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
			
			System.out.println("Professor excluído no sistema!");
			
		} catch (SQLException e) {
			// TODO: handle exception

			System.out.println("Não foi possível excluir no sistema.");

			e.printStackTrace();
		}
		 
	}
	
	
	public List<Professor> BuscarMatricula(int matriculaProfessor){
		
		String sql = "SELECT * FROM professor WHERE matriculaProfessor=?";
		List<Professor> prolista = new ArrayList<Professor>();

		
		try {
			
			
			PreparedStatement preparador = con.prepareStatement(sql);
			preparador.setInt(1, matriculaProfessor);
			
			
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
			
		} catch (SQLException e) {
			// TODO: handle exception

			System.out.println("Não foi possível consultar no sistema.");

			e.printStackTrace();
		}
		return prolista;
		 
	}

}
