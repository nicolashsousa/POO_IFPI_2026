package aula3.Questao6;

public class Funcionario {
    private double salario,aliquota;

    public void setSalario(double s){
        this.salario = s;
    }

    public double getSalario(){
        return this.salario;
    }

    public void setAliquota(double a){
        this.aliquota = a;
    }

    public double getAliquota(){
        return this.aliquota;
    }

    public double calcularImposto(){
        return this.salario * (this.aliquota/100);
    }

    public double calcularSalarioFinal(){
        return this.salario - calcularImposto();
    }
}