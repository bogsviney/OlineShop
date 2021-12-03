package com.nazarov.servlets;

import com.nazarov.templater.PageGenerator;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;

public class AddProductServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse response) throws ServletException, IOException {
        PageGenerator instance = PageGenerator.instance();
        String page = instance.getPage("addproduct.html", new HashMap<>());
        response.getWriter().println(page);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse response) throws ServletException, IOException {
        String name = req.getParameter("name");
        double price = Double.parseDouble(req.getParameter("price"));
        System.out.println("Add product " + name + "-->" + price);
        response.getWriter().println("PRODUCT WAS ADDED");
    }
}
