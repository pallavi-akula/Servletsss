package com.capgemini;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MyServlet
 */
@WebServlet("/MyServlet")
public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyServlet() {
        super();
        System.out.println("Constructor");
        // TODO Auto-generated constructor stub
    }
    public void  init(){
    	System.out.println("init with zero parameter");
    }
    public void  init(ServletConfig  config){
    	System.out.println("init with config parameter");
    }
    public void  service(ServletRequest request,ServletResponse response){
    	System.out.println("genericService");
    }
    public void  service(HttpServletRequest request,HttpServletResponse response){
    	System.out.println("HttpService");
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	System.out.println("DogetMethod");
	}
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		System.out.println("DoPostMethod");
	}
	@Override
	public void destroy(){
		System.out.println("Destroy method");
	}
	

}
