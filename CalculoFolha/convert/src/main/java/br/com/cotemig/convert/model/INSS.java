package br.com.cotemig.convert.model;

public class INSS {

    private double inss;

    public INSS() {
        this.inss = inss;
    }

    public double getInss() {
        return inss;
    }

    public void setInss(double inss) {
        this.inss = inss;
    }

    public double calculoInss(double salario){


        if (salario <= 1412.00){

            this.inss = salario * 0.075;
        }

        else if (salario >= 1412.01 && salario <= 2666.68){
            this.inss = salario * 0.09 - 21.18;
        }

        else if (salario >= 2666.69 && salario <= 4000.03){
            this.inss = salario * 0.12 - 101.18;
        }

        else if (salario >= 4000.03 && salario <= 7786.02){
            this.inss = salario * 0.14 - 181.18;
        }

        else if (salario >= 7786.03){
            this.inss = 908.85;
        }

        return inss;
    }
}
