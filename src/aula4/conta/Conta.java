package aula4.conta;

public class Conta {
    private double saldo;

    public Conta(double valor){
        this.saldo = valor;
    }
    
    public void depositar(double valor){
        this.saldo += valor;
    }

    public void sacar(double valor){
        this.saldo -= valor;
    }

    public double getSaldo(){
        return saldo;
    }
}