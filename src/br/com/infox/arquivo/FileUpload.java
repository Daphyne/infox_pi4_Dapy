package br.com.infox.arquivo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.logging.Logger;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

@WebServlet(urlPatterns = "/upload")
@MultipartConfig(
        fileSizeThreshold = 1024 * 1024, // 1MB
        maxFileSize = 1024 * 1024 * 4,   // 4MB
        maxRequestSize = 1024 * 1024 * 4 // 4MB
)
public class FileUpload extends HttpServlet {

    private static Logger logger = Logger.getLogger(FileUpload.class);

    private static final String BASE_DIR = "C:/uploads";

    @Override
    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html;charset=UTF-8");

        FileService service = new FileService();

        Path destination = service.createFolder(BASE_DIR);

        for (Part part : request.getParts()) {
            if (Files.exists(destination)) {
                service.saveFile(destination, part);
            }
        }

        request.setAttribute("message", "Upload has been done successfully!");
        request.setAttribute("fileEntities", service.findAll());
        
        getServletContext()
                .getRequestDispatcher("/file-list.jsp")
                .forward(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response) throws ServletException, IOException {

        request.setAttribute("fileEntities", new FileService().findAll());
        
        getServletContext()
                .getRequestDispatcher("/file-list.jsp")
                .forward(request, response);
    }
}