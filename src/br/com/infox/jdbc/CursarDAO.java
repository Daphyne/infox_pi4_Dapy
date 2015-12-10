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
		
		String sql = "UPDATE cursar SET falta=?, nota=?, matriculaAluno=? WHERE idDisciplina=?";
		
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
		
		String sql = "DELETE FROM cursar WHERE matriculaAluno=?";
		
		try {
			
			
			PreparedStatement preparador = con.prepareStatement(sql);
			preparador.setInt(1, cursar.getMatriculaAluno());
			
			
			
			
			preparador.execute();
			preparador.close();
			
			System.out.println("Cursar excluído no sistema!");
			
		} catch (SQLException e) {
			// TODO: handle exception

			System.out.println("Não foi possível excluir no sistema.");

			e.printStackTrace();
		}
		 


}
	
	
	

	public List<Cursar> BuscarTodos(){
		
		String sql = "SELECT * FROM cursar";
		List<Cursar> curlista = new ArrayList<Cursar>();

		
		try {
			
			
			PreparedStatement preparador = con.prepareStatement(sql);
			
			
			ResultSet resul = preparador.executeQuery();
			
			while(resul.next()){
				
			Cursar cur = new Cursar();
			
			cur.setFalta(resul.getString("falta"));
			cur.setNota(resul.getString("nota"));
			cur.setMatriculaAluno(resul.getInt("matriculaAluno"));
			cur.setIdDisciplina(resul.getInt("idDisciplina"));
			
			curlista.add(cur);
			
			
			
			
			}
			preparador.close();
			
		} catch (SQLException e) {
			// TODO: handle exception

			System.out.println("Não foi possível consultar no sistema.");

			e.printStackTrace();
		}
		return curlista;
		 
	}
	
	public Cursar BuscarMatriculaAluno(int matriculaAluno){
		
		String sql = "SELECT * FROM cursar WHERE matriculaAluno=?";
		Cursar cur = null;

		
		try {
			
			
			PreparedStatement preparador = con.prepareStatement(sql);
			preparador.setInt(1, matriculaAluno);
			
			
			ResultSet resul = preparador.executeQuery();
			
			if(resul.next()){
				
			cur = new Cursar();

			cur.setFalta(resul.getString("falta"));
			cur.setNota(resul.getString("nota"));
			cur.setMatriculaAluno(resul.getInt("matriculaAluno"));
			cur.setIdDisciplina(resul.getInt("idDisciplina"));
			
			
			
			
			}
			preparador.close();
			
		} catch (SQLException e) {
			// TODO: handle exception

			System.out.println("Não foi possível consultar no sistema.");

			e.printStackTrace();
		}
		return cur;
		 
	}
}
