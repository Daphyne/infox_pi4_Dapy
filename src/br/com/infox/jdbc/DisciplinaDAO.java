package br.com.infox.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.infox.entidades.Disciplina;

public class DisciplinaDAO {
<<<<<<< HEAD

	

=======
<<<<<<< HEAD

=======
	
>>>>>>> 690cb9829f1cafbfc5850e578f4bd2d50b1fc298
	
>>>>>>> 06bf4517ac507a8f128966235204ad40b0dc7315
private Connection con = Conexao.getConnection();
	
	
	public void Cadastrar(Disciplina disciplina){
		
		String sql = "INSERT INTO disciplina(idDisciplina ,nomeDisciplina, matriculaProfessor , telefoneProfessor , emailProfessor )VALUES(?,?,?,?,?)";
		
		try {
			
			
			PreparedStatement preparador = con.prepareStatement(sql);
			preparador.setInt(1, disciplina.getIdDisciplina());
			preparador.setString(2, disciplina.getNomeDisciplina());
			preparador.setInt(3, disciplina.getMatriculaProfessor());
			preparador.setString(4, disciplina.getTelefoneProfessor());
			preparador.setString(5, disciplina.getEmailProfessor());
			
			
			
			preparador.execute();
			preparador.close();
			
			System.out.println("Disciplina cadastrada no sistema!");
			
		} catch (SQLException e) {
			// TODO: handle exception

			System.out.println("Não foi possível cadastrar no sistema.");

			e.printStackTrace();
		}
		 


}
	
	
	public void Alterar(Disciplina disciplina){
		
<<<<<<< HEAD
		String sql = "UPDATE disciplina SET nomeDisciplina=?, matriculaProfessor=? , telefoneProfessor=? , emailProfessor=? WHERE idDisciplina=? ";
=======
		String sql = "UPDATE disciplina SET idDisciplina=? ,nomeDisciplina=?, matriculaProfessor=? , telefoneProfessor=? , emailProfessor=? WHERE idDisciplina=? ";
>>>>>>> 06bf4517ac507a8f128966235204ad40b0dc7315
		
		try {
			
			
			PreparedStatement preparador = con.prepareStatement(sql);
<<<<<<< HEAD
			
			preparador.setString(1, disciplina.getNomeDisciplina());
			preparador.setInt(2, disciplina.getMatriculaProfessor());
			preparador.setString(3, disciplina.getTelefoneProfessor());
			preparador.setString(4, disciplina.getEmailProfessor());
			preparador.setInt(5, disciplina.getIdDisciplina());
=======
			preparador.setInt(1, disciplina.getIdDisciplina());
			preparador.setString(2, disciplina.getNomeDisciplina());
			preparador.setInt(3, disciplina.getMatriculaProfessor());
			preparador.setString(4, disciplina.getTelefoneProfessor());
			preparador.setString(5, disciplina.getEmailProfessor());
			
>>>>>>> 06bf4517ac507a8f128966235204ad40b0dc7315
			
			
			preparador.execute();
			preparador.close();
			
			System.out.println("Disciplina alterada no sistema!");
			
		} catch (SQLException e) {
			// TODO: handle exception

			System.out.println("Não foi possível alterar no sistema.");

			e.printStackTrace();
		}
		 


}
	
	
	public void Excluir(Disciplina disciplina){
		
		String sql = "DELETE FROM disciplina WHERE idDisciplina=? ";
		
		try {
			
			
			PreparedStatement preparador = con.prepareStatement(sql);
			preparador.setInt(1, disciplina.getIdDisciplina());
			
			
			
			preparador.execute();
			preparador.close();
			
			System.out.println("Disciplina excluída no sistema!");
			
		} catch (SQLException e) {
			// TODO: handle exception

			System.out.println("Não foi possível excluir no sistema.");

			e.printStackTrace();
		}
		 


}
	
<<<<<<< HEAD

	public List<Disciplina> BuscarTodos(){
		
		String sql = "SELECT * FROM disciplina ";
		List<Disciplina> dislista = new ArrayList<Disciplina>();

		
		try {
			
			
			PreparedStatement preparador = con.prepareStatement(sql);
			
			
			ResultSet resul = preparador.executeQuery();
			
			while(resul.next()){
				
			Disciplina dis = new Disciplina();
			
			dis.setIdDisciplina(resul.getInt("idDisciplina"));
			dis.setNomeDisciplina(resul.getString("nomeDisciplina"));
			dis.setMatriculaProfessor(resul.getInt("matriculaProfessor"));
			dis.setTelefoneProfessor(resul.getString("telefoneProfessor"));
			dis.setEmailProfessor(resul.getString("emailProfessor"));
			
			dislista.add(dis);
			
			
			
			}
			
			preparador.close();

			
		} catch (SQLException e) {
			// TODO: handle exception

			System.out.println("Não foi possível consultar no sistema.");

			e.printStackTrace();
		}
		return dislista;
		 
	}
	
	
	
	public Disciplina BuscarIdDisciplina(int idDisciplina){
		
		String sql = "SELECT * FROM disciplina WHERE idDisciplina=?";
		Disciplina dis  = null;
=======
	
	
	
	public List<Disciplina> BuscarIdDisciplina(int idDisciplina){
		
		String sql = "SELECT * FROM disciplina WHERE idDisciplina=?";
		List<Disciplina> dislista = new ArrayList<Disciplina>();
>>>>>>> 06bf4517ac507a8f128966235204ad40b0dc7315

		
		try {
			
			
			PreparedStatement preparador = con.prepareStatement(sql);
			preparador.setInt(1, idDisciplina);
			
			
			ResultSet resul = preparador.executeQuery();
			
			while(resul.next()){
				
<<<<<<< HEAD
			 dis = new Disciplina();
=======
			Disciplina dis = new Disciplina();
>>>>>>> 06bf4517ac507a8f128966235204ad40b0dc7315
			
			dis.setIdDisciplina(resul.getInt("idDisciplina"));
			dis.setNomeDisciplina(resul.getString("nomeDisciplina"));
			dis.setMatriculaProfessor(resul.getInt("matriculaProfessor"));
			dis.setTelefoneProfessor(resul.getString("telefoneProfessor"));
			dis.setEmailProfessor(resul.getString("emailProfessor"));
			
<<<<<<< HEAD
			
			
			}
			preparador.close();
=======
			dislista.add(dis);
			
			
			}
>>>>>>> 06bf4517ac507a8f128966235204ad40b0dc7315
			
		} catch (SQLException e) {
			// TODO: handle exception

			System.out.println("Não foi possível consultar no sistema.");

			e.printStackTrace();
		}
<<<<<<< HEAD
		return dis;
		 
	}

=======
		return dislista;
		 
	}
<<<<<<< HEAD
=======
	
>>>>>>> 690cb9829f1cafbfc5850e578f4bd2d50b1fc298
>>>>>>> 06bf4517ac507a8f128966235204ad40b0dc7315
}
