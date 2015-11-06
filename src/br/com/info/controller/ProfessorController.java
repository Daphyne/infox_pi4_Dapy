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
		

		
		int matriculaProfessor = Integer.parseInt(request.getParameter("txtmprof"));


		String acao = request.getParameter("acao");
		
		ProfessorDAO profdao= new ProfessorDAO();
		

		
		if(acao!=null && acao.equals("exc")){
			

			String matriculaprofessor = request.getParameter("matriculaProfessor");
			
			Professor prof = new Professor();
			prof.setMatriculaProfessor(Integer.parseInt(matriculaprofessor));
			profdao.Excluir(prof);
				
		}
		
		
		if(acao!=null && acao.equals("alt")){
			

			String matriculaprofessor = request.getParameter("matriculaProfessor");
			Professor prof = (Professor) profdao.BuscarMatricula(Integer.parseInt(matriculaprofessor));
			request.setAttribute("professor", prof);
			
			//Encaminha para a tela
			RequestDispatcher saida = request.getRequestDispatcher("FormularioCadastroProfessor.jsp");
			saida.forward(request, response);
			
			
		}
		

		

		if(acao!=null){
				
			List<Professor> lista = profdao.BuscarMatricula(matriculaProfessor);
			request.setAttribute("lista", lista); 
			
			RequestDispatcher saida = request.getRequestDispatcher("ListaProfessor.jsp");
			saida.forward(request, response);
			
		}
		
		//Com servlets
		//String htmlsaida = "<html> <body> <table border='1'>"+
		//"<tr><td>Matricula do professor</td><td>Data de nascimneto</td><td>Telefone</td><td>Nome</td><td>Senha</td><td>Email</td></tr>";
		
		//for(Professor p :lista){
			
			//htmlsaida +="<tr><td>"+p.getMatriculaProfessor()+"</td><td>"+p.getDataNascProfessor()+"</td><td>"+p.getTelefoneProfessor()+"</td><td>"+p.getNomeProfessor()+"</td><td>"+p.getSenha()+"</td><td>"+p.getEmailProfessor()+"</td></tr>";
			
			
		//}
		
		//htmlsaida+="</table></body></html>";
		
		//PrintWriter saida = response.getWriter();
		//saida.println(htmlsaida);
		
		  
		
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
