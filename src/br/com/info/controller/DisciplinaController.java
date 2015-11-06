package br.com.info.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.infox.entidades.Disciplina;
import br.com.infox.jdbc.DisciplinaDAO;

/**
 * Servlet implementation class DisciplinaController
 */
@WebServlet("/disciplinacontroller.do")
public class DisciplinaController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DisciplinaController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		
		

		int iddisciplina = Integer.parseInt(request.getParameter("txtiddisci"));
		

		String acao = request.getParameter("acao");
		
		DisciplinaDAO disdao = new DisciplinaDAO();
		

		if(acao!=null && acao.equals("exc")){
			
			String idDisciplina = request.getParameter("idDisciplina");
			
			Disciplina dis = new Disciplina();
			
			dis.setIdDisciplina(Integer.parseInt(idDisciplina));
			
			disdao.Excluir(dis);
			
		}
		

		if(acao!=null && acao.equals("alt")){
			
			String idDisciplina = request.getParameter("idDisciplina");
			
			Disciplina dis = (Disciplina) disdao.BuscarIdDisciplina(Integer.parseInt(idDisciplina));
			
			request.setAttribute("disciplina", dis);
			

			RequestDispatcher saida = request.getRequestDispatcher("FormularioCadastroDisciplina.jsp");
			saida.forward(request, response);
			
		}
		
		

		if(acao!=null){
			
				List<Disciplina> lista =disdao.BuscarIdDisciplina(iddisciplina);
				request.setAttribute("lista", lista);
				
				RequestDispatcher saida = request.getRequestDispatcher("ListaDisciplina.jsp");
				saida.forward(request, response);
				
			}
		

		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		int idDisciplina = Integer.parseInt(request.getParameter("txtiddisciplina"));
		String nomeDisciplina = request.getParameter("txtnomedisciplina");
		int matriculaProfessor = Integer.parseInt(request.getParameter("txtmatriculaprofessor"));
		String telefoneProfessor = request.getParameter("txttelefoneprofessor");
		String emailProfessor = request.getParameter("txtemailprofessor");
		
		Disciplina disciplina = new Disciplina();
		
		disciplina.setIdDisciplina(idDisciplina);
		disciplina.setNomeDisciplina(nomeDisciplina);
		disciplina.setMatriculaProfessor(matriculaProfessor);
		disciplina.setTelefoneProfessor(telefoneProfessor);
		disciplina.setEmailProfessor(emailProfessor);
		
		DisciplinaDAO disdao = new DisciplinaDAO();
		disdao.Cadastrar(disciplina);
		

		PrintWriter saida = response.getWriter();
		saida.print("Cadastrado!");
		
		
		
		
	}

}
