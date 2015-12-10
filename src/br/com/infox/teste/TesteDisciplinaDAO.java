package br.com.infox.teste;

import java.util.Scanner;

<<<<<<< HEAD
import br.com.infox.jdbc.DisciplinaDAO;

public class TesteDisciplinaDAO {




private static void buscar(){
	
	Scanner ler = new Scanner(System.in);
	
	DisciplinaDAO disdao = new DisciplinaDAO();
	System.out.println("Entre com o id da disciplina a ser consultada:");
	int d= ler.nextInt();


	
	System.out.println(disdao.BuscarIdDisciplina(d).getIdDisciplina()+"\n"+disdao.BuscarIdDisciplina(d).getNomeDisciplina()+"\n"+disdao.BuscarIdDisciplina(d).getMatriculaProfessor()+"\n"+disdao.BuscarIdDisciplina(d).getTelefoneProfessor()+"\n"+disdao.BuscarIdDisciplina(d).getEmailProfessor());
	


	
}
}
=======
import br.com.infox.entidades.Disciplina;
import br.com.infox.jdbc.DisciplinaDAO;


public class TesteDisciplinaDAO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		cadastro();
		alterar();
		excluir();
		buscar();
		

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

	
	private static void buscar(){
		
		Scanner ler = new Scanner(System.in);
		
		DisciplinaDAO disdao = new DisciplinaDAO();
		System.out.println("Entre com o id da disciplina a ser consultada:");
		int d= ler.nextInt();


		
		System.out.println(disdao.BuscarIdDisciplina(d).getIdDisciplina()+"\n"+disdao.BuscarIdDisciplina(d).getNomeDisciplina()+"\n"+disdao.BuscarIdDisciplina(d).getMatriculaProfessor()+"\n"+disdao.BuscarIdDisciplina(d).getTelefoneProfessor()+"\n"+disdao.BuscarIdDisciplina(d).getEmailProfessor());
		


		
	}
	
}
>>>>>>> 690cb9829f1cafbfc5850e578f4bd2d50b1fc298
