package contabancaria;

public class ContaBancaria {
    private String titular;
    private final int numeroConta;
    private double saldo;

    /**
     *
     * @param t Titular a ser cadastrado.
     * @param n Número da conta.
     */
    public ContaBancaria(String t, int n){
        this.titular = t;
        this.numeroConta = n;
        this.saldo = 0.0;
    }

    /**
     *
     * @param t Titular a ser cadastrado.
     */
    public void setTitular(String t){
        this.titular = t;
    }

    /**
     *
     * @return Retorna o titular da conta.
     */
    public String getTitular(){
        return this.titular;
    }

    /**
     *
     * @return Retorna o número da conta.
     */
    public int getNumeroConta(){
        return this.numeroConta;
    }

    /**
     *
     *
     * @return Retorna o saldo da conta.
     */
    public double getSaldo(){
        return this.saldo;
    }

    /**
     *
     * @param valor Valor a ser depositado.
     */
    public void depositar(double valor){
        if (valor > 0) {
            this.saldo += valor;
        } else {
            System.out.println("Erro: O valor do depósito deve ser positivo.");
        }
    }

    /**
     *
     * @param valor Valor a ser sacado.
     */
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