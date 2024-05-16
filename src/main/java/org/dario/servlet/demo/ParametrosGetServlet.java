package org.dario.servlet.demo;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/ServletParametros")
public class ParametrosGetServlet extends HttpServlet {
@Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    resp.setContentType("text/html");
    PrintWriter out = resp.getWriter();
    String Nombre=req.getParameter("Nombre");
    String Apellido=req.getParameter("Apellido");
    int Edad= Integer.parseInt(req.getParameter("Edad"));
    //vamos a enviar una respuesta al Cliente
    out.println("<html><body>");
    out.println("<h2>Nombre:"+ Nombre + "</h2>");
    out.println("<h2>Apellido:"+ Apellido + "</h2>");
    out.println("<h2>Edad:"+ Edad + "</h2>");
    out.println("</body></html>");
}
}
