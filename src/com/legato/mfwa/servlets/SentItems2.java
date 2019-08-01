package com.legato.mfwa.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
* Servlet implementation class SentItems2
*/
@WebServlet("/SentItems2")
public class SentItems2 extends HttpServlet {
private static final long serialVersionUID = 1L;

/**
* @see HttpServlet#HttpServlet()
*/
public SentItems2() {
super();
// TODO Auto-generated constructor stub
}

/**
* @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
*/
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
// TODO Auto-generated method stub
Cookie [] cookies=request.getCookies();
String userName=null;
String location=null;
for(Cookie cookie : cookies)
{
if
(cookie.getName().equals("user")){
userName=cookie.getValue();

}else if (cookie.getName().equals("location")) {
location=cookie.getValue();
}

}
PrintWriter out=response.getWriter();
out.print("<html><head><title>Inbox</title></head><body>");
out.print("<h1 style='margin-left:40%);'>Sent Items Page 2</h1>");
out.print("<h2> Welcome" +userName+"</h2>");
out.print("<h2> Location" +location+"</h2>");
out.print("<a href='Inbox2?user="+userName+"&location="+location+"'/>Inbox2</a>");
out.print("</body></html>");
response.getWriter().append("Served at: ").append(request.getContextPath());
}

}