package com.legato.mfwa.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public LoginServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub

		String userName = request.getParameter("usreName");
		String password = request.getParameter("password");
		if ("admin".equalsIgnoreCase(userName) && "admin".equals(password)) {
			response.sendRedirect("SuccessServlet?user=" + userName);
		} else {
			PrintWriter out = response.getWriter();
			response.setContentType("text/html");
			out.print("<html>");
			out.print("<head>");
			out.print("<tile>my servlet</title>");
			out.print("</head>");
			out.print("<body>");
			out.print("the entered credential does not match");
			out.print("</body>");
			out.print("<html>");
		}
	}

}
