package br.com.infox.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.infox.entidades.Cursar;

public class CursarDAO {
<<<<<<< HEAD


=======
<<<<<<< HEAD

=======
	
>>>>>>> 690cb9829f1cafbfc5850e578f4bd2d50b1fc298
>>>>>>> 06bf4517ac507a8f128966235204ad40b0dc7315
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
		
<<<<<<< HEAD
		String sql = "UPDATE cursar SET falta=?, nota=?, matriculaAluno=? WHERE idDisciplina=?";
=======
		String sql = "UPDATE cursar SET falta=?, nota=?, matriculaAluno=?, idDisciplina=? WHERE idDisciplina=?";
>>>>>>> 06bf4517ac507a8f128966235204ad40b0dc7315
		
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
		
<<<<<<< HEAD
		String sql = "DELETE FROM cursar WHERE matriculaAluno=?";
=======
		String sql = "DELETE FROM cursar WHERE idDisciplina=?";
>>>>>>> 06bf4517ac507a8f128966235204ad40b0dc7315
		
		try {
			
			
			PreparedStatement preparador = con.prepareStatement(sql);
<<<<<<< HEAD
			preparador.setInt(1, cursar.getMatriculaAluno());
=======
			preparador.setInt(1, cursar.getIdDisciplina());
>>>>>>> 06bf4517ac507a8f128966235204ad40b0dc7315
			
			
			
			
			preparador.execute();
			preparador.close();
			
			System.out.println("Cursar excluído no sistema!");
			
		} catch (SQLException e) {
			// TODO: handle exception

			System.out.println("Não foi possível excluir no sistema.");

			e.printStackTrace();
		}
		 


}
	
	
	
<<<<<<< HEAD

	public List<Cursar> BuscarTodos(){
		
		String sql = "SELECT * FROM cursar";
=======
	
	public List<Cursar> BuscarMatriculaAluno(int matriculaAluno){
		
		String sql = "SELECT * FROM cursar WHERE matriculaAluno=?";
>>>>>>> 06bf4517ac507a8f128966235204ad40b0dc7315
		List<Cursar> curlista = new ArrayList<Cursar>();

		
		try {
			
			
			PreparedStatement preparador = con.prepareStatement(sql);
<<<<<<< HEAD
=======
			preparador.setInt(1, matriculaAluno);
>>>>>>> 06bf4517ac507a8f128966235204ad40b0dc7315
			
			
			ResultSet resul = preparador.executeQuery();
			
			while(resul.next()){
				
			Cursar cur = new Cursar();
			
<<<<<<< HEAD
			cur.setFalta(resul.getString("falta"));
			cur.setNota(resul.getString("nota"));
			cur.setMatriculaAluno(resul.getInt("matriculaAluno"));
			cur.setIdDisciplina(resul.getInt("idDisciplina"));
=======
			cur.setMatriculaAluno(resul.getInt("matriculaAluno"));
			cur.setIdDisciplina(resul.getInt("idDisciplina"));
			cur.setNota(resul.getString("nota"));
			cur.setFalta(resul.getString("falta"));
>>>>>>> 06bf4517ac507a8f128966235204ad40b0dc7315
			
			curlista.add(cur);
			
			
			
			
			}
<<<<<<< HEAD
			preparador.close();
=======
>>>>>>> 06bf4517ac507a8f128966235204ad40b0dc7315
			
		} catch (SQLException e) {
			// TODO: handle exception

			System.out.println("Não foi possível consultar no sistema.");

			e.printStackTrace();
		}
		return curlista;
		 
	}
<<<<<<< HEAD
	
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
=======
<<<<<<< HEAD
=======

>>>>>>> 690cb9829f1cafbfc5850e578f4bd2d50b1fc298
>>>>>>> 06bf4517ac507a8f128966235204ad40b0dc7315
}
