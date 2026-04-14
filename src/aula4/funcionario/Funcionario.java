package aula4.funcionario;

public class Funcionario {
    private double salario;
    private String nome;

    public Funcionario(double s, String n){
        this.salario = s;
        this.nome = n;
    }

    public void setNome(String n){
        this.nome = n;
    }

    public String getNome(){
        return nome;
    }

    public void setSalario(double s){
        this.salario = s;
    }

    public double getSalario(){
        return salario;
    }

    public double calcularIR(){
        return salario*0.15;
    }

    public double calcularINSS(){
        return salario*0.10;
    }

    public double calcularSalarioFinal(){
        return salario - (calcularINSS()+calcularIR());
    }
}