package br.com.info.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.Scanner;

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

		
		MaterialDAO matdao = new MaterialDAO();
		

		int idmaterial = Integer.parseInt(request.getParameter("txtmidmater"));
		
		List<Material> lista = matdao.BuscarIdMaterial(idmaterial);
		
		request.setAttribute("lista", lista);
		
		RequestDispatcher saida = request.getRequestDispatcher("ListaMaterial.jsp");
		saida.forward(request, response);
		
		
		
		
		
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
