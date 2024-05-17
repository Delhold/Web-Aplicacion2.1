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
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    resp.setContentType("text/html");
    PrintWriter out = resp.getWriter();
    String Nombre=req.getParameter("Nombre");
    String Apellido=req.getParameter("Apellido");
    int Edad= Integer.parseInt(req.getParameter("Edad"));
    String Programas =req.getParameter("Programas");
    String Curso=req.getParameter("Curso");
    String Genero=req.getParameter("Genero");
    String Descripcion=req.getParameter("Descripcion");

    //vamos a enviar una respuesta al Cliente
    out.println("<!DOCTYPE html>");
    out.println("<html>");
    out.println("<head>");
    out.println("<title>Formulario</title>");
      // Incluir Bootstrap CSS -->
    out.print("<link href='https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css' rel='stylesheet'>");
    // Incluir jQuery -->
    out.print("<script src='https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js'></script>");
    out.println("</head>");
    out.println("<body>");
    out.println("<div class='container'>");
    out.println("<h1>Formulario :</h1>");
    out.println("<h2>Nombre:"+ Nombre + "</h2>");
    out.println("<h2>Apellido:"+ Apellido + "</h2>");
    out.println("<h2>Edad:"+ Edad + "</h2>");
    out.println("<h2>Lenguaje de Programacion:"+ Programas + "</h2>");
    out.println("<h2>Curso:"+ Curso + "</h2>");
    out.println("<h2>Descripcion:"+ Descripcion + "</h2>");
    out.println("<h2>Genero:"+ Genero + "</h2>");
    out.println("</div>");
    out.println("</body>");
    out.print("</html>");
}
}
