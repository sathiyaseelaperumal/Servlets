package super_servlets.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import super_servlets.dao.ServletsDao;

@WebServlet("/dall")
public class DeleteAll extends HttpServlet{
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		ServletsDao servletsDao=new ServletsDao();
		String msg=servletsDao.deleteAll();
		resp.getWriter().print(msg);
	}

}
