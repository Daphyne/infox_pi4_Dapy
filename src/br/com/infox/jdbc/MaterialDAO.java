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
	
	
>>>>>>> 690cb9829f1cafbfc5850e578f4bd2d50b1fc298
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

			System.out.println("Não foi possível cadastrar no sistema.");

			e.printStackTrace();
		}
		 


}
	
	public void Alterar(Material material){
		
		String sql = "UPDATE material SET caminho=?, nomeMaterial=?, idMaterial=?, idDisciplin=? WHERE idMaterial=?";
		
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

			System.out.println("Não foi possível cadastrar no sistema.");

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
			
			System.out.println("Material excluído no sistema!");
			
		} catch (SQLException e) {
			// TODO: handle exception

			System.out.println("Não foi possível excluir no sistema.");

			e.printStackTrace();
		}
		 


}
	
	
	public List<Material> BuscarIdMaterial(int idMaterial){
		
		String sql = "SELECT * FROM material WHERE idMaterial=?";
		List<Material> materlista = new ArrayList<Material>();

		
		try {
			
			
			PreparedStatement preparador = con.prepareStatement(sql);
			preparador.setInt(1, idMaterial);
			
			
			ResultSet resul = preparador.executeQuery();
			
			while(resul.next()){
				
			Material mater = new Material();
			
			
			mater.setCaminho(resul.getString("caminho"));
			mater.setNomeMaterial(resul.getString("nomeMaterial"));
			mater.setIdMaterial(resul.getInt("idMaterial"));
			mater.setIdDisciplina(resul.getInt("idDisciplin"));
			
			materlista.add(mater);
			
			
			
			
			}
			
		} catch (SQLException e) {
			// TODO: handle exception

			System.out.println("Não foi possível consultar no sistema.");

			e.printStackTrace();
		}
		return materlista;
		 
	}
<<<<<<< HEAD
=======


>>>>>>> 690cb9829f1cafbfc5850e578f4bd2d50b1fc298
}
