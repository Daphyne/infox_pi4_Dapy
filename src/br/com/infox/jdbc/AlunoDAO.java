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
<<<<<<< HEAD
=======
	
>>>>>>> 690cb9829f1cafbfc5850e578f4bd2d50b1fc298
>>>>>>> 06bf4517ac507a8f128966235204ad40b0dc7315
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

			System.out.println("N�o foi poss�vel cadastrar no sistema.");

			e.printStackTrace();
		}
		 


}
	
	
	
	public void Alterar(Aluno aluno){
		
<<<<<<< HEAD
		String sql = "UPDATE aluno SET telefoneAluno=? , emailAluno=? , dataNacAluno=? , nomeAluno=? , endereco=? , senha=? WHERE matriculaAluno=?";
=======
		String sql = "UPDATE aluno SET matriculaAluno=? , telefoneAluno=? , emailAluno=? , dataNacAluno=? , nomeAluno=? , endereco=? , senha=? WHERE matriculaAluno=?";
>>>>>>> 06bf4517ac507a8f128966235204ad40b0dc7315
		
		try {
			
			
			PreparedStatement preparador = con.prepareStatement(sql);
<<<<<<< HEAD
			
			preparador.setString(1, aluno.getTelefoneAluno());
			preparador.setString(2, aluno.getEmailAluno());
			preparador.setString(3, aluno.getDataNacAluno());
			preparador.setString(4, aluno.getNomeAluno());
			preparador.setString(5, aluno.getEndereco());
			preparador.setString(6, aluno.getSenha());
			preparador.setInt(7, aluno.getMatriculaAluno());
=======
			preparador.setInt(1, aluno.getMatriculaAluno());
			preparador.setString(2, aluno.getTelefoneAluno());
			preparador.setString(3, aluno.getEmailAluno());
			preparador.setString(4, aluno.getDataNacAluno());
			preparador.setString(5, aluno.getNomeAluno());
			preparador.setString(6, aluno.getEndereco());
			preparador.setString(7, aluno.getSenha());
>>>>>>> 06bf4517ac507a8f128966235204ad40b0dc7315
			
			
			
			
			preparador.execute();
			preparador.close();
			
			System.out.println("Aluno cadastrado no sistema!");
			
		} catch (SQLException e) {
			// TODO: handle exception

			System.out.println("N�o foi poss�vel cadastrar no sistema.");

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
			
			System.out.println("Aluno exclu�do no sistema!");
			
		} catch (SQLException e) {
			// TODO: handle exception

			System.out.println("N�o foi poss�vel excluir no sistema.");

			e.printStackTrace();
		}
		 


}
	
	
<<<<<<< HEAD
	public List<Aluno> BuscarTodosAlunos (){
		
		String sql = "SELECT * FROM aluno";
=======
	
	public List<Aluno> BuscarMatriculaAluno(int matriculaAluno){
		
		String sql = "SELECT * FROM aluno WHERE matriculaAluno=?";
>>>>>>> 06bf4517ac507a8f128966235204ad40b0dc7315
		List<Aluno> alulista = new ArrayList<Aluno>();

		
		try {
			
			
			PreparedStatement preparador = con.prepareStatement(sql);
<<<<<<< HEAD
=======
			preparador.setInt(1, matriculaAluno);
			
			
>>>>>>> 06bf4517ac507a8f128966235204ad40b0dc7315
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
<<<<<<< HEAD
			preparador.close();
=======
>>>>>>> 06bf4517ac507a8f128966235204ad40b0dc7315
			
		} catch (SQLException e) {
			// TODO: handle exception

			System.out.println("N�o foi poss�vel consultar no sistema.");

			e.printStackTrace();
		}
		return alulista;

}
<<<<<<< HEAD
	
	public Aluno BuscarMatriculaAluno(int matriculaAluno){
		
		String sql = "SELECT * FROM aluno WHERE matriculaAluno=?";
		
		Aluno alu = null;
		
		try {
			
			
			PreparedStatement preparador = con.prepareStatement(sql);
			preparador.setInt(1, matriculaAluno);
			
			
			ResultSet resul = preparador.executeQuery();
			
			if(resul.next()){
				
			alu = new Aluno();
			
			alu.setMatriculaAluno(resul.getInt("matriculaAluno"));
			alu.setTelefoneAluno(resul.getString("telefoneAluno"));
			alu.setEmailAluno(resul.getString("emailAluno"));
			alu.setDataNacAluno(resul.getString("dataNacAluno"));
			alu.setNomeAluno(resul.getString("nomeAluno"));
			alu.setEndereco(resul.getString("endereco"));
			alu.setSenha(resul.getString("senha"));
			
			
			}
			preparador.close();
			
		} catch (SQLException e) {
			// TODO: handle exception

			System.out.println("N�o foi poss�vel consultar no sistema.");

			e.printStackTrace();
		}
		return alu;

}

	public Aluno autenticar(Aluno aluno){
		
		String sql = "SELECT * FROM aluno WHERE matriculaAluno=?";
		Aluno alunoRetorno = null;
		
		try {
			
			
			PreparedStatement preparador = con.prepareStatement(sql);
			preparador.setInt(1, aluno.getMatriculaAluno());
			
			
			ResultSet resul = preparador.executeQuery();
			
			if(resul.next()){
				
			 alunoRetorno = new Aluno();
			
			 alunoRetorno.setMatriculaAluno(resul.getInt("matriculaAluno"));
			 alunoRetorno.setTelefoneAluno(resul.getString("telefoneAluno"));
			 alunoRetorno.setEmailAluno(resul.getString("emailAluno"));
			 alunoRetorno.setDataNacAluno(resul.getString("dataNacAluno"));
			 alunoRetorno.setNomeAluno(resul.getString("nomeAluno"));
			 alunoRetorno.setEndereco(resul.getString("endereco"));
			 alunoRetorno.setSenha(resul.getString("senha"));			
			
			}
			preparador.close();
			
		} catch (SQLException e) {
			// TODO: handle exception

			System.out.println("N�o foi poss�vel consultar no sistema.");

			e.printStackTrace();
		}
		return alunoRetorno;

}
	
	public Boolean exiteUsuario(Aluno aluno){
		
		String sql = "SELECT * FROM aluno WHERE matriculaAluno=? and senha=?";
		boolean ret = false;
		
		try {
			
			
			PreparedStatement preparador = con.prepareStatement(sql);
			preparador.setInt(1, aluno.getMatriculaAluno());
			
			
			ResultSet resul = preparador.executeQuery();
			
			ret =resul.next();

			preparador.close();
			
		} catch (SQLException e) {
			// TODO: handle exception

			System.out.println("Aluno n�o existe no sistema");

			e.printStackTrace();
		}
		return ret;

}
}

=======
}
>>>>>>> 06bf4517ac507a8f128966235204ad40b0dc7315
