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
import javax.servlet.http.HttpSession;
import javax.swing.JOptionPane;

import br.com.infox.entidades.Aviso;
import br.com.infox.jdbc.AvisoDAO;

/**
 * Servlet implementation class AvisoController
 */
@WebServlet("/avisocontroller.do")
public class AvisoController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AvisoController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		

		

		String acao = request.getParameter("acao");
		
		AvisoDAO avidao = new AvisoDAO();
		int parametro=0;
		

		if(acao!=null && acao.equals("exc")){
			

			String idAviso = request.getParameter("id");
			
			Aviso av = new Aviso();
			
			av.setIdAviso(Integer.parseInt(idAviso));
			
			avidao.Excluir(av);
			

			//Redirecionar para o cliente(browser) a lista com o registro já excluído
			response.sendRedirect("avisocontroller.do?acao=lis");
			
			
			
		}
		


		if(acao!=null && acao.equals("alt")){
			

			String idAviso = request.getParameter("idAviso");
			
			Aviso av = new Aviso();
			avidao.BuscarIdAviso(Integer.parseInt(idAviso));
			avidao.Alterar(av);
			
			
			request.setAttribute("aviso", av);
			

			RequestDispatcher saida = request.getRequestDispatcher("FormularioCadastroAviso.jsp");
			saida.forward(request, response);

			
			
			
		}
		

		if(acao!=null && acao.equals("cad")){
			

			
			Aviso av = new Aviso();
			av.setNomeAviso("");
			av.setIdAviso(0);
			av.setHoraPublicacao("");
			av.setIdDisciplina(0);
			av.setMensagemaviso("");
			
			
			request.setAttribute("aviso", av);
			

			RequestDispatcher saida = request.getRequestDispatcher("FormularioCadastroAviso.jsp");
			saida.forward(request, response);

			
			
			
		}

		if(acao!=null  && acao.equals("lis")){
			
			List<Aviso> lista = avidao.BuscarTodos();
			
			request.setAttribute("lista", lista);
			
			RequestDispatcher saida = request.getRequestDispatcher("ListaAviso.jsp");
			saida.forward(request, response);
			
			}
		if(acao!=null  && acao.equals("lis")&& parametro ==1){
			

			HttpSession session = request.getSession();  
			int variavel = (Integer)session.getAttribute("idAviso");
			Aviso lista = avidao.BuscarIdAviso(variavel);
			
			request.setAttribute("lista", lista);
			
			RequestDispatcher saida = request.getRequestDispatcher("ListaAviso.jsp");
			saida.forward(request, response);
			
			}
		
		if(acao!=null  && acao.equals("lis")&& parametro ==2){
			

			String mat =  JOptionPane.showInputDialog("Confirme id do aviso:");
			 int maa = Integer.parseInt(mat);
			Aviso lista = avidao.BuscarIdAviso(maa);
			
			request.setAttribute("lista", lista);
			
			RequestDispatcher saida = request.getRequestDispatcher("ListaAviso.jsp");
			saida.forward(request, response);
			
			}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		


		String nomeAviso = request.getParameter("txtnomeaviso");
		int idAviso = Integer.parseInt(request.getParameter("txtidaviso"));
		String horaPublicacao =  request.getParameter("txthorapublicacao");
		int idDiscipl = Integer.parseInt(request.getParameter("txtiddisciplina"));
		String mensagemaviso = request.getParameter("txtmensagemaviso");
		
		Aviso aviso = new Aviso();
		
		aviso.setNomeAviso(nomeAviso);
		aviso.setIdAviso(idAviso);
		aviso.setHoraPublicacao(horaPublicacao);
		aviso.setIdDisciplina(idDiscipl);
		aviso.setMensagemaviso(mensagemaviso);
		
		AvisoDAO avisodao = new AvisoDAO();
		avisodao.Cadastrar(aviso);
		
		PrintWriter saida = response.getWriter();
		saida.print("Cadastrado!");

	}

}
