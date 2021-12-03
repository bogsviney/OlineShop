package com.nazarov.servlets;
import com.nazarov.templater.PageGenerator;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;

public class RemoveProductServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse response) throws ServletException, IOException {
        PageGenerator instance = PageGenerator.instance();
        String page = instance.getPage("removeproduct.html", new HashMap<>());
        response.getWriter().println(page);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse response) throws ServletException, IOException {

        int id = Integer.parseInt(req.getParameter("id"));
        System.out.println("REMOVE PRODUCT WITH ID " + id);
        response.getWriter().println("PRODUCT WAS DELETED");
    }


}
