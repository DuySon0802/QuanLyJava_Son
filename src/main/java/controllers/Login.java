package controllers;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import model.CourseModuleDAO;
import model.StudentDAO;

import java.io.IOException;

/**
 * Servlet implementation class Login
 */
@WebServlet("/svLogin")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String usn=request.getParameter("myUsn");
		String pwd=request.getParameter("myPwd");
		
		//if(usn.equals("admin")&pwd.equals("123")) {
		if(new StudentDAO().checkAccount(usn, pwd)) {
			HttpSession session=request.getSession();
			session.setAttribute("myUsn", usn);
			session.setAttribute("lstCourseModule", new CourseModuleDAO().getCourseModules());
			response.sendRedirect("index.jsp");
			
		}else {
			request.setAttribute("myMsg", "Tài khoản không hợp lệ. Đề nghị nhập lại...");
			request.getRequestDispatcher("login.jsp").forward(request, response);
		}
	}

}
