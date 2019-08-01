
package com.legato.mfwa.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
* Servlet implementation class SentItemsServlet3
*/
@WebServlet("/SentItemsServlet3")
public class SentItemsServlet3 extends HttpServlet {
private static final long serialVersionUID = 1L;

/**
* @see HttpServlet#HttpServlet()
*/
public SentItemsServlet3() {
super();
// TODO Auto-generated constructor stub
}

/**
* @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
*/
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
// TODO Auto-generated method stub
String userName=null;
String location=null;
HttpSession session=request.getSession();
if
(session.getAttribute("user")==null){
response.sendRedirect("Login3.html");
}
else {
	userName=session.getAttribute("user").toString();
	location=session.getAttribute("location").toString();
}
PrintWriter out=response.getWriter();
out.print("<html><head><title>Inbox</title></head><body>");
out.print("<h1 style='margin-left:40%);'>Sent Items Page 2</h1>");
out.print("<h2> Welcome" +userName+"</h2>");
out.print("<h2> Location" +location+"</h2>");
out.print("<a href='InboxServlet3'/>inboxservlet3</a>");
out.print("<br/>");
out.print("<a href='LogOut3'/>logout</a>");
out.print("</body></html>");
}

}