package aula9;

/**
 * Classe base para ContaCorrente e ContaPoupanca.
 */
public class Conta {
    private final int numero;
    private double saldo;

    /**
     * Construtor da classe Conta.
     * @param numero O número da conta.
     * @param saldo O saldo inicial da conta.
     */
    public Conta(int numero, double saldo){
        this.numero = numero;
        this.saldo = saldo;
    }

    /**
     * Método para alterar o saldo da conta.
     * @param valor O novo saldo da conta.
     */
    public void setSaldo(double valor){
        this.saldo = valor;
    }

    /**
     * Método para obter o saldo da conta.
     * @return O saldo da conta.
     */
    public double getSaldo(){
        return saldo;
    }

    /**
     * Método para depositar um valor na conta.
     * @param valor Valor a ser depositado.
     */
    public void depositar(double valor){
        this.saldo += valor;
    }

    /**
     * Método para sacar um valor da conta.
     * @param valor Valor a ser sacado.
     */
    public void sacar(double valor){
        this.saldo -= valor;
    }

    /**
     * O método toString retorna uma 'String' formatada com os dados da conta.
     * @return 'String' formatada com os dados da conta.
     */
    @Override
    public String toString(){
        return "Conta: " + numero + "\nSaldo: " + saldo + "\n";
    }
}