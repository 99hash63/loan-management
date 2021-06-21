package user;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServelet
 */
@WebServlet("/LoginServelet")
public class LoginServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static String result;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		String un = request.getParameter("un");
		String pwd = request.getParameter("pwd");
		
		try {
			
			result = UserDBCon.validate(un, pwd);
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		if(result.equals("Manager")) {
			RequestDispatcher d = request.getRequestDispatcher("LoanManagerUI.jsp");
			d.forward(request, response);
			
		}
		else if(result != "null") {
			
			request.setAttribute("r", result);
			
			RequestDispatcher d = request.getRequestDispatcher("UserInterface.jsp");
			d.forward(request, response);
			
		}
		
		else{
			out.println("<script type='text/javascript'>");
			out.println("alert('Login error!');");
			out.println("location='login.jsp'");
			out.println("</script>");
		}
		
	}

}
