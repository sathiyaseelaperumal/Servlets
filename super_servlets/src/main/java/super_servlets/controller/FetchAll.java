package super_servlets.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import super_servlets.dao.ServletsDao;
import super_servlets.dto.ServletsDto;

//localhost:1234/super_servlets/fall
@WebServlet("/fall")
public class FetchAll extends HttpServlet {
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	ServletsDao servletsDao=new ServletsDao();
	List<ServletsDto> list=servletsDao.fetchAll();
	resp.getWriter().print(list);
		
	}

}
