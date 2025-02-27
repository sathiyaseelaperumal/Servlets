package super_servlets.controller;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import super_servlets.dao.ServletsDao;



@WebServlet("/did")
public class DeleteById extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String a=req.getParameter("delete");
		int cid=Integer.parseInt(a);
		
		ServletsDao servletsDao=new ServletsDao();
		String msg=servletsDao.deleteById(cid);
		resp.getWriter().print(msg);
	}
	
		  
		  
		  
		  
		  
		  
		 		
	}


	


