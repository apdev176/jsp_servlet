package cookies;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet2")
public class Servlet2 extends HttpServlet {
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	String name=req.getParameter("name");
	System.out.println(name);//null;
	Cookie cookies[]=req.getCookies();
	String fname="";
	for(Cookie data : cookies) {
		if(data.getName().equals("myname")) {
			fname=fname+data.getValue();
		}
	}
	PrintWriter printWriter=resp.getWriter();
	printWriter.write("WelcomeBack"+fname);
}
}
