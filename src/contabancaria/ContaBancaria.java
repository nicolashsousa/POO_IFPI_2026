package contabancaria;

public class ContaBancaria {
    private String titular;
    private int numeroConta;
    private double saldo;

    public ContaBancaria(String t, int n){
        this.titular = t;
        this.numeroConta = n;
        this.saldo = 0.0;
    }

    public void setTitular(String t){
        this.titular = t;
    }

    public String getTitular(){
        return this.titular;
    }

    public int getNumeroConta(){
        return this.numeroConta;
    }

    public double getSaldo(){
        return this.saldo;
    }

    public void depositar(double valor){
        if (valor > 0) {
            this.saldo += valor;
        } else {
            System.out.println("Erro: O valor do depósito deve ser positivo.");
        }
    }

    public void sacar(double valor){
        if (valor > 0 && valor <= this.saldo) {
            this.saldo -= valor;
        } else {
            System.out.println("Erro: Saldo insuficiente ou valor inválido para saque.");
        }
    }

    @Override
    public String toString(){
        return "Nome: "+this.titular+"\n"+"Número da Conta: "+this.numeroConta+"\n"+
        "Saldo: "+this.saldo;
    }
}