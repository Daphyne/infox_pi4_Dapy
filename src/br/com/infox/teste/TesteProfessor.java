package br.com.infox.teste;

import java.util.List;
import java.util.Scanner;

import br.com.infox.entidades.Professor;
import br.com.infox.jdbc.ProfessorDAO;

public class TesteProfessor {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//cadastro();
		//alterar();
		//excluir();
		buscarPorMatricula();
		//buscarTodos();
		//testeAutenticar();
		
		

	}

	private static void cadastro() {
		Professor prof = new Professor();
		ProfessorDAO profdao = new ProfessorDAO(); 
		
		prof.setMatriculaProfessor(5);
		prof.setDataNascProfessor("03/03/1990");
		prof.setTelefoneProfessor("9988578945");
		prof.setNomeProfessor("Vitor Machado");
		prof.setSenha("123456");
		prof.setEmailProfessor("vitor@gmail.com");
		
		
		profdao.Cadastrar(prof);
	}
	
	
	private static void alterar(){
		
		Scanner ler = new Scanner(System.in);

		Professor prof = new Professor();
		ProfessorDAO profdao = new ProfessorDAO(); 
		System.out.println("Entre com a matrícula do professor a ser alterado:");
		int m = ler.nextInt();
		prof.setMatriculaProfessor(m);
		prof.setDataNascProfessor("03/03/1990");
		prof.setTelefoneProfessor("9988556644");
		prof.setNomeProfessor("Maria Machado");
		prof.setSenha("admin");
		prof.setEmailProfessor("maria3@gmail.com");
		
		
		profdao.Alterar(prof);
		
		
	}
	
	
	private static void excluir(){
		
		Scanner ler = new Scanner(System.in);

		Professor prof = new Professor();
		ProfessorDAO profdao = new ProfessorDAO(); 
		System.out.println("Entre com a matrícula do professor a ser excluída:");
		int m = ler.nextInt();
		prof.setMatriculaProfessor(m);
		
		
		profdao.Excluir(prof);
		
		
	}
	private static void buscarTodos(){
		
		ProfessorDAO profdao = new ProfessorDAO(); 
		List<Professor> lista = profdao.BuscarTodos();
		
		
		for(Professor p: lista){
			
			
			System.out.println(p.getMatriculaProfessor()+"\n"+p.getDataNascProfessor()+"\n"+p.getTelefoneProfessor()+"\n"+p.getNomeProfessor()+"\n"+p.getSenha()+"\n"+p.getEmailProfessor());
		}
		
	}
	
	private static void buscarPorMatricula(){
		
		Scanner ler = new Scanner(System.in);
		
		ProfessorDAO profdao = new ProfessorDAO(); 
		
		System.out.println("Entre com a matrícula para fazer a consulta do professor:");
		int m = ler.nextInt();

		Professor prof = (Professor) profdao.BuscarMatricula(m);
		if(prof!= null){

			System.out.println(prof.getMatriculaProfessor()+"\n"+prof.getDataNascProfessor()+"\n"+prof.getTelefoneProfessor()+"\n"+prof.getNomeProfessor()+"\n"+prof.getSenha()+"\n"+prof.getEmailProfessor());
		} 

		
	}
	
	private static void testeAutenticar(){
		
		Professor professor = new Professor();
		
		professor.setMatriculaProfessor(1);
		
		ProfessorDAO pdao = new ProfessorDAO();
		System.out.println(pdao.autenticar(professor));
		
		
		
		
		
		
	}
}
