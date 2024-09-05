package br.com.cotemig.convert;

import br.com.cotemig.convert.model.FOLHA;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/processar_salario")
public class processar_salario extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        double salario = Double.parseDouble(req.getParameter("salario_bruto"));
        FOLHA folha = new FOLHA();
        double folhaCalculada = folha.calculoFolha(salario);
        resp.setHeader("Content-type", "text/html");
        var out = resp.getWriter();
        out.println("<!DOCTYPE html>");
        out.println("<html lang='pt-BR'>");
        out.println("<header>");
        out.println("<meta charset='UTF-8'>");
        out.println("<meta name='viewport' content='width=device-width, initial-scale=1.0'>");
        out.println("<title>Resultado do Cálculo de Salário</title>");
        out.println("<style>");
        out.println("body { font-family: Arial, sans-serif; background-color: #f4f4f4; display: flex; justify-content: center; align-items: center; height: 100vh; margin: 0; }");
        out.println(".resultado-container { background-color: #fff; padding: 20px; border-radius: 8px; box-shadow: 0 2px 10px rgba(0, 0, 0, 0.1); max-width: 400px; width: 100%; }");
        out.println(".resultado-container h2 { text-align: center; margin-bottom: 20px; color: #333; }");
        out.println(".resultado { margin-top: 20px; text-align: center; font-size: 20px; color: #007bff; }");
        out.println("</style>");
        out.println("</header>");
        out.println("<body>");
        out.println("<div class='resultado-container'>");
        out.println("<h2>Resultado do Cálculo</h2>");
        out.println("<p>Salário Bruto: R$ " + String.format("%.2f", salario) + "</p>");
        out.println("<p class='resultado'>Salário Líquido: R$ " + String.format("%.2f", folhaCalculada) + "</p>");
        out.println("</div>");
        out.println("</body>");
        out.println("</html>");
    }
}
