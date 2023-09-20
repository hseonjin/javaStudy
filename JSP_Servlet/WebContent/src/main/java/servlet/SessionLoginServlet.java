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

/**
 * Servlet implementation class SessionLoginServlet
 */
@WebServlet("/sessionLogin")
public class SessionLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SessionLoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		String id = request.getParameter("id"); // 클라이언트 페이지에서 전송되어 오는 id 파라미터 값을 변수에 할당
		String passwoard = request.getParameter("password"); // 클라이언트 페이지에서 전송되어 오는 password 파라미터 값을 변수에 할당
		if(id.equals("java") && passwoard.equals("java")) { // 임시 id,password (java 입력시 인증 완료 가정)
			HttpSession session = request.getSession(); // 세션 객체 생성
			session.setAttribute("id", id); // "id"라는 이름의 속성 값을 세션 영역에 생성(setAttribute)
			RequestDispatcher dispatcher = request.getRequestDispatcher("menu.jsp"); // 요청 처리를 menu.jsp에 포워드(위임)
			dispatcher.forward(request, response); // forward 메소드가 호출될 떄 실질적으로 해당 url로 포워딩 이루어짐
		} else {
			out.println("<script>");
			out.println("alert('아이디나 비밀번호가 일치하지 않습니다')");
			out.println("history.back()"); // 이전 페이지로 돌아가기
			out.println("</script>");
		}
	}
}
