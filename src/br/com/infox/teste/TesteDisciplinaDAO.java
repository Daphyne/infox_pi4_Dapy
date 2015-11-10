package br.com.infox.teste;

import java.util.Scanner;

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
