package br.com.infox.arquivo2;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DownloadFileServlet
 */
@WebServlet("/downloadfileservlet.do")
public class DownloadFileServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DownloadFileServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest req, HttpServletResponse resp)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String idStr = req.getParameter("id");
        if(idStr == null){     
           //redirect to home or other
        }

        FileDao dao = new FileDaoImpl();
        Long id = Long.parseLong(idStr);
        FileBean filebean = dao.getFile(id);

        if (file != null) {
            ServletContext context = getServletConfig().getServletContext();
            String mimetype = context.getMimeType(filebean.getName());

            resp.setContentLength(filebean.getData().length);
            resp.setContentType(mimetype);//resp.setContentType("image/jpeg");

            resp.setHeader("Content-Disposition", "attachment; filename=\"" +    filebean.getName() + "\"");

            OutputStream out = resp.getOutputStream();
            InputStream in = new ByteArrayInputStream(filebean.getData());
            byte[] buffer = new byte[4096];
            int length;
            while ((length = in.read(buffer)) > 0) {
                out.write(buffer, 0, length);
            }
            in.close();
            out.flush();
        }
    }
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
