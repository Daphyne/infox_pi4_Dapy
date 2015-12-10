package br.com.infox.teste;

import java.util.List;
import java.util.Scanner;

import br.com.infox.entidades.Material;
import br.com.infox.jdbc.MaterialDAO;

public class TesteMaterial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		cadastro();
		alterar();
		excluir();
		buscar();
		buscarTodos();


	}

	private static void cadastro() {
		Material mat = new Material();
		
		MaterialDAO matdao = new MaterialDAO();
		
		mat.setCaminho("C:Aulas/Violino1/Aula1");
		mat.setNomeMaterial("Aula 1");
		mat.setIdMaterial(2);
		mat.setIdDisciplina(1);
		
		
		matdao.Cadastrar(mat);
	}
	
	
	private static void alterar(){
		
		Scanner ler = new Scanner(System.in);

		Material mat = new Material();
		
		MaterialDAO matdao = new MaterialDAO();
		System.out.println("Entre com o id do material a ser alterado:");
		int ma = ler.nextInt();
		mat.setIdMaterial(ma);

		mat.setCaminho("C:Aulas/Violino1/Aula1");
		mat.setNomeMaterial("Aula 1");
		mat.setIdDisciplina(1);
		
		
		matdao.Alterar(mat);
		
	}

	
	private static void excluir(){
		
		Scanner ler = new Scanner(System.in);

		Material mat = new Material();
		
		MaterialDAO matdao = new MaterialDAO();
		System.out.println("Entre com o id do material a ser excluído:");
		int ma = ler.nextInt();
		mat.setIdMaterial(ma);

		
		
		matdao.Excluir(mat);
		
	}
	
	private static void buscarTodos(){
		
		MaterialDAO matdao = new MaterialDAO();
		List<Material> lista = matdao.BuscarTodos();
		
		for(Material m:lista){
			
			System.out.println(m.getCaminho()+"\n"+m.getNomeMaterial()+"\n"+m.getIdMaterial()+"\n"+m.getIdDisciplina());
		}

		
		
	}
	private static void buscar(){
		
		Scanner ler = new Scanner(System.in);
		
		
		
		MaterialDAO matdao = new MaterialDAO();
		
		if(matdao != null){
		System.out.println("Entre com o id do material a ser consultado:");
		int ma = ler.nextInt();
		
		System.out.println(matdao.BuscarIdMaterial(ma)+"\n"+matdao.BuscarIdMaterial(ma)+"\n"+matdao.BuscarIdMaterial(ma)+"\n"+matdao.BuscarIdMaterial(ma));
		}

		
	}

	
}
