package org.dario.servlet.demo;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/servlet")

public class servlet  extends HttpServlet {
    //indicamos el metodo a utilizar en el servlet
    //Enviamos los DATOS mediante un LINK utilizamos el
    //METODO get si mandamos informacion por medio de botones a la red etiquetas a
    //METODO post por si mandamos iformacion pro medio de un formulario
    @Override
    protected void doGet(HttpServletRequest peticion, HttpServletResponse respuesta) {

    }
}
