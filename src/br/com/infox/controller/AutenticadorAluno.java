package br.com.infox.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.com.infox.entidades.Aluno;
import br.com.infox.jdbc.AlunoDAO;

/**
 * Servlet implementation class AutenticadorAluno
 */
@WebServlet("/autenticadoraluno.do")
public class AutenticadorAluno extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AutenticadorAluno() {
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
		response.sendRedirect("LoginAluno.jsp");
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
				//Captura dados da tela
				String matricula = request.getParameter("Matricula");
				String senha = request.getParameter("Senha");
				
				//Controe objeto para consulta
				Aluno aluno = new Aluno();
				aluno.setMatriculaAluno(Integer.parseInt(matricula));
				aluno.setSenha(senha);
				
				//Busca no banco
				AlunoDAO alunodao = new AlunoDAO();
				Aluno alunoRetorno = alunodao.autenticar(aluno);
				
				if(alunoRetorno!= null){
					

					//Criando sessao
					HttpSession sessao = request.getSession();
					sessao.setAttribute("AluLogado", alunoRetorno );
					
					//Encaminha ao index
					request.getRequestDispatcher("IndexAluno.jsp").forward(request, response);
					
					
				}else{
					
					response.sendRedirect("LoginAluno.jsp");
				}
				
	}

}
