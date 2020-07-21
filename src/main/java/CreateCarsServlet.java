import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "CreateCarServlet", urlPatterns = "/create")
public class CreateCarsServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        request.getRequestDispatcher("/WEB-INF/cars/create.jsp").forward(request,response);

    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws IOException {
        String make = request.getParameter("make");
        String model = request.getParameter("model");
        String yearString = request.getParameter("year");
        int year = 9999;
        try{
            year = Integer.parseInt(yearString);
        } catch(Exception e){
            e.printStackTrace();
        }
        //We have

        HttpSession session = request.getSession();


        Car addcar = new Car(5, make, model, year);

        session.setAttribute("extracar", addcar);
        response.sendRedirect("/cars");


    }
}