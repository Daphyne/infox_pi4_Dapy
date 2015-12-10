package br.com.infox.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.infox.entidades.Aviso;

public class AvisoDAO {

	

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

			System.out.println("N�o foi poss�vel cadastrar no sistema.");

			e.printStackTrace();
		}
		 


}
	
	
	public void Alterar(Aviso aviso){
		
		String sql = "UPDATE aviso SET nomeAviso=?, horaPublicacao=?, idDiscipl=?, mensagemaviso=? WHERE idAviso=?";
		
		try {
			
			
			PreparedStatement preparador = con.prepareStatement(sql);
			preparador.setString(1, aviso.getNomeAviso());
			preparador.setString(2, aviso.getHoraPublicacao());
			preparador.setInt(3, aviso.getIdDisciplina());
			preparador.setString(4, aviso.getMensagemaviso());
			preparador.setInt(5, aviso.getIdAviso());

			
			
			
			
			preparador.execute();
			preparador.close();
			
			System.out.println("Aviso alterado no sistema!");
			
		} catch (SQLException e) {
			// TODO: handle exception

			System.out.println("N�o foi poss�vel alterado no sistema.");

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
			
			System.out.println("Aviso exclu�do no sistema!");
			
		} catch (SQLException e) {
			// TODO: handle exception

			System.out.println("N�o foi poss�vel excluir no sistema.");

			e.printStackTrace();
		}
		 


}


	public List<Aviso> BuscarTodos(){
		
		String sql = "SELECT * FROM aviso";
		List<Aviso> avilista = new ArrayList<Aviso>();

		
		try {
			
			
			PreparedStatement preparador = con.prepareStatement(sql);
			
			
			ResultSet resul = preparador.executeQuery();
			
			while(resul.next()){
				
			Aviso avi = new Aviso();
			
			avi.setNomeAviso(resul.getString("nomeAviso"));
			avi.setIdAviso(resul.getInt("idAviso"));
			avi.setHoraPublicacao(resul.getString("horaPublicacao"));
			avi.setIdDisciplina(resul.getInt("idDiscipl"));
			avi.setMensagemaviso(resul.getString("mensagemaviso"));

			avilista.add(avi);
			
			
			}
			preparador.close();
			
		} catch (SQLException e) {
			// TODO: handle exception

			System.out.println("N�o foi poss�vel consultar no sistema.");

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
			
		} catch (SQLException e) {
			// TODO: handle exception

			System.out.println("N�o foi poss�vel consultar no sistema.");

			e.printStackTrace();
		}
		return avi;
		 
	}
	
}