package br.com.infox.arquivo2;

import java.sql.SQLException;
import java.util.List;

public class FileDAO {

	public boolean add(FileBean filebean) {
        int added = 0;
        try {
            Connection con = ConnectionFactory.createConnection();
            if (con != null) {
                String sql = "INSERT INTO file (name, description, data) VALUES (?, ?, ?)";
                PreparedStatement st = con.prepareStatement(sql);
                st.setString(1, filebean.getName());
                st.setString(2, filebean.getDescription());
                st.setBytes(3, filebean.getData());
                added = st.executeUpdate();
                st.close();
                con.close();
            }
        } catch (SQLException e) {
            //tratar erro
        }

        return added > 0;
    }

     public List list() {
        List files = new ArrayList();
        try {
            Connection con = ConnectionFactory.createConnection();
            if (con != null) {
                String sql = "SELECT * FROM file";
                Statement st = con.createStatement();
                ResultSet rs = st.execute(sql);

                while(rs.next()){
                    FileBean filebean = createFileBean(rs);
                    files.add(filebean);
                }

                st.close();
                con.close();
            }
        } catch (SQLException e) {
            //tratar erro
        }

        return files;
    }

    public FileBean getFile(long id) {
        FileBean filebean = null;
        try {
            Connection con = ConnectionFactory.createConnection();
            if (con != null) {
                String sql = "SELECT * FROM file WHERE id=?";
                PreparedStatement st = con.prepareStatement(sql);
                st.setLong(1, id);
                ResultSet rs = st.executeQuery();
                if (rs.next()) {
                    filebean = createFileBean(rs);
                }
                rs.close();
                st.close();
                con.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return file;
    }

    private FileBean createFileBean(ResultSet rs) throws SQLException {
        FileBean filebean = new FileBean();
        filebean.setData(rs.getBytes("data"));
        filebean.setId(rs.getLong("id"));
        filebean.setName(rs.getString("name"));
        filebean.setDescription(rs.getString("description"));

        return filebean;
    }
}

