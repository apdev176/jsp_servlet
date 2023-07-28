package httpsession;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/servlet3")
public class Servlet3 extends HttpServlet{
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	HttpSession httpSession=req.getSession();
	String name=(String)httpSession.getAttribute("mysessionname");
	httpSession.removeAttribute("mysessionname");//if u want to remove particular atribute from session
	httpSession.invalidate();//if you want to remove all the attribute and close the session
	
	PrintWriter printWriter=resp.getWriter();
	printWriter.write("<html><body><h1>"+"logged out"+name+"</h1></body></html>");
}
}
