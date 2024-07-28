package IMC.documentation.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import IMC.documentation.dao.DocumentDao;
import IMC.documentation.dao.UserDao;
import IMC.documentation.entity.Document;
import IMC.documentation.entity.User;

@WebServlet("/submitRequest")
public class BirthCertificate extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private DocumentDao documentDao;
	 @Override
	    public void init() throws ServletException {
		 documentDao = new DocumentDao();
	    }
	 @Override
	    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	        String action = request.getParameter("action");

	        if ("register".equals(action)) {
	            handleRegister(request, response);
	        }
	 }
	 private void handleRegister(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	        String child_name = request.getParameter("child_name");
	        String parents_name = request.getParameter("parents_name");
	        String hospital_certificate = request.getParameter("hospital_certificate");

	        Document document = new Document();
	        document.setChild_name(child_name);
	        document.setParents_name(parents_name);
	        document.setHospital_certificate(hospital_certificate);
	        documentDao.registerCertificate(document);
	        response.sendRedirect("index.jsp");
	    }

	    @Override
	    protected void doGet(HttpServletRequest request, HttpServletResponse response)
	            throws ServletException, IOException {
	        String action = request.getParameter("action");

	        if ("register".equals(action)) {
	            } else {
	                response.sendRedirect("index.jsp");
	            }
	        }
	    }
