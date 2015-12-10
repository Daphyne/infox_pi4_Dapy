package br.com.infox.teste;

import java.util.List;
import java.util.Scanner;




import br.com.infox.entidades.Aluno;
import br.com.infox.jdbc.AlunoDAO;

public class TesteAluno {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//cadastro();
		//alterar();
		//excluir();
		//buscarPorMatricula();
		
		//buscarTodosAlunos();
		//testeAutenticar();
		

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
	
	private static void buscarTodosAlunos(){
		
		AlunoDAO aldao = new AlunoDAO();

		List<Aluno> lista = aldao.BuscarTodosAlunos();
		
		for(Aluno a: lista){
			
			System.out.println(a.getMatriculaAluno()+"\n"+a.getTelefoneAluno()+"\n"+a.getEmailAluno()+"\n"+a.getDataNacAluno()+"\n"+a.getNomeAluno()+"\n"+a.getEndereco()+"\n"+a.getSenha());
			
		}
	}
	private static void buscarPorMatricula(){
		
		Scanner ler = new Scanner(System.in);
		
		AlunoDAO aldao = new AlunoDAO();
		
		System.out.println("Entre com a matrícula do aluno a ser consultada:");
		int ma = ler.nextInt();
		Aluno alu = (Aluno) aldao.BuscarMatriculaAluno(ma);
		
		if(alu != null){
		
			System.out.println(alu.getMatriculaAluno()+"\n"+alu.getTelefoneAluno()+"\n"+alu.getEmailAluno()+"\n"+alu.getDataNacAluno()+"\n"+alu.getNomeAluno()+"\n"+alu.getEndereco()+"\n"+alu.getSenha());


		
		}
		


		
	}
	
	private static void testeAutenticar(){
		
		Aluno aluno = new Aluno();
		aluno.setMatriculaAluno(12);
		
		AlunoDAO aludao = new AlunoDAO();
		System.out.println(aludao.autenticar(aluno));

		
		
		
		
		
		
		
	}

}

