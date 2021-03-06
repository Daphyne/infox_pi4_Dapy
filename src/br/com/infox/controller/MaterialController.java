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

import br.com.infox.entidades.Material;
import br.com.infox.jdbc.MaterialDAO;

/**
 * Servlet implementation class MaterialController
 */
@WebServlet("/materialcontroller.do")
public class MaterialController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MaterialController() {
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
		int idmaterial = Integer.parseInt(request.getParameter("txtmidmater"));
>>>>>>> 06bf4517ac507a8f128966235204ad40b0dc7315
		

		String acao = request.getParameter("acao");
		
		MaterialDAO matdao = new MaterialDAO();
		


		if(acao!=null && acao.equals("exc")){


<<<<<<< HEAD
			String idMaterial = request.getParameter("id");
=======
			String idMaterial = request.getParameter("idMaterial");
>>>>>>> 06bf4517ac507a8f128966235204ad40b0dc7315
			
			Material mater = new Material();
			
			mater.setIdMaterial(Integer.parseInt(idMaterial));
			
			matdao.Excluir(mater);
			

<<<<<<< HEAD
			//Redirecionar para o cliente(browser) a lista com o registro j� exclu�do
			response.sendRedirect("materialcontroller.do?acao=lis");
=======

			//Redirecionar para o cliente(browser) a lista com o registro j� exclu�do
			response.sendRedirect("materialcontroller.do?acao=lis");
				
>>>>>>> 06bf4517ac507a8f128966235204ad40b0dc7315
			

			
		}
		
		if(acao!=null && acao.equals("alt")){


			String idMaterial = request.getParameter("idMaterial");
			
<<<<<<< HEAD
			Material mater = new Material();
			mater = matdao.BuscarIdMaterial(Integer.parseInt(idMaterial));
			matdao.Alterar(mater);
			
=======
			Material mater = (Material) matdao.BuscarIdMaterial(Integer.parseInt(idMaterial));
>>>>>>> 06bf4517ac507a8f128966235204ad40b0dc7315
			
			request.setAttribute("material", mater);
			

			RequestDispatcher saida = request.getRequestDispatcher("FormularioCadastroMaterial.jsp");
			saida.forward(request, response);

			

			
		}
		
		if(acao!=null && acao.equals("cad")){


			
			Material mater = new Material();
			mater.setCaminho("");
			mater.setNomeMaterial("");
			mater.setIdMaterial(0);
			mater.setIdDisciplina(0);
			
			request.setAttribute("material", mater);
			

			RequestDispatcher saida = request.getRequestDispatcher("FormularioCadastroMaterial.jsp");
			saida.forward(request, response);

			

			
		}

		if(acao!=null && acao.equals("lis")){
<<<<<<< HEAD
			List<Material> lista = matdao.BuscarTodos();
=======
			List<Material> lista = matdao.BuscarIdMaterial(idmaterial);
>>>>>>> 06bf4517ac507a8f128966235204ad40b0dc7315
			
			request.setAttribute("lista", lista);
			
			RequestDispatcher saida = request.getRequestDispatcher("ListaMaterial.jsp");
			saida.forward(request, response);
			
		}
<<<<<<< HEAD
		
		
=======
>>>>>>> 06bf4517ac507a8f128966235204ad40b0dc7315
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		

		String caminho = request.getParameter("txtcaminhomaterial"); 
		String nomeMaterial = request.getParameter("txtnomedomaterial");
		int idMaterial = Integer.parseInt(request.getParameter("txtidmaterial"));
		int idDisciplin = Integer.parseInt(request.getParameter("txtiddisciplina"));
		
		Material material = new Material();
		
		material.setCaminho(caminho);
		material.setNomeMaterial(nomeMaterial);
		material.setIdMaterial(idMaterial);
		material.setIdDisciplina(idDisciplin);
		
		MaterialDAO materialdao = new MaterialDAO();
		materialdao.Cadastrar(material);
		
		
		
		PrintWriter saida = response.getWriter();
		saida.print("Cadastrado!");

	}

}
