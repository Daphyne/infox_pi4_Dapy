package br.com.infox.teste;

import java.util.List;
import java.util.Scanner;

import br.com.infox.entidades.Disciplina;
import br.com.infox.jdbc.DisciplinaDAO;

public class TesteDisciplina {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//cadastro();
		//alterar();
		//excluir();
		//buscar();
		buscarTodos();
		

	}

	private static void cadastro() {
		Disciplina dis = new Disciplina();
		DisciplinaDAO disdao = new DisciplinaDAO();
		
		dis.setIdDisciplina(2);
		dis.setNomeDisciplina("Violino 1");
		dis.setMatriculaProfessor(2);
		dis.setTelefoneProfessor("7777777777");
		dis.setEmailProfessor("maria@gmail.com");
		
		
		disdao.Cadastrar(dis);
	}
	
	private static void alterar(){
		
		Scanner ler = new Scanner(System.in);

		Disciplina dis = new Disciplina();
		DisciplinaDAO disdao = new DisciplinaDAO();
		System.out.println("Entre com o id da disciplina a ser alterada:");
		int d= ler.nextInt();
		
		dis.setIdDisciplina(d);
		dis.setNomeDisciplina("Violino 1");
		dis.setMatriculaProfessor(2);
		dis.setTelefoneProfessor("7777777777");
		dis.setEmailProfessor("maria@gmail.com");
		
		
		disdao.Alterar(dis);
		
	}

	private static void excluir(){
		
		Scanner ler = new Scanner(System.in);

		Disciplina dis = new Disciplina();
		DisciplinaDAO disdao = new DisciplinaDAO();
		System.out.println("Entre com o id da disciplina a ser excluída:");
		int d= ler.nextInt();
		
		
		
		disdao.Excluir(dis);
		
	}

	private static void buscarTodos(){
		
		DisciplinaDAO disdao = new DisciplinaDAO();

		List<Disciplina> lista = disdao.BuscarTodos();
		
		for(Disciplina d: lista){
			
			System.out.println(d.getIdDisciplina()+"\n"+d.getNomeDisciplina()+"\n"+d.getMatriculaProfessor()+"\n"+d.getTelefoneProfessor()+"\n"+d.getEmailProfessor());
			
		}
		
	}
	private static void buscar(){
		
		Scanner ler = new Scanner(System.in);
		
		DisciplinaDAO disdao = new DisciplinaDAO();
		System.out.println("Entre com o id da disciplina a ser consultada:");
		int d= ler.nextInt();


		
		System.out.println(disdao.BuscarIdDisciplina(d)+"\n"+disdao.BuscarIdDisciplina(d)+"\n"+disdao.BuscarIdDisciplina(d)+"\n"+disdao.BuscarIdDisciplina(d)+"\n"+disdao.BuscarIdDisciplina(d));
		


		
	}
}
