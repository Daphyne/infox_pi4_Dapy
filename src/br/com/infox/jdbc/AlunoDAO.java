package br.com.infox.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.infox.entidades.Aluno;

public class AlunoDAO {

<<<<<<< HEAD
=======
	
>>>>>>> 690cb9829f1cafbfc5850e578f4bd2d50b1fc298
private Connection con = Conexao.getConnection();
	
	
	public void Cadastrar(Aluno aluno){
		
		String sql = "INSERT INTO aluno(matriculaAluno , telefoneAluno , emailAluno , dataNacAluno , nomeAluno , endereco , senha )VALUES(?,?,?,?,?,?,?)";
		
		try {
			
			
			PreparedStatement preparador = con.prepareStatement(sql);
			preparador.setInt(1, aluno.getMatriculaAluno());
			preparador.setString(2, aluno.getTelefoneAluno());
			preparador.setString(3, aluno.getEmailAluno());
			preparador.setString(4, aluno.getDataNacAluno());
			preparador.setString(5, aluno.getNomeAluno());
			preparador.setString(6, aluno.getEndereco());
			preparador.setString(7, aluno.getSenha());
			
			
			
			
			preparador.execute();
			preparador.close();
			
			System.out.println("Aluno cadastrado no sistema!");
			
		} catch (SQLException e) {
			// TODO: handle exception

			System.out.println("Não foi possível cadastrar no sistema.");

			e.printStackTrace();
		}
		 


}
	
	
	
	public void Alterar(Aluno aluno){
		
		String sql = "UPDATE aluno SET matriculaAluno=? , telefoneAluno=? , emailAluno=? , dataNacAluno=? , nomeAluno=? , endereco=? , senha=? WHERE matriculaAluno=?";
		
		try {
			
			
			PreparedStatement preparador = con.prepareStatement(sql);
			preparador.setInt(1, aluno.getMatriculaAluno());
			preparador.setString(2, aluno.getTelefoneAluno());
			preparador.setString(3, aluno.getEmailAluno());
			preparador.setString(4, aluno.getDataNacAluno());
			preparador.setString(5, aluno.getNomeAluno());
			preparador.setString(6, aluno.getEndereco());
			preparador.setString(7, aluno.getSenha());
			
			
			
			
			preparador.execute();
			preparador.close();
			
			System.out.println("Aluno cadastrado no sistema!");
			
		} catch (SQLException e) {
			// TODO: handle exception

			System.out.println("Não foi possível cadastrar no sistema.");

			e.printStackTrace();
		}
		 


}
	
	
	
	public void Excluir(Aluno aluno){
		
		String sql = "DELETE FROM aluno WHERE matriculaAluno=?";
		
		try {
			
			
			PreparedStatement preparador = con.prepareStatement(sql);
			preparador.setInt(1, aluno.getMatriculaAluno());
			
			
			
			
			preparador.execute();
			preparador.close();
			
			System.out.println("Aluno excluído no sistema!");
			
		} catch (SQLException e) {
			// TODO: handle exception

			System.out.println("Não foi possível excluir no sistema.");

			e.printStackTrace();
		}
		 


}
	
	
	
	public List<Aluno> BuscarMatriculaAluno(int matriculaAluno){
		
		String sql = "SELECT * FROM aluno WHERE matriculaAluno=?";
		List<Aluno> alulista = new ArrayList<Aluno>();

		
		try {
			
			
			PreparedStatement preparador = con.prepareStatement(sql);
			preparador.setInt(1, matriculaAluno);
			
			
			ResultSet resul = preparador.executeQuery();
			
			while(resul.next()){
				
			Aluno alu = new Aluno();
			
			alu.setMatriculaAluno(resul.getInt("matriculaAluno"));
			alu.setTelefoneAluno(resul.getString("telefoneAluno"));
			alu.setEmailAluno(resul.getString("emailAluno"));
			alu.setDataNacAluno(resul.getString("dataNacAluno"));
			alu.setNomeAluno(resul.getString("nomeAluno"));
			alu.setEndereco(resul.getString("endereco"));
			alu.setSenha(resul.getString("senha"));
			
			
			alulista.add(alu);
			
			
			
			
			}
			
		} catch (SQLException e) {
			// TODO: handle exception

			System.out.println("Não foi possível consultar no sistema.");

			e.printStackTrace();
		}
		return alulista;

}
}
