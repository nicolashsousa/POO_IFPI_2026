package aula3.conta;

public class Conta {
    private String titular;
    private double saldo;
    /**
     *
     * @param valor Valor a ser depositado.
     */
    public void depositar(double valor){
        saldo += valor;
    }

    /**
     *
     * @param valor Valor a ser sacado.
     */
    public void sacar(double valor){
        saldo -= valor;
    }

    /**
     *
     * @return Retorna o saldo atual.
     */
    public double getSaldo(){
        return saldo;
    }

    /**
     *
     * @param nome Nome a ser cadastrado.
     */
    public void setTitular(String nome){
        this.titular = nome;
    }

    /**
     *
     * @return Retorna o titular da conta.
     */
    public String getTitular(){
        return titular;
    }
}