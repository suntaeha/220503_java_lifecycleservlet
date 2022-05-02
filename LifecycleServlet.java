package exam;

import java.io.IOException;
import java.io.PrintWriter;	//36, 51번 줄의 PrintWriter 부분에서 빨간 밑줄과 오류 >> 4번 줄 추가하여 오류 해결
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LifecycleServlet
 */
public class LifecycleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public LifecycleServlet() {
        System.out.println("LifecycleServlet 생성~~!");
    }

	
	public void init(ServletConfig config) throws ServletException {
		System.out.println("init 호출~!");
	}

	
	public void destroy() {
		System.out.println("destroy 호출~!");
	}


	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();	//36, 51번 줄의 PrintWriter 부분에서 빨간 밑줄과 오류 >> 4번 줄 추가하여 오류 해결
		out.println("<html>");
		out.println("<head><title>form</title></head>");
		out.println("<body>");
		out.println("<form method='post' action='/exam25/LifecycleServlet'>");
		out.println("name : <input type='text' name='name'><br>");
		out.println("<input type='submit' value='ok'><br>");                                                 
		out.println("</form>");
		out.println("</body>");
		out.println("</html>");
		out.close();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();	//36, 51번 줄의 PrintWriter 부분에서 빨간 밑줄과 오류 >> 4번 줄 추가하여 오류 해결
		String name = request.getParameter("name");
		out.println("<h1> hello " + name + "</h1>");
		out.close();
	}

	
//	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		System.out.println("service 호출~!");
//	}

}
