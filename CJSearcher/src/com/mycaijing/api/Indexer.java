package com.mycaijing.api;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.caucho.loader.ServletClassloaderHack;

/**
 * Servlet implementation class Indexer
 */
@WebServlet("/Indexer")
public class Indexer extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public Indexer() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String a = request.getParameter("test");
		
		List<String> result=KeywordService.tokenizer("");
		//String result=KeywordService.toB();
		//String result = Test2.toC();
		//String result = KeywordService.toB();
		//ServletContext _servletContext=getServletContext();
		//a=_servletContext.getRealPath("/");
		response.getOutputStream().print(result.toString());
		response.getOutputStream().print(a);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
