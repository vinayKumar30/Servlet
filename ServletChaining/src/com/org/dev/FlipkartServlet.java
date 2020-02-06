package com.org.dev;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/flipkart")
public class FlipkartServlet extends HttpServlet {

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		// chaining one servlet to another resources(here another servlet)
		RequestDispatcher rd = req.getRequestDispatcher("/secondflipkart"); // url pattern of second servlet /jsp/html

		// forward the data using forward method
		rd.forward(req, resp);
	}

}
