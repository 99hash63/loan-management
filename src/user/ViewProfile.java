package user;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ViewProfile
 */
@WebServlet("/ViewProfile")
public class ViewProfile extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String un = request.getParameter("un");
		System.out.println(un);
		
		try {
			List<User> user = UserDBCon.getUser(un);
			
			request.setAttribute("user", user);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		RequestDispatcher d = request.getRequestDispatcher("UserProfile.jsp");
		d.forward(request, response);
		
	}

}
