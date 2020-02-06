package com.org.dev;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/secondflipkart")
public class SecondFlipkart extends HttpServlet {

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String product = req.getParameter("pr");
		//int quantity= req.getParameter("qt");
		int quantity = Integer.parseInt(req.getParameter("qt"));

		double price = 12000.00;

		double total =( quantity) * price;

		ServletOutputStream output = resp.getOutputStream();
		output.print("Total price is:" +total);
		
		
	}

}
