package super_servlets.controller;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

import super_servlets.dao.ServletsDao;

@WebServlet("/fid")
public class FindById extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String id=req.getParameter("pk");
        int cid=Integer.parseInt(id);
		
        
        ServletsDao servletsDao=new ServletsDao();
        Object o=servletsDao.findbyId(cid);
        res.getWriter().print(o);
       
		
	}

}
