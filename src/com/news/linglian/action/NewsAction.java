package com.news.linglian.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.news.linglian.factory.IServletFactory;

/**
 * Servlet implementation class NewsAction
 */
@WebServlet(name = "NewsAction", urlPatterns = "/NewsAction.do", initParams = {
		@WebInitParam(name = "action_factory", value = "com.news.linglian.factoryImpl.INewsFactoryImpl"),
		@WebInitParam(name = "login_from", value = "user/login.jsp"),
		@WebInitParam(name = "login_to", value = "user/index.jsp"),
		@WebInitParam(name = "queryOfId_from", value = "NewFile.jsp"),
		@WebInitParam(name = "queryOfId_to", value = "NewFile.jsp"),
		@WebInitParam(name = "remove_from", value = "news/newsDetail.jsp"),
		@WebInitParam(name = "remove_to", value = "other/404.jsp"),
		@WebInitParam(name = "update_from", value = "news/newsPost.jsp"),
		@WebInitParam(name = "update_to", value = "other/404.jsp"),
		@WebInitParam(name = "queryAll_from", value = "NewFile.jsp"),
		@WebInitParam(name = "queryAll_to", value = "NewFile.jsp"),
		@WebInitParam(name = "queryUnNew_from", value = "Newstest.jsp"),
		@WebInitParam(name = "queryUnNew_to", value = "Newstest.jsp"),
		@WebInitParam(name = "queryAuNew_from", value = "Newstest.jsp"),
		@WebInitParam(name = "queryAuNew_to", value = "Newstest.jsp"),
		@WebInitParam(name = "adminRemove_from", value = "Newstest.jsp"),
		@WebInitParam(name = "adminRemove_to", value = "Newstest.jsp"),
		@WebInitParam(name = "reviewNews_from", value = "Newstest.jsp"),
		@WebInitParam(name = "reviewNews_to", value = "Newstest.jsp"),
		@WebInitParam(name = "adminRemoves_from", value = "Newstest.jsp"),
		@WebInitParam(name = "adminRemoves_to", value = "Newstest.jsp"),
		@WebInitParam(name = "insert_to", value = "other/404.jsp"),
		@WebInitParam(name = "insert_from", value = "news/newsPost.jsp")})
public class NewsAction extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public NewsAction() {
        super();
        // TODO Auto-generated constructor stub
    }
    protected void doThing(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String method = request.getParameter("method");
		IServletFactory isf;
		try {
			isf = (IServletFactory) Class.forName(
					this.getServletConfig().getInitParameter("action_factory"))
					.newInstance();
			isf.doThing(request, response, this, method);
		} catch (InstantiationException | IllegalAccessException
				| ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doThing(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doThing(request, response);
	}

}
