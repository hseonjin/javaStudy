package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dto.Account;

/**
 * Servlet implementation class AccountInfo
 */
@WebServlet("/accountInfo")
public class AccountInfo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AccountInfo() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher dispatcher = request.getRequestDispatcher("accountInfoForm.jsp");
		dispatcher.forward(request, response);
    }
//	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		request.setCharacterEncoding("utf-8");
//		String id = request.getParameter("id");
//		HttpSession session = request.getSession(); // 세션 가져오기
//		Account acc = (Account) session.getAttribute(id); // Account 객체에 세션 정보 저장
//		
//		RequestDispatcher dispatcher = request.getRequestDispatcher("accountInfo.jsp"); // 위임하기
//		if(acc != null) { // acc에 저장된 값이 있는 경우 속성에 acc 값과 page 값을 담기
//			request.setAttribute("acc", acc);
//			request.setAttribute("page", "accountInfo");
//		} else {
//			request.setAttribute("err", "계좌번호가 틀립니다");
//			request.setAttribute("page", "error");
//		}
//		dispatcher.forward(request, response);
//	}

}
