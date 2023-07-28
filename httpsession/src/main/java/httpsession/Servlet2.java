package httpsession;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/servlet2")
public class Servlet2 extends HttpServlet {
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
	HttpSession httpSession=req.getSession();
	String name2=(String)httpSession.getAttribute("mysessionname");
	
	PrintWriter printWriter=resp.getWriter();
	printWriter.write("<html><body><h1>"+"Welcome"+name2+"</h1></body></html>");
	printWriter.write("<a href='servlet3'>logout</a>");
}
}
