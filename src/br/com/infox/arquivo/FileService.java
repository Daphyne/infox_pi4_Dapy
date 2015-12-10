package br.com.infox.arquivo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Calendar;
import java.util.List;
import java.util.logging.Logger;

import javax.servlet.http.Part;

@SuppressWarnings("unchecked")
public class FileService {

    private static Logger logger = Logger.getLogger(FileService.class);

    private String year;
    private String month;
    private IFileDAO dao;

    public FileService() {
        this.year = getYear();
        this.month = getMonth();
        this.dao = new FileDAO();
    }

    public Path createFolder(String baseDir) {

        Path path = Paths.get(baseDir, this.year, this.month);

        try {
            if (Files.exists(path)) {
                Files.createDirectories(path);
            }
        } catch (IOException e) {
            logger.error(e.getMessage());
        }

        return path;
    }

    public void saveFile(Path destination, Part part) {

        String fileName = getFileName(part);
        String contentType = part.getContentType();

        try {
            part.write(destination + File.separator + fileName);
        } catch (IOException e) {
            logger.error(e.getMessage());
        }

        FileEntity fileEntity = new FileEntity();
        fileEntity.setName(fileName);
        fileEntity.setMonth(this.month);
        fileEntity.setYear(this.year);
        fileEntity.setType(contentType);

        dao.save(fileEntity);
    }

    public List<FileEntity> findAll() {

        return dao.findAll();
    }

    public FileEntity find(String year, String month, String name) {

        return dao.find(year, month, name);
    }

    private String getYear() {
        Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);
        return String.valueOf(year);
    }

    private String getMonth() {
        Calendar calendar = Calendar.getInstance();
        int month = calendar.get(Calendar.MONTH) + 1;
        return String.valueOf(month);
    }

    private String getFileName(final Part part) {
        final String partHeader = part.getHeader("content-disposition");
        logger.info("Part Header = {0} " + partHeader);
        for (String content : part.getHeader("content-disposition").split(";")) {
            if (content.trim().startsWith("filename")) {
                return content.substring(
                        content.indexOf('=') + 1).trim().replace("\"", "");
            }
        }
        return null;
    }
}
