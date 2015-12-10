package br.com.infox.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.com.infox.entidades.Professor;
import br.com.infox.jdbc.ProfessorDAO;

/**
 * Servlet implementation class AutenticadorProfessor
 */
@WebServlet("/autenticadorprofessor.do")
public class AutenticadorProfessor extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AutenticadorProfessor() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		HttpSession sessao = request.getSession(false);
		
		if(sessao!= null){
			
			sessao.invalidate();
			
		}
		response.sendRedirect("LoginProfessor.jsp");

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		//Captura dados da tela
				String matricula = request.getParameter("Matricula");
				String senha = request.getParameter("Senha");
				
				Professor professor = new Professor();
				professor.setMatriculaProfessor(Integer.parseInt(matricula));
				professor.setSenha(senha);
				
				ProfessorDAO pdao = new ProfessorDAO();
				Professor porfRetorno = pdao.autenticar(professor);
				
				
				if(porfRetorno!= null){
					
					//Criando sessao
					HttpSession sessao = request.getSession();
					sessao.setMaxInactiveInterval(3000);// 3 minutos
					sessao.setAttribute("ProfLogado", porfRetorno );
					
					
					
					//Encaminha ao Index Professor
					request.getRequestDispatcher("IndexProfessor.jsp").forward(request, response);
					

				}else{
					//Volta para a página de Login
					response.sendRedirect("LoginProfessor.jsp");
				}
				
				

	}

}
