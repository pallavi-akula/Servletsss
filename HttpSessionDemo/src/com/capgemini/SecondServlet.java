package com.capgemini;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SecondServlet
 */
@WebServlet("/SecondServlet")
public class SecondServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SecondServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		 response.setContentType("text/html");
	        PrintWriter out = response.getWriter();   

	String n=request.getParameter("userName");
	String q=request.getParameter("Qualification");

	HttpSession session = request.getSession();
	session.setAttribute("Sname", n);
	if(n!=null) {
	    session.setAttribute("sessionname",n);
	}

	out.println(session.getAttribute("sessionname"));
	out.println("<br>");
	session.setAttribute("Squalification", q);


	if(q!=null) {
	    session.setAttribute("sessionQual",q);
	}

	out.println(session.getAttribute("sessionQual"));
	out.println("<br>");


	out.println("<html>");
	out.println("<body>");
	out.println("<form action= 'ThirdServlet'>");
	out.println("Enter Marks:<input type='text' name='Marks'>");
	out.println("<input type='submit'>");
	out.println("</body>");
	out.println("</form>");
	out.println("</html>");
	        
	    
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
