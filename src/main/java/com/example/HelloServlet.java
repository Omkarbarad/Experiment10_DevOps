package com.example;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/hello")
public class HelloServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head><title>DevOps App</title></head>");
        out.println("<body style='font-family:sans-serif; text-align:center; margin-top:100px'>");
        out.println("<h1>Hello from DevOps Pipeline!</h1>");
        out.println("<p>Built with: Git + GitHub + Maven + Jenkins + TestNG + Docker</p>");
        out.println("<p>Student: Omkar Barad | Experiment No: 10</p>");
        out.println("<p style='color:green'>Application deployed successfully!</p>");
        out.println("</body>");
        out.println("</html>");
    }
}