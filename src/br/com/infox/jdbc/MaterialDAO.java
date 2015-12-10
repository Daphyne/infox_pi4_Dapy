package br.com.infox.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.infox.entidades.Material;

public class MaterialDAO {
<<<<<<< HEAD


=======
<<<<<<< HEAD

=======
	
	
>>>>>>> 690cb9829f1cafbfc5850e578f4bd2d50b1fc298
>>>>>>> 06bf4517ac507a8f128966235204ad40b0dc7315
private Connection con = Conexao.getConnection();
	
	
	public void Cadastrar(Material material){
		
		String sql = "INSERT INTO material(caminho, nomeMaterial, idMaterial, idDisciplin)VALUES(?,?,?,?)";
		
		try {
			
			
			PreparedStatement preparador = con.prepareStatement(sql);
			preparador.setString(1, material.getCaminho());
			preparador.setString(2, material.getNomeMaterial());
			preparador.setInt(3, material.getIdMaterial());
			preparador.setInt(4, material.getIdDisciplina());
			
			
			
			
			preparador.execute();
			preparador.close();
			
			System.out.println("Material cadastrado no sistema!");
			
		} catch (SQLException e) {
			// TODO: handle exception

			System.out.println("N�o foi poss�vel cadastrar no sistema.");

			e.printStackTrace();
		}
		 


}
	
	public void Alterar(Material material){
		
<<<<<<< HEAD
		String sql = "UPDATE material SET caminho=?, nomeMaterial=?, idDisciplin=? WHERE idMaterial=?";
=======
		String sql = "UPDATE material SET caminho=?, nomeMaterial=?, idMaterial=?, idDisciplin=? WHERE idMaterial=?";
>>>>>>> 06bf4517ac507a8f128966235204ad40b0dc7315
		
		try {
			
			
			PreparedStatement preparador = con.prepareStatement(sql);
			preparador.setString(1, material.getCaminho());
			preparador.setString(2, material.getNomeMaterial());
<<<<<<< HEAD
			preparador.setInt(3, material.getIdDisciplina());
			preparador.setInt(4, material.getIdMaterial());
=======
			preparador.setInt(3, material.getIdMaterial());
			preparador.setInt(4, material.getIdDisciplina());
			
>>>>>>> 06bf4517ac507a8f128966235204ad40b0dc7315
			
			
			
			preparador.execute();
			preparador.close();
			
			System.out.println("Material cadastrado no sistema!");
			
		} catch (SQLException e) {
			// TODO: handle exception

			System.out.println("N�o foi poss�vel cadastrar no sistema.");

			e.printStackTrace();
		}
		 


}
	
	
	public void Excluir(Material material){
		
		String sql = "DELETE FROM material WHERE idMaterial=?";
		
		try {
			
			
			PreparedStatement preparador = con.prepareStatement(sql);
			preparador.setInt(1, material.getIdMaterial());
			
			
			
			
			preparador.execute();
			preparador.close();
			
			System.out.println("Material exclu�do no sistema!");
			
		} catch (SQLException e) {
			// TODO: handle exception

			System.out.println("N�o foi poss�vel excluir no sistema.");

			e.printStackTrace();
		}
		 


}
	
<<<<<<< HEAD


	public List<Material> BuscarTodos(){
		
		String sql = "SELECT * FROM material";
=======
	
	public List<Material> BuscarIdMaterial(int idMaterial){
		
		String sql = "SELECT * FROM material WHERE idMaterial=?";
>>>>>>> 06bf4517ac507a8f128966235204ad40b0dc7315
		List<Material> materlista = new ArrayList<Material>();

		
		try {
			
			
			PreparedStatement preparador = con.prepareStatement(sql);
<<<<<<< HEAD
=======
			preparador.setInt(1, idMaterial);
>>>>>>> 06bf4517ac507a8f128966235204ad40b0dc7315
			
			
			ResultSet resul = preparador.executeQuery();
			
			while(resul.next()){
				
			Material mater = new Material();
			
			
			mater.setCaminho(resul.getString("caminho"));
			mater.setNomeMaterial(resul.getString("nomeMaterial"));
			mater.setIdMaterial(resul.getInt("idMaterial"));
			mater.setIdDisciplina(resul.getInt("idDisciplin"));
			
			materlista.add(mater);
<<<<<<< HEAD
		
			
			}
			preparador.close();
			
		} catch (SQLException e) {
			// TODO: handle exception

			System.out.println("N�o foi poss�vel consultar no sistema.");

			e.printStackTrace();
		}
		return materlista;
		 
	}
	public Material BuscarIdMaterial(int idMaterial){
		
		String sql = "SELECT * FROM material WHERE idMaterial=?";
		Material mater = null;

		
		try {
			
			
			PreparedStatement preparador = con.prepareStatement(sql);
			preparador.setInt(1, idMaterial);
			
			
			ResultSet resul = preparador.executeQuery();
			
			while(resul.next()){
				
			 mater = new Material();
			
			
			mater.setCaminho(resul.getString("caminho"));
			mater.setNomeMaterial(resul.getString("nomeMaterial"));
			mater.setIdMaterial(resul.getInt("idMaterial"));
			mater.setIdDisciplina(resul.getInt("idDisciplin"));
			
			
			
			}
			preparador.close();
=======
			
			
			
			
			}
>>>>>>> 06bf4517ac507a8f128966235204ad40b0dc7315
			
		} catch (SQLException e) {
			// TODO: handle exception

			System.out.println("N�o foi poss�vel consultar no sistema.");

			e.printStackTrace();
		}
<<<<<<< HEAD
		return mater;
		 
	}
	

=======
		return materlista;
		 
	}
<<<<<<< HEAD
=======


>>>>>>> 690cb9829f1cafbfc5850e578f4bd2d50b1fc298
>>>>>>> 06bf4517ac507a8f128966235204ad40b0dc7315
}
