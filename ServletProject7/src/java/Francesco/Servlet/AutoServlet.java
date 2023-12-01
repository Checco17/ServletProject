package Francesco.Servlet;
import java.util.*;
import Francesco.Model.*;
import Francesco.CRUD.*;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Cookie;

/**
 * Servlet implementation class AutoServlet
 */
@WebServlet("/AutoServlet")
public class AutoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AutoServlet() {
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
		String contextPath = request.getContextPath();
		String op = request.getParameter("op");
		if(op!=null && op.equals("logout")) {			
			Cookie[] cookies = request.getCookies();
			if(cookies!=null) {
				for(Cookie c : cookies) {
					if(c.getName().equals("email_utente")) {
						c.setMaxAge(0);
						c.setValue("");
					    response.addCookie(c);
					}
				}
				
			}
			request.getSession().invalidate();
			response.sendRedirect(contextPath+"/AutoServlet");
			
			
			return;
			
		}
		if(op==null) {
			Utente user = null;
			Cookie[] cookies = request.getCookies();
			UtenteCRUD crud = UtenteCRUD.getInstance();
			ArrayList<Utente> utenti = crud.select();
			if(cookies!=null) {
				for(Cookie c : cookies) {
					if(c.getName().equals("email_utente") && c.getValue()!=null && !c.getValue().equals("")) {
						user = new Utente();
						for(Utente u : utenti) {
							if(u.getEmail().equalsIgnoreCase(c.getValue()))
								user = u;
						}
						
						
					}
				}
				
			}
			if(user!=null) {
				request.getSession().setAttribute("user", user);
				request.getRequestDispatcher("/welcome.jsp").include(request, response);
				return;
			}
		}
		
		if(op==null || op.equals("AutoServlet")) {
			request.getRequestDispatcher("/login.jsp").include(request, response);
			return;
		}
		
		request.getRequestDispatcher("/welcome.jsp").include(request, response);
		

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		String op = request.getParameter("op");
		String contextPath = request.getContextPath();
		AutoCRUD crud = AutoCRUD.getInstance();
		UtenteCRUD crud1 = UtenteCRUD.getInstance();

		if (op.equalsIgnoreCase("add")) {
			Auto a = new Auto();
			a.setTarga(request.getParameter("targa"));
			a.setProprietario(request.getParameter("proprietario"));
			crud.insert(a);
			response.sendRedirect("welcome.jsp");
		} else if (op.equalsIgnoreCase("delete")) {
			Auto a = new Auto();
			a.setTarga(request.getParameter("targa"));
			a.setProprietario(request.getParameter("proprietario"));
			crud.delete(a.getTarga());
			response.sendRedirect("welcome.jsp");
		} else if (op.equalsIgnoreCase("update")) {
			Auto a = new Auto();
			a.setTarga(request.getParameter("targa"));
			a.setProprietario(request.getParameter("proprietario"));
			crud.update(a);
			response.sendRedirect("welcome.jsp");
		} else if (op.equalsIgnoreCase("login")) {
			String email = request.getParameter("email");
			String password = request.getParameter("password");
			ArrayList<Utente> listaUtenti = crud1.select();
			for (Utente u : listaUtenti) {
				if (email.equalsIgnoreCase(u.getEmail()) && password.equalsIgnoreCase(u.getPassword())) {
					Cookie cookie = new Cookie("email_utente", u.getEmail());
					cookie.setMaxAge(300);// 5 min
					response.addCookie(cookie);
					request.getSession().setAttribute("user", u);
					response.sendRedirect(contextPath+"/welcome.jsp");
					return;
				}
			}
		} else if (op.equalsIgnoreCase("insertUtente")) {
			String password = request.getParameter("password");
			String confermaPassword = request.getParameter("confermaPassword");
			if (password.equalsIgnoreCase(confermaPassword)) {
				Utente utente = new Utente(request.getParameter("email"), request.getParameter("password"));
				crud1.insert(utente);
				response.sendRedirect("login.jsp");
			} else
				response.sendRedirect("register.jsp");

		} 
		
		

	}

}
