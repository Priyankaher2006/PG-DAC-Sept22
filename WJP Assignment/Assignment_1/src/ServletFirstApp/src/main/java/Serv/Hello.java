package Serv;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/hello")
public class Hello extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//text response-content 
		 resp.setContentType("text/plain");
		 //write response
		 PrintWriter out = resp.getWriter();
		 out.print("Hello Servlet !!!!!!");
		 out.flush();
		 out.close();
	}
}
