package br.com.infox.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

<<<<<<< HEAD
=======







>>>>>>> 06bf4517ac507a8f128966235204ad40b0dc7315
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
<<<<<<< HEAD
	
=======
>>>>>>> 06bf4517ac507a8f128966235204ad40b0dc7315
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProfessorController() {
        super();
        // TODO Auto-generated constructor stub
    }
<<<<<<< HEAD
  

=======
>>>>>>> 06bf4517ac507a8f128966235204ad40b0dc7315

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		

<<<<<<< HEAD
=======
		
		int matriculaProfessor = Integer.parseInt(request.getParameter("txtmprof"));

>>>>>>> 06bf4517ac507a8f128966235204ad40b0dc7315

		String acao = request.getParameter("acao");
		
		ProfessorDAO profdao= new ProfessorDAO();
		

		
		if(acao!=null && acao.equals("exc")){
			

<<<<<<< HEAD
			String matriculaprofessor = request.getParameter("id");
			
=======
			String matriculaprofessor = request.getParameter("matriculaProfessor");
>>>>>>> 06bf4517ac507a8f128966235204ad40b0dc7315
			
			Professor prof = new Professor();
			prof.setMatriculaProfessor(Integer.parseInt(matriculaprofessor));
			profdao.Excluir(prof);
			
<<<<<<< HEAD
			//Redirecionar para o cliente(browser) a lista com o registro já excluído
			response.sendRedirect("professorcontroller.do?acao=lis");
			
=======

			//Redirecionar para o cliente(browser) a lista com o registro já excluído
			response.sendRedirect("professorcontroller.do?acao=lis");
				
>>>>>>> 06bf4517ac507a8f128966235204ad40b0dc7315
		}
		
		
		if(acao!=null && acao.equals("alt")){
			

<<<<<<< HEAD
			String mprof = request.getParameter("matriculaProfessor");
			
			Professor prof = new Professor();
			prof=profdao.BuscarMatricula(Integer.parseInt(mprof));
			profdao.Alterar(prof);
=======
			String matriculaprofessor = request.getParameter("matriculaProfessor");
			Professor prof = (Professor) profdao.BuscarMatricula(Integer.parseInt(matriculaprofessor));
>>>>>>> 06bf4517ac507a8f128966235204ad40b0dc7315
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
<<<<<<< HEAD
			
			List<Professor> lista = profdao.BuscarTodos();
=======
				
			List<Professor> lista = profdao.BuscarMatricula(matriculaProfessor);
>>>>>>> 06bf4517ac507a8f128966235204ad40b0dc7315
			request.setAttribute("lista", lista); 
			
			RequestDispatcher saida = request.getRequestDispatcher("ListaProfessor.jsp");
			saida.forward(request, response);
			
		}
		
<<<<<<< HEAD

		
=======
>>>>>>> 06bf4517ac507a8f128966235204ad40b0dc7315
		//Com servlets
		//String htmlsaida = "<html> <body> <table border='1'>"+
		//"<tr><td>Matricula do professor</td><td>Data de nascimneto</td><td>Telefone</td><td>Nome</td><td>Senha</td><td>Email</td></tr>";
		
		//for(Professor p :lista){
			
			//htmlsaida +="<tr><td>"+p.getMatriculaProfessor()+"</td><td>"+p.getDataNascProfessor()+"</td><td>"+p.getTelefoneProfessor()+"</td><td>"+p.getNomeProfessor()+"</td><td>"+p.getSenha()+"</td><td>"+p.getEmailProfessor()+"</td></tr>";
			
			
		//}
		
		//htmlsaida+="</table></body></html>";
		
		//PrintWriter saida = response.getWriter();
		//saida.println(htmlsaida);
<<<<<<< HEAD
		
		
=======

>>>>>>> 06bf4517ac507a8f128966235204ad40b0dc7315
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
		
		
<<<<<<< HEAD
		
		
		
		
		
		
=======
>>>>>>> 06bf4517ac507a8f128966235204ad40b0dc7315
	}

}
