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
<<<<<<< HEAD
import javax.servlet.http.HttpSession;
import javax.swing.JOptionPane;
=======
>>>>>>> 06bf4517ac507a8f128966235204ad40b0dc7315

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
		

<<<<<<< HEAD
=======
		int macursar = Integer.parseInt(request.getParameter("txtmalucursar"));
>>>>>>> 06bf4517ac507a8f128966235204ad40b0dc7315

		String acao = request.getParameter("acao");
		
		CursarDAO curdao = new CursarDAO();
<<<<<<< HEAD
		int parametro = 0;
=======
>>>>>>> 06bf4517ac507a8f128966235204ad40b0dc7315
		

		if(acao!=null && acao.equals("exc")){
			

<<<<<<< HEAD
			String matriculaAluno = request.getParameter("id");
=======
			String matriculaAluno = request.getParameter("matriculaAluno");
>>>>>>> 06bf4517ac507a8f128966235204ad40b0dc7315
			
			Cursar cursar = new Cursar();
			
			cursar.setMatriculaAluno(Integer.parseInt(matriculaAluno));
			
			curdao.Excluir(cursar);
			

<<<<<<< HEAD
			//Redirecionar para o cliente(browser) a lista com o registro j� exclu�do
			response.sendRedirect("cursarcontroller.do?acao=lis");
			
=======

			//Redirecionar para o cliente(browser) a lista com o registro j� exclu�do
			response.sendRedirect("cursarcontroller.do?acao=lis");
				
>>>>>>> 06bf4517ac507a8f128966235204ad40b0dc7315
			
		}
		
		if(acao!=null && acao.equals("alt")){
			
<<<<<<< HEAD
			String matriculaAluno = request.getParameter("matriculaAluno");

			Cursar cursar = new Cursar();
			 cursar = curdao.BuscarMatriculaAluno(Integer.parseInt(matriculaAluno));

			
			curdao.Alterar(cursar);
			
			
=======

			String matriculaAluno = request.getParameter("matriculaAluno");
			
			Cursar cursar = (Cursar) curdao.BuscarMatriculaAluno(Integer.parseInt(matriculaAluno));
>>>>>>> 06bf4517ac507a8f128966235204ad40b0dc7315
			

			request.setAttribute("cursar", cursar);
			

			RequestDispatcher saida = request.getRequestDispatcher("FormularioCadastroCursar.jsp");
			saida.forward(request, response);
			
			
		}
			
		if(acao!=null && acao.equals("cad")){
			

			
			Cursar cursar = new Cursar();
			cursar.setFalta("");
			cursar.setNota("");
			cursar.setMatriculaAluno(0);
			cursar.setIdDisciplina(0);
			

			request.setAttribute("cursar", cursar);
			

			RequestDispatcher saida = request.getRequestDispatcher("FormularioCadastroCursar.jsp");
			saida.forward(request, response);
			
			
		}

<<<<<<< HEAD
		if(acao!=null  && acao.equals("lis")){
			

			List<Cursar> lista = curdao.BuscarTodos();
=======
		if(acao!=null && acao.equals("lis")){
			List<Cursar> lista = curdao.BuscarMatriculaAluno(macursar);
>>>>>>> 06bf4517ac507a8f128966235204ad40b0dc7315
			
			request.setAttribute("lista", lista);
			
			RequestDispatcher saida = request.getRequestDispatcher("ListaCursar.jsp");
			saida.forward(request, response);
			
		}
<<<<<<< HEAD
		if(acao!=null  && acao.equals("lis")&& parametro==1){
			
			
			HttpSession session = request.getSession();  
			int variavel = (Integer)session.getAttribute("matriculaAluno");
			List<Cursar> lista = (List<Cursar>) curdao.BuscarMatriculaAluno(variavel);
			
			request.setAttribute("lista", lista);
			
			RequestDispatcher saida = request.getRequestDispatcher("ListaCursarAluno.jsp");
			saida.forward(request, response);





			
		}
		if(acao!=null  && acao.equals("lis")&& parametro==2){
			
			String mat =  JOptionPane.showInputDialog("Confirme sua matr�cula:");
			 int maa = Integer.parseInt(mat);
			Cursar lista = curdao.BuscarMatriculaAluno(maa);
			
			request.setAttribute("lista", lista);
			
			RequestDispatcher saida = request.getRequestDispatcher("ListaCursarAluno.jsp");
			saida.forward(request, response);
			
		}

=======
>>>>>>> 06bf4517ac507a8f128966235204ad40b0dc7315
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
<<<<<<< HEAD

=======
		
>>>>>>> 06bf4517ac507a8f128966235204ad40b0dc7315
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
