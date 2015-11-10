package br.com.infox.teste;

import java.util.Scanner;

import br.com.infox.entidades.Cursar;
import br.com.infox.jdbc.CursarDAO;

public class TesteCursarDAO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		cadastro();
		alterar();
		excluir();
		buscar();
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
	
	private static void buscar(){
		
		Scanner ler = new Scanner(System.in);
		
		
		CursarDAO curdao = new CursarDAO();
		
		if(curdao != null){
		System.out.println("Entre com a matrícula do aluno a ser excluída:");
		int ma = ler.nextInt();



		
		System.out.println(curdao.BuscarMatriculaAluno(ma).getMatriculaAluno()+"\n"+curdao.BuscarMatriculaAluno(ma).getIdDisciplina()+"\n"+curdao.BuscarMatriculaAluno(ma).getNota()+"\n"+curdao.BuscarMatriculaAluno(ma).getFalta());
		}else{
			
			System.out.println("Valor não encontrado.");
		}


		
	}
}
