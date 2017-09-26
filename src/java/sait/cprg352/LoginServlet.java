/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sait.cprg352;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import sait.services.User;


/**
 *
 * @author 733196
 */
@WebServlet(name = "LogingServlet", urlPatterns = {"/LogingServlet"})
public class LoginServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        
        getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String userName = request.getParameter("username");
        String password = request.getParameter("password");

        if (userName == null || userName.isEmpty() || password == null || password.isEmpty()) {
            request.setAttribute("errorMessage", "Please enter both value.");
            getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
            return;
        }
        User user = new User(userName,password);
        boolean isValid = user.loging();

        if (!isValid) {
            request.setAttribute("errorMessage", "User name or Password is invalid!");
            request.setAttribute("userName", userName);
            request.setAttribute("password", password);
            getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
            return;
        }

        request.setAttribute("username", userName);
        getServletContext().getRequestDispatcher("/WEB-INF/mainPage.jsp").forward(request, response);
    }

}
