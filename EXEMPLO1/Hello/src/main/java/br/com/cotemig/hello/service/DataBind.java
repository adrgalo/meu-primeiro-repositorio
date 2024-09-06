package br.com.cotemig.hello.service;

import br.com.cotemig.hello.model.Curriculo;
import br.com.cotemig.hello.model.Experiencia;
import br.com.cotemig.hello.model.Formacao;
import jakarta.servlet.http.HttpServletRequest;

public class DataBind {

    public Curriculo bind(HttpServletRequest req){

        Formacao formacao = new Formacao(
                req.getParameter("formacao1-instiuicao"),
                req.getParameter("formacao1-curso"),
                Integer.parseInt(req.getParameter("formacao1-carga-horaria"))
        );

        Experiencia experiencia = new Experiencia(
                req.getParameter("experiencia1-empresa"),
                req.getParameter("experiencia1-cargo"),
                req.getParameter("experiencia1-nivel"),
                req.getParameter("experiencia1-descricao")
        );

        Curriculo curriculo = new Curriculo(
                req.getParameter("nome"),
                req.getParameter("sexo"),
                req.getParameter("email"),
                req.getParameter("telphone"),
                req.getParameter("lnkedin"),
                formacao,
                experiencia
        );

        if (!req.getParameter("formacao2-instituicao").equals("")){
            formacao = new Formacao(
                    req.getParameter("formacao2-instituicao"),
                    req.getParameter("formacao2-curso"),
                    Integer.parseInt(req.getParameter("formacao2-carga-horaria"))
            );
            curriculo.addFormcacao(formacao);
        }

        if (!req.getParameter("experiencia2-empresa").equals("")){
            experiencia = new Experiencia(
                    req.getParameter("experiencia2-empresa"),
                    req.getParameter("experiencia2-cargo"),
                    req.getParameter("experiencia2-nivel"),
                    req.getParameter("experienci2-descricao")
            );
            curriculo.addExperiencia(experiencia);
        }

        return curriculo;
    }
}
