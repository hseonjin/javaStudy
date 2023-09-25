package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dto.Member;

/**
 * Servlet implementation class Login
 */
@WebServlet("/login")
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
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String id = request.getParameter("id");
		String password = request.getParameter("password");

		HttpSession session = request.getSession(); // 기존의 세션 가져오기
		Member member = (Member) session.getAttribute("member");

		RequestDispatcher dispatcher = request.getRequestDispatcher("main.jsp");
		// 로그인 인증 정보
		if (member != null) { // 회원 정보가 비어있지 않고
			if (member.getId().equals(id)) { // 세션에 저장된 id 값과 파라미터값이 일치하고
				if (member.getPassword().equals(password)) { // 세션 password == password 파라미터 값일 때
					request.setAttribute("id", id); // id라는 이름으로 id 파라미터 값 저장
					request.setAttribute("page", "makeAccount"); // 로그인 성공 시 makeAccount.jsp로 이동하기 위해
				} else { // 비밀번호 에러
					request.setAttribute("err", "비밀번호가 틀립니다");
					request.setAttribute("page", "error");
				}
			} else { // 아이디 에러
				request.setAttribute("err", "아이디가 틀립니다");
				request.setAttribute("page", "error");
			}
		} else {
			request.setAttribute("err", "회원정보가 없습니다");
			request.setAttribute("page", "error");
		}
		dispatcher.forward(request, response);
	}

}
