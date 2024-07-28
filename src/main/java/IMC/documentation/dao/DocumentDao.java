package IMC.documentation.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import IMC.documentation.entity.Document;
import IMC.documentation.entity.User;
import IMC.documentation.util.DbUtil;

public class DocumentDao {
	private static final String INSERT_birthcertificaterequest_SQL = "INSERT INTO birthcertificaterequest (child_name, parents_name, hospital_certificate) VALUES (?, ?, ?)"; 
	   private static final String SELECT_CHILD_BY_CHILD_NAME_AND_PARENTS_NAME = "SELECT * FROM birthcertificaterequest WHERE child_name = ? AND parents_name = ?";
	    

	private Connection conn;

	    public DocumentDao() {
	        conn = DbUtil.getConnection();
	    }
	    protected Connection getConnection() throws SQLException {
	        Connection connection = null;
	        try {
	            Class.forName("com.mysql.jdbc.Driver");
	            connection = DbUtil.getConnection();
	        } catch (ClassNotFoundException e) {
	            e.printStackTrace();
	        }
	        return connection;
	    }

	   

	    public Document authenticateChild(String child_name, String parents_name) {
	        Document child = null;
	        try (Connection connection = getConnection();
	             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_CHILD_BY_CHILD_NAME_AND_PARENTS_NAME)) {
	            preparedStatement.setString(1,child_name );
	            preparedStatement.setString(2, parents_name);
	            ResultSet rs = preparedStatement.executeQuery();
	            if (rs.next()) {
	            	child = new Document();
	            	child.setId(rs.getInt("id"));
	            	child.setChild_name(rs.getString("child_name"));
	            	child.setParents_name(rs.getString("parents_name"));
	            	child.setHospital_certificate(rs.getString("hospital_certificate"));
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	        return child;
	    }
	    public User getInfantByChildName(String child_name) {
	        String sql = "SELECT * FROM birthcertificaterequest WHERE child_name = ?";
	        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
	            stmt.setString(1, child_name);
	            ResultSet rs = stmt.executeQuery();
	            if (rs.next()) {
	                return new User(
	                        rs.getInt("id"),
	                        rs.getString("child_name"),
	                        rs.getString("parents_name"),
	                        rs.getString("hospital_certificate")
	                        
	                );
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	        return null;
	    }

	    public void registerCertificate(Document document) {
	        String sql = "INSERT INTO birthcertificaterequest (child_name, parents_name,hospital_certificate ) VALUES (?, ?, ?)";
	        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
	            stmt.setString(1, document.getChild_name());
	            stmt.setString(2, document.getParents_name());
	            stmt.setString(3, document.getHospital_certificate());
	            stmt.executeUpdate();
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }
}
