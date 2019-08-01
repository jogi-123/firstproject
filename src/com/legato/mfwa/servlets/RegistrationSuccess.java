package com.legato.mfwa.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegistrationSuccess
 */
@WebServlet("/RegistrationSuccess")
public class RegistrationSuccess extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegistrationSuccess() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String firstName=request.getParameter("fname");
		String lastName=request.getParameter("lname");
		String userName=request.getParameter("username");
		String collegeName=request.getParameter("college");
		String degree=request.getParameter("degree");
		PrintWriter out=response.getWriter();
		out.print("<html><head><title>Success</title></head><body>");
		out.print("<h1 style='margib-left:40%;'>Registration Details</h1>");
		out.print("First Name:"+firstName+"<br/>");
		out.print("Last Name:"+lastName+"<br/>");
		out.print("User Name:"+userName+"<br/>");
		out.print("College Name:"+collegeName+"<br/>");
		out.print("Degree Name:"+degree+"<br/>");
		out.print("</body></html>");
		
	}

}
