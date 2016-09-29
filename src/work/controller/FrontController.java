package work.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import work.model.dto.Student;
import work.model.service.MentoringService;
import work.model.service.StudentService;

/**
 * Servlet implementation class FrontController
 */
@WebServlet("/Controller")
public class FrontController extends HttpServlet {

	private MentoringService mentoringService = new MentoringService();
	private StudentService studentService = new StudentService();

	
	
	
	protected void join(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String id = request.getParameter("id");
		String pw = request.getParameter("userPw");
		String name = request.getParameter("name");
		String mobile1 = request.getParameter("mobile1");
		String mobile2 = request.getParameter("mobile2");
		String mobile3 = request.getParameter("mobile3");
		String mobile = mobile1 + "-" + mobile2 + "-" + mobile3;
		String email1 = request.getParameter("email1");
		String email2 = request.getParameter("email2");
		String email = email1 + email2;
		String gender = request.getParameter("gender");
		String birth = request.getParameter("birth");
		String major = request.getParameter("major");
		String division = request.getParameter("division");
		String grade = request.getParameter("grade");
		String img = request.getParameter("grade");
		String gDate = request.getParameter("gDate");
		String company = request.getParameter("company");
		String job = request.getParameter("job");
		String career = request.getParameter("career");
		String part = request.getParameter("part");

		if (id == null || id.trim().length() == 0 || pw == null
				|| pw.trim().length() == 0 || name == null
				|| name.trim().length() == 0 || mobile == null
				|| mobile.trim().length() == 0 || email == null
				|| email.trim().length() == 0 || gender == null
				|| major == null) {
			request.setAttribute("message", "������ ����� �Է��� �ּ���");
			request.getRequestDispatcher("loginError.jsp").forward(request,
					response);
			System.out.println("aaaa");
		} else {
			// Model ��û�Ƿ�
			Student dto = new Student(id, birth, name, mobile, email, gender,
					birth, major, division, grade, img, gDate, company, job,
					career, part);
			int insert = studentService.StudentInsert(dto);
			System.out.println(insert);
			// ��û����޾Ƽ� �������� ����
			if (insert != 0) {
				// �����������̵�:����
				request.setAttribute("insert", insert);
				request.getRequestDispatcher("index.jsp").forward(request,
						response);
			} else {
				// �����������̵�:����
				// �α��� ����-> HttpSession ���� ���� ����
				StringBuilder error = new StringBuilder();
				error.append("���� ������ �ٽ� Ȯ�ιٶ��ϴ�");
				error.append("<br>");
				error.append("ȸ�� ��� ������ �߸��Է��ϼ̽��ϴ�.");

				request.setAttribute("message", "ȸ������ ������ �������մϴ�.");
				request.getRequestDispatcher("loginError.jsp").forward(request,
						response);
			}
			// �����������̵�: ����, ����, ��Ÿ
		}
	}
	
	

	/**
	 * ���̵� �ߺ� ��û ���� �޼��� : ajax �񵿱� ��û
	 * 
	 * --��û������ ���� : ���̵�, ���䵥���� Ÿ�� ���� ���� --��û������ ���� --�𵨿��� ���̵� �ߺ����� ��û �Ƿ� --��û
	 * ����� ���� ������ ����
	 * 
	 * ##id ���� ������ 1. ���̵� ���Է� : required 2. ��밡�� : false 3. �ߺ� : true 4. ���Ұ� :
	 * deny
	 * */
	protected void idCheck(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String responseDataType = request.getParameter("responseDataType");

		switch (responseDataType) {
	
		case "json":
			responseJson(request, response);
			break;

		default:
			request.setAttribute("message", "�������� �ʴ� ���� ������ �����Դϴ�.");
			request.getRequestDispatcher("error.jsp")
					.forward(request, response);
		}
	}

	
	
	/**
	 * idCheck ���� ������ : json ���� ó�� �޼��� json : {"valid","true"}
	 */
	protected void responseJson(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// ��û ������ ���̵� ��������
		String id = request.getParameter("id");

		PrintWriter out = response.getWriter();
		response.setContentType("text/plain");
		response.setHeader("Cache-Control", "no-cache");

		if (id != null && id.trim().length() > 0) {
			
			if (studentService.isUser(id)) {
				out.write("{'valid':'true'}");
			} else {
				out.write("{'valid':'false'}");
			}

		} else {
			out.write("{'valid':'required'}");
		}
	}

	/**
	 * get, post ��û�� ó���ϴ� ���� �޼ҵ�
	 * 
	 * @throws IOException
	 * @throws ServletException
	 */
	protected void process(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// ��û �ľ� : ��û�����Ϳ��� ��û�� ���� key ������ ��������
		String action = request.getParameter("action");
		System.out.println(action);
		if (action != null) {
			switch (action) {

			case "join":
				join(request, response);
				break;

			default:
				break;
			// �������� �ʴ� ��û ����

			}

		} else {
			// �߸��� ��û��� ���� ������ �̵�
		}

	}

	public FrontController() {

	}

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		process(request, response);
		
		String action = request.getParameter("action");
		if (action != null) {
			switch (action) {
			case "idCheck":
				idCheck(request, response);
				break;

			}
		} else {
			request.setAttribute("message", "�ùٸ��� ���� ��û�Դϴ�.");
			request.getRequestDispatcher("error.jsp")
					.forward(request, response);
		}
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("euc-kr");
		process(request, response);
	}

}
