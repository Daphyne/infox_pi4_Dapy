package br.com.infox.teste;

<<<<<<< HEAD
=======

>>>>>>> 690cb9829f1cafbfc5850e578f4bd2d50b1fc298
import java.util.Scanner;

import br.com.infox.entidades.Professor;
import br.com.infox.jdbc.ProfessorDAO;

public class TesteProfessorDAO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
<<<<<<< HEAD

		cadastro();
		alterar();
		excluir();
		buscar();
=======
		
		
		cadastro();
		//alterar();
		//excluir();
		//buscar();
>>>>>>> 690cb9829f1cafbfc5850e578f4bd2d50b1fc298
		
		

	}
<<<<<<< HEAD
=======

>>>>>>> 690cb9829f1cafbfc5850e578f4bd2d50b1fc298
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
		prof.setDataNascProfessor("03/03/1883");
		prof.setTelefoneProfessor("9988556644");
		prof.setNomeProfessor("Maria Machado");
		prof.setSenha("123456");
		prof.setEmailProfessor("maria@gmail.com");
		
		
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
	
	private static void buscar(){
		
		Scanner ler = new Scanner(System.in);
		
		ProfessorDAO profdao = new ProfessorDAO(); 
		
		if(profdao!= null){
		System.out.println("Entre com a matrícula para fazer a consulta do professor:");

		int m = ler.nextInt();
		
		System.out.println(profdao.BuscarMatricula(m).getMatriculaProfessor()+" \n"+profdao.BuscarMatricula(m).getDataNascProfessor()+" \n"+profdao.BuscarMatricula(m).getTelefoneProfessor()+"\n"+profdao.BuscarMatricula(m).getNomeProfessor()+"\n"+profdao.BuscarMatricula(m).getSenha()+"\n"+profdao.BuscarMatricula(m).getEmailProfessor());
		} else{
			
			System.out.println("Valor não encontrado.");
		}


		
	}

}
