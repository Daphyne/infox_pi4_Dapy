package br.com.infox.teste;

import java.util.Scanner;

import br.com.infox.entidades.Aluno;
import br.com.infox.jdbc.AlunoDAO;

public class TesteAlunoDAO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		cadastro();
		alterar();
		excluir();
		buscar();
		

	}

	private static void cadastro() {
		Aluno al = new Aluno();
		
		AlunoDAO aldao = new AlunoDAO();
		
		
		al.setMatriculaAluno(123456);
		al.setTelefoneAluno("6666666666");
		al.setEmailAluno("Beatriz@outlook.com");
		al.setDataNacAluno("03/03/1990");
		al.setNomeAluno("Beatriz Albérico");
		al.setEndereco("Rua Agamenom Magalhães");
		al.setSenha("beatriz");
		
		
		aldao.Cadastrar(al);
	}
	
	
	private static void alterar(){
		
		Scanner ler = new Scanner(System.in);

		Aluno al = new Aluno();
		
		AlunoDAO aldao = new AlunoDAO();
		System.out.println("Entre com a matrícula do aluno a ser alterado:");
		int ma = ler.nextInt();
		
		
		al.setMatriculaAluno(ma);
		al.setTelefoneAluno("6666666666");
		al.setEmailAluno("Beatriz@outlook.com");
		al.setDataNacAluno("03/03/1990");
		al.setNomeAluno("Beatriz Albérico");
		al.setEndereco("Rua Agamenom Magalhães");
		al.setSenha("beatriz");
		
		
		aldao.Alterar(al);
	}

	
	private static void excluir(){
		
		Scanner ler = new Scanner(System.in);

		Aluno al = new Aluno();
		
		AlunoDAO aldao = new AlunoDAO();
		System.out.println("Entre com a matrícula do aluno a ser excluído:");
		int ma = ler.nextInt();
		
		
		al.setMatriculaAluno(ma);
		
		aldao.Excluir(al);
	}
	
	
	private static void buscar(){
		
		Scanner ler = new Scanner(System.in);
		
		
		AlunoDAO aldao = new AlunoDAO();
		
		if(aldao != null){
		System.out.println("Entre com a matrícula do aluno a ser consultada:");
		int ma = ler.nextInt();


		
		System.out.println(aldao.BuscarMatriculaAluno(ma).getMatriculaAluno()+"\n"+aldao.BuscarMatriculaAluno(ma).getTelefoneAluno()+"\n"+aldao.BuscarMatriculaAluno(ma).getEmailAluno()+"\n"+aldao.BuscarMatriculaAluno(ma).getDataNacAluno()+"\n"+aldao.BuscarMatriculaAluno(ma).getNomeAluno()+"\n"+aldao.BuscarMatriculaAluno(ma).getEndereco()+"\n"+aldao.BuscarMatriculaAluno(ma).getSenha());
		}else{
			
			System.out.println("O valor não foi encontrado.");
		}
		


		
	}
<<<<<<< HEAD
=======


>>>>>>> 690cb9829f1cafbfc5850e578f4bd2d50b1fc298
}
