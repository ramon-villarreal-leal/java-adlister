import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet (name = "CountServlet", urlPatterns = "/count")
public class CountServlet extends HttpServlet {
    private int counter = 0;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
        throws IOException {
        response.setContentType("text/html");
        counter += 1;
        response.getWriter().println("<h1>The count is " + counter + ".</h1>");
    }

}
