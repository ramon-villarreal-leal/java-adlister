import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

//url do not have
@WebServlet("/ads")
public class AdsServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        System.out.println("hello test");
        request.setAttribute("allAds", DaoFactory.getAdsDao().all());

        // here is what you show what jsp you want to show
        request.getRequestDispatcher("/ads/index.jsp").forward(request, response);
    }
}
