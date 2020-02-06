package com.org.xworkz;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ep")
public class FirstContext extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		Product prod = new Product();
		prod.id = 1;
		prod.name = "EarPhone";
		prod.price = 10.00;
		prod.brand = "majesticBrand";
		
		ServletContext con = getServletContext();
		String name1 = con.getInitParameter("name1");
		String name2 = con.getInitParameter("name2");

		ServletOutputStream output = resp.getOutputStream();
		output.print("<html><body bgcolor='red'>" 
				+ "<h1>Thank you for choosing' '" + prod.name + "' '</h1>"
				+"<h2>This is' '"+name1+"' '</h2>"
				+"<h3>This is' '"+name2+"' '</h3>"
				+"<h4>Product Details: '"+prod+"' </h4>"
				+ "<a href='home.html'>back</a>" + "</body></html>");

	}

}
