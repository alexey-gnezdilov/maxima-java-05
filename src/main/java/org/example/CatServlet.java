package org.example;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/cat")
public class CatServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

        String name = request.getParameter("name");
        String weight = request.getParameter("weight");
        String isAngry = request.getParameter("isAngry");

        response.setContentType("text/html; charset=UTF-8");

        PrintWriter writer = response.getWriter();
        writer.write(String.format("<h1>Cat information:</h1><h2>Name is %s</h2><h2>Cat's weight is %s kg</h2><h2>Is angry: %s</h2>", name, weight, isAngry));
        writer.close();
    }
}
