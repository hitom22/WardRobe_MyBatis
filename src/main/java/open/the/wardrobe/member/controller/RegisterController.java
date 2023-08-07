package open.the.wardrobe.member.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import open.the.wardrobe.model.service.MemberService;
import open.the.wardrobe.model.vo.Member;

/**
 * Servlet implementation class RegisterController
 */
@WebServlet("/member/register.do")
public class RegisterController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/views/member/register.jsp");
		view.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("UTF-8");
		String userId = request.getParameter("userid");
		String password = request.getParameter("password");
		String choice1 = request.getParameter("cellphone[]");
		String tel = request.getParameter("phone");
		String userName = request.getParameter("user_name");
		String email = request.getParameter("email");
		String choice2 = request.getParameter("email[]");
		String gender = request.getParameter("sex");
		String height = request.getParameter("label[1][value][]");
		String weight = request.getParameter("label[3][value][]");
		String footSize = request.getParameter("label[9][value][]");

		Member member = new Member(userId, password, choice1, tel, userName
				, email, choice2, gender, height, weight, footSize);
		// 서비스 호출
		MemberService service = new MemberService();
		
		int result = service.insertMember(member);
		if(result > 0) {
			//성공
			request.setAttribute("msg", "회원가입 성공했습니다.");
			request.setAttribute("url", "/main/main.jsp");
			request.getRequestDispatcher("/WEB-INF/views/common/serviceSuccess.jsp")
			.forward(request, response);
		}else {
			//실패
			request.getRequestDispatcher("/WEB-INF/views/common/serviceFailed.jsp")
			.forward(request, response);
		}
	}

}
