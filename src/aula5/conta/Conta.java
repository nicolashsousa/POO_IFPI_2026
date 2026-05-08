package aula5.conta;

public class Conta {
    private static int ultimo = 0;
    private final int numeroDaConta;
    private double saldo;

    /**
     * Construtor que inicia a conta com saldo 0.
     * Número da conta é o sucessor do último cadastrado(1 em diante).
     */
    public Conta(){
        this.numeroDaConta = Conta.ultimo + 1;
        Conta.ultimo = this.numeroDaConta;
        this.saldo = 0;
    }

    /**
     * Adicionar um valor, passado como parametro, ao saldo da conta.
     * @param valor Valor a ser depositado.
     */
    public void depositar(double valor){
        this.saldo += valor;
    }
    /**
     * Sacar um valor, passado como parametro, do saldo da conta.
     * @param valor Valor a ser sacado.
     */
    public void sacar(double valor){
        this.saldo -= valor;
    }

    /**
     *
     * @return Retorna o número da conta.
     */
    public int getNumero(){
        return this.numeroDaConta;
    }

    /**
     *
     * @return Retorna o saldo da conta.
     */
    public double getSaldo(){
        return this.saldo;
    }
}