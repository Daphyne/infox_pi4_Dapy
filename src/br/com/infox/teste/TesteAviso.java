package br.com.infox.teste;

import java.util.Scanner;

import br.com.infox.entidades.Aviso;
import br.com.infox.jdbc.AvisoDAO;

public class TesteAviso {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		cadastro();
		alterar();
		excluir();
		buscar();

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

		avi.setNomeAviso("Aula extra sábado");
		avi.setHoraPublicacao("17:12:00");
		avi.setIdDisciplina(2);
		avi.setMensagemaviso("Hoje vai ter aula.");

		
		
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
	
	
	private static void buscar(){
		
		Scanner ler = new Scanner(System.in);
		
	
		
		AvisoDAO avidao = new AvisoDAO();
		
		if(avidao != null){
		System.out.println("Entre com o id do aviso a ser consultado:");
		int ia = ler.nextInt();

		
		System.out.println(avidao.BuscarIdAviso(ia).getIdAviso()+"\n"+avidao.BuscarIdAviso(ia).getNomeAviso()+"\n"+avidao.BuscarIdAviso(ia).getHoraPublicacao()+"\n"+avidao.BuscarIdAviso(ia).getIdDisciplina()+"\n"+avidao.BuscarIdAviso(ia).getMensagemaviso());
		} 
		else{
			
			System.out.println("Valor não encontrado.");
		}


		
	}

	
}
