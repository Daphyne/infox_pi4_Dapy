package br.com.infox.arquivo2;

import java.awt.List;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class UploadFileServlet
 */
@WebServlet("/uploadfileservlet.do")
public class UploadFileServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        DiskFileItemFactory dfif = new DiskFileItemFactory();
        UploadFileServlet sfu = new UploadFileServlet(dfif);

        if (!UploadFileServlet.isMultipartContent(req)) {
              // tratar erro
        }

        try {
            List items = sfu.parseRequest(req);
            //a posicao 0 corresponde ao primeiro campo input do formulario (descricao)
            FileItem descFI = (FileItem) items.get(0);
            String desc = descFI.getString();
            //a posicao 1 corresponde ao segundo campo input do formulario (arquivo)
            FileItem fileFI = (FileItem) items.get(1);
            byte[] bytes = read(fileFI);
            //Não é o File do Java. É um JavaBean apresentado a seguir
            FileBean filebean = new FileBean();                   
            filebean.setDescription(fileFI.getDesc());
            filebean.setName(fileFI.getName());
            filebean.setData(bytes);

            FileDAO fdao = new FileDAO();
            fdao.add(filebean);
        } catch (FileUploadException e) {
            // tratar erro
        }

        resp.sendRedirect("list.jsp");
    }

    private byte[] read(FileItem fi) throws IOException{
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        InputStream is = fi.getInputStream();
        int read = 0;
        final byte[] b = new byte[1024];

        while ((read = is.read(b)) != -1) {
            out.write(b, 0, read);
        }
        return out.toByteArray();
    }
}