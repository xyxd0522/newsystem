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
 * Servlet implementation class UserAction
 */
@WebServlet(name = "UserAction", urlPatterns = "/UserAction.do", initParams = {
		@WebInitParam(name = "action_factory", value = "com.news.linglian.factoryImpl.IUserFactoryImpl"),
		@WebInitParam(name = "login_from", value = "NewFile.jsp"),
		@WebInitParam(name = "login_to", value = "NewFile.jsp"),
		@WebInitParam(name = "query_from", value = "NewFile.jsp"),
		@WebInitParam(name = "query_to", value = "NewFile.jsp"),
		@WebInitParam(name = "insert_to", value = "index.jsp"),
		@WebInitParam(name = "insert_from", value = "user/reg.jsp")})
public class UserAction extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserAction() {
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
