package com.iris.servlets;

import java.io.IOException;
import java.net.URLEncoder;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/RedirectServlet")
public class RedirectServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String query = request.getParameter("query");

        if (query != null && !query.isEmpty()) {
            String encodedQuery = URLEncoder.encode(query, "UTF-8");
            response.sendRedirect("https://www.google.com/search?q=" + encodedQuery);
        } else {
            response.getWriter().println("Query is empty!");
        }
    }
}
