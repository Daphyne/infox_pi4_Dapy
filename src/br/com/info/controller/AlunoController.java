package br.com.info.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.infox.entidades.Aluno;
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
