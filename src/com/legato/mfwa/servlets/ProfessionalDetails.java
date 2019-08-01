package com.legato.mfwa.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ProfessionalDetails
 */
@WebServlet("/ProfessionalDetails")
public class ProfessionalDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProfessionalDetails() {
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
		PrintWriter out=response.getWriter();
		out.print("<html><head><title>inbox</title></head><body>");
		out.print("<h1 style='margin-left:40%;')professional</h1>");
		out.print("<h2>professional DEtails</h2>");
		out.print("<form method='post' action='RegistrationSuccess'>");
		out.print("college name<input type='text' name='college' /><br />");
		out.print("Equalification<input type='text' name='degree' /><br />");
		out.print("<input type='hidden' name='fname' value='"+firstName +"'/>");		
		out.print("<input type='hidden' name='lname' value='"+lastName +"'/>");		
		out.print("<input type='hidden' name='username' value='"+userName +"'/>");	
		
		out.print("<input type='submit' name='register' value='Register' />");	
		out.print("</body></html>");
	}

}
