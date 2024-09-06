package br.com.cotemig.hello.controller;

import br.com.cotemig.hello.model.Curriculo;
import br.com.cotemig.hello.model.Experiencia;
import br.com.cotemig.hello.model.Formacao;
import br.com.cotemig.hello.service.ConvertXML;
import br.com.cotemig.hello.service.DataBind;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/hello")
public class HelloController extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        Curriculo curriculo = new DataBind().bind(req);
        String xml = new ConvertXML().toXML(curriculo);

        resp.setHeader("Content-Type", "application/xml");
        var out = resp.getWriter();
        out.println(xml);
    }

}
