package br.com.info.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
<<<<<<< HEAD
=======
import java.util.Scanner;
>>>>>>> 565db68d4a023d876fa8b2ae23bc41d6388d5738

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.infox.entidades.Aluno;
<<<<<<< HEAD
=======
import br.com.infox.entidades.Disciplina;
>>>>>>> 565db68d4a023d876fa8b2ae23bc41d6388d5738
import br.com.infox.jdbc.AlunoDAO;

/**
 * Servlet implementation class AlunoController
 */
@WebServlet("/alunocontroller.do")
public class AlunoController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AlunoController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		


		int mal = Integer.parseInt(request.getParameter("txtmalu"));

		String acao = request.getParameter("acao");

		AlunoDAO alunodao = new AlunoDAO();	
		

		if(acao!=null && acao.equals("exc")){
			
			
			String matriculaAluno = request.getParameter("matriculaAluno");
			
			Aluno aluno = new Aluno();
			
			aluno.setMatriculaAluno(Integer.parseInt(matriculaAluno));
			
			alunodao.Excluir(aluno);
			
		}
		
		if(acao!=null && acao.equals("alt")){
			
			
			String matriculaAluno = request.getParameter("matriculaAluno");
			
			Aluno aluno = (Aluno) alunodao.BuscarMatriculaAluno(Integer.parseInt(matriculaAluno));
			

			request.setAttribute("aluno", aluno);
			

			RequestDispatcher saida = request.getRequestDispatcher("FormularioCadastroAluno.jsp");
			saida.forward(request, response);
			
			
		}

		
		if(acao!=null && acao.equals("cad")){
			
			
			
			Aluno aluno = new Aluno();
			aluno.setMatriculaAluno(0);
			aluno.setTelefoneAluno("");
			aluno.setEmailAluno("");
			aluno.setDataNacAluno("");
			aluno.setNomeAluno("");
			aluno.setEndereco("");
			aluno.setSenha("");

			request.setAttribute("aluno", aluno);
			

			RequestDispatcher saida = request.getRequestDispatcher("FormularioCadastroAluno.jsp");
			saida.forward(request, response);
			
			
		}


		if(acao!=null){
			
			
			List<Aluno> lista = alunodao.BuscarMatriculaAluno(mal);
			
			request.setAttribute("lista", lista);
			
			RequestDispatcher saida = request.getRequestDispatcher("ListaAluno.jsp");
			saida.forward(request, response);
			
			
		}
		
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		

		int matriculaAluno = Integer.parseInt(request.getParameter("txtmatriculaaluno"));
		String telefoneAluno = request.getParameter("txttelefonealuno");
		String emailAluno = request.getParameter("txtemailaluno");
		String dataNacAluno = request.getParameter("txtnascaluno");
		String nomeAluno = request.getParameter("txtnomealuno");
		String endereco = request.getParameter("txtenderecoaluno");
		String senha = request.getParameter("txtsenhacoaluno");
		
		Aluno aluno = new Aluno();
		
		aluno.setMatriculaAluno(matriculaAluno);
		aluno.setTelefoneAluno(telefoneAluno);
		aluno.setEmailAluno(emailAluno);
		aluno.setDataNacAluno(dataNacAluno);
		aluno.setNomeAluno(nomeAluno);
		aluno.setEndereco(endereco);
		aluno.setSenha(senha);
		
		
		AlunoDAO alunodao = new AlunoDAO();
		alunodao.Cadastrar(aluno);

		PrintWriter saida = response.getWriter();
		saida.print("Cadastrado!");
	}

}
