package br.com.info.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.infox.entidades.Professor;
import br.com.infox.jdbc.ProfessorDAO;

/**
 * Servlet implementation class ProfessorController
 */
@WebServlet("/professorcontroller.do")
public class ProfessorController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProfessorController() {
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
		
		
		int matriculaProfessor = Integer.parseInt(request.getParameter("txtmatriculaprofessor"));
		String dataNascProfessor = request.getParameter("txtdatanasciprofessor");
		String telefoneProfessor = request.getParameter("txttelefoneprofessor");
		String nomeProfessor = request.getParameter("txtnomeprofessor");
		String senha = request.getParameter("txtsenhaprofessor");
		String emailProfessor = request.getParameter("txtemailprofessor");
		
		
		Professor professor = new Professor();
		
		professor.setMatriculaProfessor(matriculaProfessor);
		professor.setDataNascProfessor(dataNascProfessor);
		professor.setTelefoneProfessor(telefoneProfessor);
		professor.setNomeProfessor(nomeProfessor);
		professor.setSenha(senha);
		professor.setEmailProfessor(emailProfessor);
		
		ProfessorDAO professordao = new ProfessorDAO();
		professordao.Cadastrar(professor);
		
		PrintWriter saida = response.getWriter();
		saida.print("Cadastrado!");
		
		
		
		
		
		
		
		
		
		
		
	}

}
