package br.com.infox.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.infox.entidades.Cursar;

public class CursarDAO {

private Connection con = Conexao.getConnection();
	
	
	public void Cadastrar(Cursar cursar){
		
		String sql = "INSERT INTO cursar( falta, nota, matriculaAluno, idDisciplina )VALUES(?,?,?,?)";
		
		try {
			
			
			PreparedStatement preparador = con.prepareStatement(sql);
			preparador.setString(1, cursar.getFalta());
			preparador.setString(2, cursar.getNota());
			preparador.setInt(3, cursar.getMatriculaAluno());
			preparador.setInt(4, cursar.getIdDisciplina());
			
			
			
			
			preparador.execute();
			preparador.close();
			
			System.out.println("Cursar cadastrado no sistema!");
			
		} catch (SQLException e) {
			// TODO: handle exception

			System.out.println("Não foi possível cadastrar no sistema.");

			e.printStackTrace();
		}
		 


}
	
	public void Alterar(Cursar cursar){
		
		String sql = "UPDATE cursar SET falta=?, nota=?, matriculaAluno=?, idDisciplina=? WHERE idDisciplina=?";
		
		try {
			
			
			PreparedStatement preparador = con.prepareStatement(sql);
			preparador.setString(1, cursar.getFalta());
			preparador.setString(2, cursar.getNota());
			preparador.setInt(3, cursar.getMatriculaAluno());
			preparador.setInt(4, cursar.getIdDisciplina());
			
			
			
			
			preparador.execute();
			preparador.close();
			
			System.out.println("Cursar cadastrado no sistema!");
			
		} catch (SQLException e) {
			// TODO: handle exception

			System.out.println("Não foi possível cadastrar no sistema.");

			e.printStackTrace();
		}
		 


}
	
	
	
	public void Excluir(Cursar cursar){
		
		String sql = "DELETE FROM cursar WHERE idDisciplina=?";
		
		try {
			
			
			PreparedStatement preparador = con.prepareStatement(sql);
			preparador.setInt(1, cursar.getIdDisciplina());
			
			
			
			
			preparador.execute();
			preparador.close();
			
			System.out.println("Cursar excluído no sistema!");
			
		} catch (SQLException e) {
			// TODO: handle exception

			System.out.println("Não foi possível excluir no sistema.");

			e.printStackTrace();
		}
		 


}
	
	
	
	
	public List<Cursar> BuscarMatriculaAluno(int matriculaAluno){
		
		String sql = "SELECT * FROM cursar WHERE matriculaAluno=?";
		List<Cursar> curlista = new ArrayList<Cursar>();

		
		try {
			
			
			PreparedStatement preparador = con.prepareStatement(sql);
			preparador.setInt(1, matriculaAluno);
			
			
			ResultSet resul = preparador.executeQuery();
			
			while(resul.next()){
				
			Cursar cur = new Cursar();
			
			cur.setMatriculaAluno(resul.getInt("matriculaAluno"));
			cur.setIdDisciplina(resul.getInt("idDisciplina"));
			cur.setNota(resul.getString("nota"));
			cur.setFalta(resul.getString("falta"));
			
			curlista.add(cur);
			
			
			
			
			}
			
		} catch (SQLException e) {
			// TODO: handle exception

			System.out.println("Não foi possível consultar no sistema.");

			e.printStackTrace();
		}
		return curlista;
		 
	}
}
