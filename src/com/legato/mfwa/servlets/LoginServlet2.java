package com.legato.mfwa.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
* Servlet implementation class LoginServlet2
*/
@WebServlet("/LoginServlet2")
public class LoginServlet2 extends HttpServlet {
private static final long serialVersionUID = 1L;

/**
* @see HttpServlet#HttpServlet()
*/
public LoginServlet2() {
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
Cookie cookie1=new Cookie("user",username);
Cookie cookie2=new Cookie("location",location);
response.addCookie(cookie1);
response.addCookie(cookie2);
response.sendRedirect("Inbox2");

}
}

}