package cookies;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/servlet1")
public class Servlet1 extends HttpServlet {
 @Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	String name=req.getParameter("name");
	String password=req.getParameter("password");
	
	//Creating cookie
	Cookie cookie=new Cookie("myname", name);
	Cookie cookie2=new Cookie("mypassword", password);
	resp.addCookie(cookie);
	resp.addCookie(cookie2);
	
	PrintWriter printWriter=resp.getWriter();
	printWriter.write("<html><body><h1>"+"Welcome"+name+"</h1></body></html>");
	printWriter.write("<a href='servlet2'>Click for servlet2</a>");
}
}
