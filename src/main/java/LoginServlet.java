import org.apache.taglibs.standard.lang.jstl.NullLiteral;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "LoginServlet", urlPatterns = "/login")
public class LoginServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        if(request.getSession().getAttribute("user") != null) {
            response.sendRedirect("/profile");
            return;
        }
        request.getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
       // trying to initiate a session, by calling user? not sure if right but hey still trying.
        //OLD WAY OF DOING THINGGS USE FOR REFERENCE
        //this checks parameters that parameters being entered into are equal
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        boolean validAttempt = username.equals("admin") && password.equals("password");

        if (validAttempt) {
            //quick saving under title user == user is the key.
            request.getSession().setAttribute("user", username);
            response.sendRedirect("/profile");
        } else {
            //do not set session client cannot try again if in else statement
            response.sendRedirect("/login");
        }
    }
}
