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
 * Servlet implementation class Deposit
 */
@WebServlet("/deposit")
public class Deposit extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Deposit() {
        super();
        // TODO Auto-generated constructor stub
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher dispatcher = request.getRequestDispatcher("deposit.jsp");
		dispatcher.forward(request, response);
    }
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String id = request.getParameter("id");
		Integer money = Integer.parseInt(request.getParameter("money"));
		
		HttpSession session = request.getSession();
		Account acc = (Account) session.getAttribute(id);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("accountInfo.jsp"); // 위임하기
		
		if(acc != null) { // acc에 저장된 값이 있는 경우 속성에 acc 값과 page 값을 담기
			acc.deposit(money);
			request.setAttribute("acc", acc);
			request.setAttribute("page", "accountInfo");
		} else {
			request.setAttribute("err", "계좌번호가 틀립니다");
			request.setAttribute("page", "error");
		}
		dispatcher.forward(request, response);
	}

}
