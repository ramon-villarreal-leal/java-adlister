package com.codeup.adlister.controllers;

import com.codeup.adlister.dao.DaoFactory;
import com.codeup.adlister.models.User;

import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "controllers.RegisterServlet", urlPatterns = "/register")
public class RegisterServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        // TODO: show the registration form
        request.getRequestDispatcher("/WEB-INF/register.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        // TODO: ensure the submitted information is valid

        //===========CHECKING IF INFORMATION IS VALID GRABBING IT==================
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String email = request.getParameter("email");
        //==========IF ANY FORM IS EMPTY WHEN SUBMITTED I WILL REDIRECT TO REGISTER AGAIN =====/
        if(username.isEmpty() || password.isEmpty() || email.isEmpty()){
            response.sendRedirect("/register");
        }
        // TODO: create a new user based off of the submitted information
        //========MORE STREAMLINED WAY OF DOING THINGS==========
        User thisUser = new User(username,email,password);

        //============SETTING A USERNAME BASED ON SUBMITTED INFORMATION===========
//        thisUser.setUsername(request.getParameter("username"));
//        thisUser.setPassword(request.getParameter("password"));
//        thisUser.setEmail(request.getParameter("email"));

        // TODO: if a user was successfully created, send them to their profile
//        Long userId = DaoFactory.getUsersDao().insert(thisUser);
//        thisUser.setId(userId);
//        expecting user object setAttribute is
        //====== saving user======////
        DaoFactory.getUsersDao().insert(thisUser);
        //======settting attribute of user to new user object  created "user" is a variable call it whatever you want=======////
        //========ACTUAL USER OBJECT IS "thisUSer"====/
        request.getSession().setAttribute("user", thisUser);
        response.sendRedirect("/profile");
    }
}
