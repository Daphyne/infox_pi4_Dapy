package br.com.infox.arquivo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.infox.jdbc.Conexao;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;




public class FileDAO  {


	
private Connection con = (Connection) Conexao.getConnection();
	
	
	public void Cadastrar(FileEntity file){
		
		String sql = "INSERT INTO file(id ,  name , year , month , type)VALUES(?,?,?,?,?)";
		
		try {
			
			
			PreparedStatement preparador = (PreparedStatement) con.prepareStatement(sql);
			preparador.setLong(1, file.getId());
			preparador.setString(2, file.getName());
			preparador.setString(3, file.getYear());
			preparador.setString(4, file.getMonth());
			preparador.setString(5, file.getType());
			
			
			
			
			preparador.execute();
			preparador.close();
			
			System.out.println("Aluno cadastrado no sistema!");
			
		} catch (SQLException e) {
			// TODO: handle exception

			System.out.println("Não foi possível cadastrar no sistema.");

			e.printStackTrace();
		}
		 


}
	
	
	
	public void Alterar(FileEntity file){
		
		String sql = "UPDATE file SET id=? , name=? , year=? , month=? , type=?  WHERE id=?";
		
		try {
			
			
			PreparedStatement preparador = (PreparedStatement) con.prepareStatement(sql);
			
			preparador.setLong(1,file.getId());
			preparador.setString(2, file.getName());
			preparador.setString(3, file.getYear());
			preparador.setString(4, file.getMonth());
			preparador.setString(5, file.getType());
			
			
			
			
			preparador.execute();
			preparador.close();
			
			System.out.println("Aluno cadastrado no sistema!");
			
		} catch (SQLException e) {
			// TODO: handle exception

			System.out.println("Não foi possível cadastrar no sistema.");

			e.printStackTrace();
		}
		 


}
	
	
	
	public void Excluir(FileEntity file){
		
		String sql = "DELETE FROM file WHERE id=?";
		
		try {
			
			
			PreparedStatement preparador = (PreparedStatement) con.prepareStatement(sql);
			preparador.setLong(1, file.getId());
			
			
			
			
			preparador.execute();
			preparador.close();
			
			System.out.println("Aluno excluído no sistema!");
			
		} catch (SQLException e) {
			// TODO: handle exception

			System.out.println("Não foi possível excluir no sistema.");

			e.printStackTrace();
		}
		 


}
	
	
	public List<FileEntity> BuscarTodos (){
		
		String sql = "SELECT * FROM aluno";
		List<FileEntity> alulista = new ArrayList<FileEntity>();

		
		try {
			
			
			PreparedStatement preparador = (PreparedStatement) con.prepareStatement(sql);
			ResultSet resul = preparador.executeQuery();
			
			while(resul.next()){
				
				FileEntity f = new FileEntity();
			
				f.setId(resul.getLong("id"));
				f.setName(resul.getString("name"));
				f.setMonth(resul.getString("month"));
				f.setYear(resul.getString("year"));
				f.setType(resul.getString("type"));
			
			alulista.add(f);
			
			
			
			
			}
			preparador.close();
			
		} catch (SQLException e) {
			// TODO: handle exception

			System.out.println("Não foi possível consultar no sistema.");

			e.printStackTrace();
		}
		return alulista;

}
	
	public FileEntity BuscarMatriculaAluno(long id){
		
		String sql = "SELECT * FROM file WHERE id=?";
		
		FileEntity f = null;
		
		try {
			
			
			PreparedStatement preparador = (PreparedStatement) con.prepareStatement(sql);
			preparador.setLong(1, id);
			
			
			ResultSet resul = preparador.executeQuery();
			
			if(resul.next()){
				
			f = new FileEntity();

			f.setId(resul.getLong("id"));
			f.setName(resul.getString("name"));
			f.setMonth(resul.getString("month"));
			f.setYear(resul.getString("year"));
			f.setType(resul.getString("type"));
			
			}
			preparador.close();
			
		} catch (SQLException e) {
			// TODO: handle exception

			System.out.println("Não foi possível consultar no sistema.");

			e.printStackTrace();
		}
		return f;

}


}

