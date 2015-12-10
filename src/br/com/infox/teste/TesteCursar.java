package br.com.infox.teste;

import java.util.List;
import java.util.Scanner;


import br.com.infox.entidades.Cursar;
import br.com.infox.jdbc.CursarDAO;

public class TesteCursar {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//cadastro();
		//alterar();
		//excluir();
		buscar();
		//buscarTodos();
		
	}

	private static void cadastro() {
		Cursar cur = new Cursar();
		
		CursarDAO curdao = new CursarDAO();
		
		cur.setFalta("1");
		cur.setNota("7");
		cur.setIdDisciplina(2);
		cur.setMatriculaAluno(123456);
		
		
		curdao.Cadastrar(cur);
	}
	
	
	private static void alterar(){
		Scanner ler = new Scanner(System.in);

		
		Cursar cur = new Cursar();
		
		CursarDAO curdao = new CursarDAO();
		System.out.println("Entre com a matrícula do aluno a ser alterada:");
		int ma = ler.nextInt();

		cur.setMatriculaAluno(ma);
		cur.setFalta("1");
		cur.setNota("7");
		cur.setIdDisciplina(2);
		
		
		curdao.Alterar(cur);
	}

	
	private static void excluir(){
		Scanner ler = new Scanner(System.in);

		
		Cursar cur = new Cursar();
		
		CursarDAO curdao = new CursarDAO();
		System.out.println("Entre com a matrícula do aluno a ser excluída:");
		int ma = ler.nextInt();

		
		
		curdao.Excluir(cur);
	}
	
	private static void buscarTodos(){
		
		CursarDAO curdao = new CursarDAO();

		List<Cursar> lista= curdao.BuscarTodos();
		
		for(Cursar c: lista){
			
			
			System.out.println(c.getFalta()+"\n"+c.getNota()+"\n"+c.getMatriculaAluno()+"\n"+c.getIdDisciplina());
		}
		
		
	}
	private static void buscar(){
		
		Scanner ler = new Scanner(System.in);
		
		CursarDAO curdao = new CursarDAO();
		
		System.out.println("Entre com a matrícula do aluno a ser consultado:");
		int ma = ler.nextInt();
		
		Cursar cur = (Cursar)curdao.BuscarMatriculaAluno(ma);
		
			if(cur!=null){
		System.out.println(cur.getFalta()+"\n"+cur.getNota()+"\n"+cur.getMatriculaAluno()+"\n"+cur.getIdDisciplina());
			}


		
	}
}

