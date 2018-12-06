package com.Accelya;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CountryData
 */
public class CountryData extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CountryData() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    public String ankita() {
    	return "Hi Ankita";
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	String nameOfCountry=request.getParameter("search_Box");
	System.out.println("Recived Name of country is :"+nameOfCountry);
	
	ArrayList<String> al=new ArrayList<String>();
	al.add("India");
	al.add("Germany");
	al.add("UK");
	al.add("US");
	al.add("JAPAN");


	if (al.contains(nameOfCountry)) {
		request.setAttribute("DATA", nameOfCountry);	
	}
	else {
		request.setAttribute("DATA", "No Data Found");
	}
	
	RequestDispatcher rd=request.getRequestDispatcher("index.jsp");
	rd.forward(request, response);
	}

}
