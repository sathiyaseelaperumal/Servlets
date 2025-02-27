package super_servlets.controller;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

import super_servlets.dao.ServletsDao;
import super_servlets.dto.ServletsDto;

@WebServlet("/a")
public class insert implements Servlet {

	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String a=req.getParameter("id");
		int ca=Integer.parseInt(a);
		String b=req.getParameter("name");
		String c=req.getParameter("email");
		String d=req.getParameter("pwd");
//		System.out.println(a+" "+b+" "+c+" "+d);
//		res.getWriter().print("data inserted");
		
		ServletsDto servletsDto=new ServletsDto();
		servletsDto.setId(ca);
		servletsDto.setName(b);
		servletsDto.setEmail(c);
		servletsDto.setPassword(d);
		System.out.println(servletsDto);
	
		ServletsDao servletsDao=new ServletsDao();
		String msg=servletsDao.insert(servletsDto);
		res.getWriter().print(msg);
		
		
		
		
		
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

}
