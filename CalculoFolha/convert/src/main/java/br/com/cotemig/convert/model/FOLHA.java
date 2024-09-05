package br.com.cotemig.convert.model;

import java.math.BigDecimal;
import java.text.DecimalFormat;

public class FOLHA {

    private double salario;

    public FOLHA() {
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double calculoFolha(double salario) {

        INSS inss = new INSS();
        double valorInss = inss.calculoInss(salario);
        IRRF irrf = new IRRF();
        double valorIrrf = irrf.calculoIrrf(salario);
        double salarioLiquido = salario - valorInss - valorIrrf;

        return salarioLiquido;
    }
}
