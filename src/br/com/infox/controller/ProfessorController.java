package br.com.infox.controller;

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
		


		String acao = request.getParameter("acao");
		
		ProfessorDAO profdao= new ProfessorDAO();
		

		
		if(acao!=null && acao.equals("exc")){
			

			String matriculaprofessor = request.getParameter("id");
			
			
			Professor prof = new Professor();
			prof.setMatriculaProfessor(Integer.parseInt(matriculaprofessor));
			profdao.Excluir(prof);
			
			//Redirecionar para o cliente(browser) a lista com o registro já excluído
			response.sendRedirect("professorcontroller.do?acao=lis");
			
		}
		
		
		if(acao!=null && acao.equals("alt")){
			

			String mprof = request.getParameter("matriculaProfessor");
			
			Professor prof = new Professor();
			prof=profdao.BuscarMatricula(Integer.parseInt(mprof));
			profdao.Alterar(prof);
			request.setAttribute("professor", prof);
			
			//Encaminha para a tela
			RequestDispatcher saida = request.getRequestDispatcher("FormularioCadastroProfessor.jsp");
			saida.forward(request, response);
			
			
		}
		
		if(acao!=null && acao.equals("cad")){
			
			//Cria novo objeto professor
			Professor prof = new Professor();
			prof.setMatriculaProfessor(0);
			prof.setDataNascProfessor("");
			prof.setTelefoneProfessor("");
			prof.setNomeProfessor("");
			prof.setSenha("");
			prof.setEmailProfessor("");
			
			
			request.setAttribute("professor", prof);
			
			//Encaminha para a tela
			RequestDispatcher saida = request.getRequestDispatcher("FormularioCadastroProfessor.jsp");
			saida.forward(request, response);
			
			
		}
		

		if(acao!=null && acao.equals("lis") ){
			
			List<Professor> lista = profdao.BuscarTodos();
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
