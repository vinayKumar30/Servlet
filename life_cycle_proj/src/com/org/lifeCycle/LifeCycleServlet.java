package com.org.lifeCycle;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;

@WebServlet(urlPatterns = "/lifecycle", loadOnStartup = 688, initParams = {
		@WebInitParam(name = "jingala", value = "ulala"), @WebInitParam(name = "age", value = "56") })
public class LifeCycleServlet extends GenericServlet {

	public LifeCycleServlet() {
		System.out.println("Servlet Object created");
	}

	/*
	  @Override public void init(ServletConfig config) throws ServletException {
	  System.out.println("Initializing the resources of LifeCycleServlet");
	 }
	 */

	@Override
	public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
		System.out.println("Service method is executed");

		String AppName = req.getParameter("appName");
		String AppSize = req.getParameter("appSize");
		String AppVersion = req.getParameter("appVersion");
		
		ServletConfig con = getServletConfig();
		String val = con.getInitParameter("jingala");
		String age = con.getInitParameter("age");

		ServletOutputStream outputStream = resp.getOutputStream();
		outputStream.print(" Welcome to the App:"+AppName+"  "+val+"  "+age+" ");
	}

	@Override
	public void destroy() {
		System.out.println("Destroy method in invoked");
	}

}
