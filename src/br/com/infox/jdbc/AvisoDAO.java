package br.com.infox.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.infox.entidades.Aviso;

public class AvisoDAO {

	
<<<<<<< HEAD

=======
<<<<<<< HEAD
=======
	
>>>>>>> 690cb9829f1cafbfc5850e578f4bd2d50b1fc298
>>>>>>> 06bf4517ac507a8f128966235204ad40b0dc7315
private Connection con = Conexao.getConnection();
	
	
	public void Cadastrar(Aviso aviso){
		
		String sql = "INSERT INTO aviso( nomeAviso, idAviso, horaPublicacao, idDiscipl, mensagemaviso )VALUES(?,?,?,?,?)";
		
		try {
			
			
			PreparedStatement preparador = con.prepareStatement(sql);
			preparador.setString(1, aviso.getNomeAviso());
			preparador.setInt(2, aviso.getIdAviso());
			preparador.setString(3, aviso.getHoraPublicacao());
			preparador.setInt(4, aviso.getIdDisciplina());
			preparador.setString(5, aviso.getMensagemaviso());
			
			
			
			
			preparador.execute();
			preparador.close();
			
			System.out.println("Aviso cadastrado no sistema!");
			
		} catch (SQLException e) {
			// TODO: handle exception

			System.out.println("Não foi possível cadastrar no sistema.");

			e.printStackTrace();
		}
		 


}
	
	
	public void Alterar(Aviso aviso){
		
<<<<<<< HEAD
		String sql = "UPDATE aviso SET nomeAviso=?, horaPublicacao=?, idDiscipl=?, mensagemaviso=? WHERE idAviso=?";
=======
		String sql = "UPDATE aviso SET nomeAviso=?, idAviso=?, horaPublicacao=?, idDiscipl=?, mensagemaviso=? WHERE idAviso=?";
>>>>>>> 06bf4517ac507a8f128966235204ad40b0dc7315
		
		try {
			
			
			PreparedStatement preparador = con.prepareStatement(sql);
			preparador.setString(1, aviso.getNomeAviso());
<<<<<<< HEAD
			preparador.setString(2, aviso.getHoraPublicacao());
			preparador.setInt(3, aviso.getIdDisciplina());
			preparador.setString(4, aviso.getMensagemaviso());
			preparador.setInt(5, aviso.getIdAviso());
=======
			preparador.setInt(2, aviso.getIdAviso());
			preparador.setString(3, aviso.getHoraPublicacao());
			preparador.setInt(4, aviso.getIdDisciplina());
			preparador.setString(5, aviso.getMensagemaviso());
>>>>>>> 06bf4517ac507a8f128966235204ad40b0dc7315

			
			
			
			
			preparador.execute();
			preparador.close();
			
<<<<<<< HEAD
			System.out.println("Aviso alterado no sistema!");
=======
			System.out.println("Aviso cadastrado no sistema!");
>>>>>>> 06bf4517ac507a8f128966235204ad40b0dc7315
			
		} catch (SQLException e) {
			// TODO: handle exception

<<<<<<< HEAD
			System.out.println("Não foi possível alterado no sistema.");
=======
			System.out.println("Não foi possível cadastrar no sistema.");
>>>>>>> 06bf4517ac507a8f128966235204ad40b0dc7315

			e.printStackTrace();
		}
		 


}

	
	public void Excluir(Aviso aviso){
		
		String sql = "DELETE FROM aviso WHERE idAviso=?";
		
		try {
			
			
			PreparedStatement preparador = con.prepareStatement(sql);
			preparador.setInt(1, aviso.getIdAviso());
			
			
			
			
			preparador.execute();
			preparador.close();
			
			System.out.println("Aviso excluído no sistema!");
			
		} catch (SQLException e) {
			// TODO: handle exception

			System.out.println("Não foi possível excluir no sistema.");

			e.printStackTrace();
		}
		 


}

<<<<<<< HEAD

	public List<Aviso> BuscarTodos(){
		
		String sql = "SELECT * FROM aviso";
=======
	
	public List<Aviso> BuscarIdAviso(int idAviso){
		
		String sql = "SELECT * FROM aviso WHERE idAviso=?";
>>>>>>> 06bf4517ac507a8f128966235204ad40b0dc7315
		List<Aviso> avilista = new ArrayList<Aviso>();

		
		try {
			
			
			PreparedStatement preparador = con.prepareStatement(sql);
<<<<<<< HEAD
=======
			preparador.setInt(1, idAviso);
>>>>>>> 06bf4517ac507a8f128966235204ad40b0dc7315
			
			
			ResultSet resul = preparador.executeQuery();
			
			while(resul.next()){
				
			Aviso avi = new Aviso();
			
			avi.setNomeAviso(resul.getString("nomeAviso"));
			avi.setIdAviso(resul.getInt("idAviso"));
			avi.setHoraPublicacao(resul.getString("horaPublicacao"));
			avi.setIdDisciplina(resul.getInt("idDiscipl"));
			avi.setMensagemaviso(resul.getString("mensagemaviso"));

			avilista.add(avi);
			
			
<<<<<<< HEAD
			}
			preparador.close();
			
		} catch (SQLException e) {
			// TODO: handle exception

			System.out.println("Não foi possível consultar no sistema.");

			e.printStackTrace();
		}
		return avilista;
		 
	}
	
	
	public Aviso BuscarIdAviso(int idAviso){
		
		String sql = "SELECT * FROM aviso WHERE idAviso=?";
		Aviso avi =null;

		
		try {
			
			
			PreparedStatement preparador = con.prepareStatement(sql);
			preparador.setInt(1, idAviso);
			
			
			ResultSet resul = preparador.executeQuery();
			
			if(resul.next()){
				avi = new Aviso();
			
			avi.setNomeAviso(resul.getString("nomeAviso"));
			avi.setIdAviso(resul.getInt("idAviso"));
			avi.setHoraPublicacao(resul.getString("horaPublicacao"));
			avi.setIdDisciplina(resul.getInt("idDiscipl"));
			avi.setMensagemaviso(resul.getString("mensagemaviso"));
			
			}
			preparador.close();
=======
			
			
			
			
			}
>>>>>>> 06bf4517ac507a8f128966235204ad40b0dc7315
			
		} catch (SQLException e) {
			// TODO: handle exception

			System.out.println("Não foi possível consultar no sistema.");

			e.printStackTrace();
		}
<<<<<<< HEAD
		return avi;
		 
	}
	
=======
		return avilista;
		 
	}
<<<<<<< HEAD
=======
	
	
>>>>>>> 690cb9829f1cafbfc5850e578f4bd2d50b1fc298
>>>>>>> 06bf4517ac507a8f128966235204ad40b0dc7315
}
