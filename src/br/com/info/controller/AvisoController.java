package br.com.info.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.infox.entidades.Aviso;
import br.com.infox.jdbc.AvisoDAO;

/**
 * Servlet implementation class AvisoController
 */
@WebServlet("/avisocontroller.do")
public class AvisoController extends HttpServlet implements Servlet {
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
		


		int idaviso = Integer.parseInt(request.getParameter("txtmidav"));
		

		String acao = request.getParameter("acao");
		
		AvisoDAO avidao = new AvisoDAO();
		

		if(acao!=null && acao.equals("exc")){
			

			String idAviso = request.getParameter("idAviso");
			
			Aviso av = new Aviso();
			
			av.setIdAviso(Integer.parseInt(idAviso));
			
			avidao.Excluir(av);
			
			
			
		}
		


		if(acao!=null && acao.equals("alt")){
			

			String idAviso = request.getParameter("idAviso");
			
			Aviso av = (Aviso) avidao.BuscarIdAviso(Integer.parseInt(idAviso));
			
			
			request.setAttribute("aviso", av);
			

			RequestDispatcher saida = request.getRequestDispatcher("FormularioCadastroAviso.jsp");
			saida.forward(request, response);

			
			
			
		}
		

		if(acao!=null){
			
			List<Aviso> lista = avidao.BuscarIdAviso(idaviso);
			
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
