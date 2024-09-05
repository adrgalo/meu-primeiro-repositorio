package br.com.cotemig.convert.model;

public class IRRF {

    private double irrf;

    public IRRF() {
        this.irrf = irrf;
    }

    public double getIrrf() {
        return irrf;
    }

    public void setIrrf(double irrf) {
        this.irrf = irrf;
    }

    public double calculoIrrf(double salario){

        this.irrf = 0.00;

        if (salario >= 2259.21 && salario <= 2826.65){

            this.irrf = salario * 0.075;
        }

        else if (salario >= 2826.66 && salario <= 3751.05){
            this.irrf = salario * 0.15;
        }

        else if (salario >= 3751.06 && salario <= 4664.68){
            this.irrf = salario * 0.225;
        }

        else if (salario >= 4664.69){
            this.irrf = salario * 0.275;
        }

        return irrf;
    }
}
