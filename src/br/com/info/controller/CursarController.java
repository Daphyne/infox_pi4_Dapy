package br.com.info.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.Scanner;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.infox.entidades.Cursar;
import br.com.infox.jdbc.CursarDAO;

/**
 * Servlet implementation class CursarController
 */
@WebServlet("/cursarcontroller.do")
public class CursarController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CursarController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub


		int macursar = Integer.parseInt(request.getParameter("txtmalucursar"));

		String acao = request.getParameter("acao");
		
		CursarDAO curdao = new CursarDAO();
		

		if(acao!=null && acao.equals("exc")){
			

			String matriculaAluno = request.getParameter("matriculaAluno");
			
			Cursar cursar = new Cursar();
			
			cursar.setMatriculaAluno(Integer.parseInt(matriculaAluno));
			
			curdao.Excluir(cursar);
			
			
		}
		
		if(acao!=null && acao.equals("alt")){
			

			String matriculaAluno = request.getParameter("matriculaAluno");
			
			Cursar cursar = (Cursar) curdao.BuscarMatriculaAluno(Integer.parseInt(matriculaAluno));
			

			request.setAttribute("cursar", cursar);
			

			RequestDispatcher saida = request.getRequestDispatcher("FormularioCadastroCursar.jsp");
			saida.forward(request, response);
			
			
		}
			
		

		if(acao!=null){
			List<Cursar> lista = curdao.BuscarMatriculaAluno(macursar);
			
			request.setAttribute("lista", lista);
			
			RequestDispatcher saida = request.getRequestDispatcher("ListaCursar.jsp");
			saida.forward(request, response);
			
		}

		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		

		String falta = request.getParameter("txtfaltacursar");
		String nota = request.getParameter("txtnotacursar"); 
		int matriculaAluno = Integer.parseInt(request.getParameter("txtmaluno"));
		int idDisciplina = Integer.parseInt(request.getParameter("txtiddisciplina"));
		
		Cursar cursar = new Cursar();
		
		cursar.setFalta(falta);
		cursar.setNota(nota);
		cursar.setMatriculaAluno(matriculaAluno);
		cursar.setIdDisciplina(idDisciplina);
		
		CursarDAO cursardao = new CursarDAO();
		cursardao.Cadastrar(cursar);
		
		
		
		PrintWriter saida = response.getWriter();
		saida.print("Cadastrado!");

		
	}

}
