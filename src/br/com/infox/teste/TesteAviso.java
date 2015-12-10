package br.com.infox.teste;

import java.util.List;
import java.util.Scanner;


import br.com.infox.entidades.Aviso;
import br.com.infox.jdbc.AvisoDAO;

public class TesteAviso {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		 
		//cadastro();
		alterar();
		//excluir();
		//buscarPorMatricula();		
		//buscarTodos();
		//testeAutenticar();
		

	}

	private static void cadastro() {
		Aviso avi = new Aviso();
		
		AvisoDAO avidao = new AvisoDAO();
		
		avi.setNomeAviso("Aula extra sábado");
		avi.setIdAviso(2);
		avi.setHoraPublicacao("17:12:00");
		avi.setIdDisciplina(2);
		avi.setMensagemaviso("Hoje não vai ter aula por motivo de doença.");
		
		
		
		avidao.Cadastrar(avi);
	}
	
	
	private static void alterar(){
		
		Scanner ler = new Scanner(System.in);

		Aviso avi = new Aviso();
		
		AvisoDAO avidao = new AvisoDAO();
		System.out.println("Entre com o id do aviso a ser alterado:");
		int ia = ler.nextInt();
		avi.setIdAviso(ia);

		avi.setNomeAviso("Aula");
		avi.setHoraPublicacao("17:12:00");
		avi.setIdDisciplina(1);
		avi.setMensagemaviso("Hoje não vai ter aula.");

		
		
		avidao.Alterar(avi);
		
		
	}

	
	private static void excluir(){
		
		Scanner ler = new Scanner(System.in);

		Aviso avi = new Aviso();
		
		AvisoDAO avidao = new AvisoDAO();
		System.out.println("Entre com o id do aviso a ser excluído:");
		int ia = ler.nextInt();
		avi.setIdAviso(ia);

		
		
		avidao.Excluir(avi);
		
		
	}
	
	private static void buscarTodos(){
		
		AvisoDAO avidao = new AvisoDAO();
		
		List<Aviso> lista = avidao.BuscarTodos();
		
		for(Aviso a : lista){
			
			System.out.println(a.getNomeAviso()+"\n"+a.getIdAviso()+"\n"+a.getHoraPublicacao()+"\n"+a.getIdDisciplina()+"\n"+a.getMensagemaviso());
		}

	}
	
	private static void buscar(){
		
		Scanner ler = new Scanner(System.in);
		Aviso av = new Aviso();
		
		AvisoDAO avidao = new AvisoDAO();
		
		System.out.println("Entre com o id do aviso a ser consultado:");
		int ma = ler.nextInt();
		
		if(av != null){

		
		System.out.println(av.getHoraPublicacao()+"\n"+av.getIdAviso()+"\n"+av.getIdDisciplina()+"\n"+av.getMensagemaviso()+"\n"+av.getNomeAviso());
		} 


		
	}
}
