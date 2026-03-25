package Aula_3;

public class Conta {
    private String titular;
    private double saldo;

    public void depositar(double valor){
        saldo += valor;
    }

    public void sacar(double valor){
        saldo-=valor;
    }

    public double getSaldo(){
        return saldo;
    }

    public void setTitular(String nome){
        this.titular = nome;
    }

    public String getTitular(){
        return titular;
    }
}