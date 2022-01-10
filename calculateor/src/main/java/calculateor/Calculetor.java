package calculateor;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;

public class Calculetor extends HttpServlet{
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		Integer i = Integer.parseInt(getInitParameter("num1"));
		Integer j = Integer.parseInt(getInitParameter("num2"));
		PrintWriter writer = resp.getWrite();
		writer.println("The Sum Of Two Number is : "+(i+j));		
	}

}
