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
 * Servlet implementation class RegisterUserServlet
 */
@WebServlet("/RegisterUserServlet")
public class RegisterUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		String un = request.getParameter("un");
		String pwd = request.getParameter("pwd");
		String fn = request.getParameter("fn");
		String ln = request.getParameter("ln");
		String age = request.getParameter("age");
		String con = request.getParameter("con");
		String e = request.getParameter("e");
		String a = request.getParameter("a");
		
		boolean isTrue;
		
		isTrue = UserDBCon.registerUser(un, pwd, fn, ln, age, con, e, a);
		
		if(isTrue == true) {
			out.println("<script type='text/javascript'>");
			out.println("alert('Registered Successfully');");
			out.println("location='login.jsp'");
			out.println("</script>");
		}
		
		
	}
		
}

