package com.legato.mfwa.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
* Servlet implementation class LoginServlet3
*/
@WebServlet("/LoginServlet3")
public class LoginServlet3 extends HttpServlet {
private static final long serialVersionUID = 1L;

/**
* @see HttpServlet#HttpServlet()
*/
public LoginServlet3() {
super();
// TODO Auto-generated constructor stub
}

/**
* @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
*/
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
// TODO Auto-generated method stub
String username= request.getParameter("username");
String password= request.getParameter("pass");
String location=request.getParameter("location");
if("admin".equals(username) && "admin".equalsIgnoreCase(password)) {
HttpSession session=request.getSession();
	session.setAttribute("user",username);
	session.setAttribute("location",location);
	response.sendRedirect("InboxServlet3");

}
}

}