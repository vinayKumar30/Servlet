package com.org.xworkz;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/cp")
public class ThirdContext extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		Product prod = new Product();
		prod.name = "tshirt";
		prod.id = 1;
		prod.price = 530.00;
		prod.brand="SDF";

		ServletContext context = getServletContext();
		String name1 = context.getInitParameter("name1");
		String name2 = context.getInitParameter("name2");

		ServletOutputStream output = resp.getOutputStream();
		output.print("<html><body bgcolor='red'>" 
				+ "<h1>This is' '" + name1 + "' '</h1>" 
				+ "<h2>This is' '" + name2
				+ "' '</h2>" + "<h3>Thank your buying ' '" + prod.name + "' '</h3>" 
				+"<h4>Product Details: '"+prod+"' </h4>"
				+ "<a href='home.html'>back</a>"
				+ "</body></html>"
				);

	}

}
