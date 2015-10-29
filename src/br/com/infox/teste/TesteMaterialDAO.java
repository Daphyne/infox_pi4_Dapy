package br.com.infox.teste;

import java.util.Scanner;

import br.com.infox.entidades.Material;
import br.com.infox.jdbc.MaterialDAO;

public class TesteMaterialDAO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		cadastro();
		alterar();
		excluir();
		buscar();


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
	
	private static void buscar(){
		
		Scanner ler = new Scanner(System.in);
		
		
		
		MaterialDAO matdao = new MaterialDAO();
		if(matdao != null){
		System.out.println("Entre com o id do material a ser consultado:");
		int ma = ler.nextInt();
		
		System.out.println(matdao.BuscarIdMaterial(ma).getIdMaterial()+"\n"+matdao.BuscarIdMaterial(ma).getIdDisciplina()+"\n"+matdao.BuscarIdMaterial(ma).getNomeMaterial()+"\n"+matdao.BuscarIdMaterial(ma).getCaminho());
		}else{
			
			System.out.println("Valor não encontrado.");
		}


		
	}

}
