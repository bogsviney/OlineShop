package com.nazarov.main;

//import com.study.lab1.servlets.AddProductServlet;
//import com.study.lab1.servlets.AllRequestsServlet;
//import com.study.lab1.servlets.RemoveProductServlet;
import com.nazarov.servlets.AddProductServlet;
import com.nazarov.servlets.RemoveProductServlet;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;

public class Main {
    public static void main(String[] args) throws Exception {

//        AllRequestsServlet allRequestsServlet = new AllRequestsServlet();

        ServletContextHandler context = new ServletContextHandler(ServletContextHandler.SESSIONS);

        context.addServlet(new ServletHolder(new AddProductServlet()), "/product/add");
        context.addServlet(new ServletHolder(new RemoveProductServlet()), "/product/remove");
//        context.addServlet(new ServletHolder(allRequestsServlet), "/*");

        Server server = new Server(8080);   //а вдокере  5435   чокак теперь?
        server.setHandler(context);

        server.start();
    }
}
