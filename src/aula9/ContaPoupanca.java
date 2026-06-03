package aula9;

/**
 * Classe ContaPoupanca que herda da classe Conta.
 */
public class ContaPoupanca extends Conta{
    private final double indiceRendimento;

    /**
     * Construtor da classe ContaPoupanca.
     * @param numero O número da conta.
     * @param saldo O saldo inicial da conta.
     * @param indice O índice de rendimento da conta.
     */
    public ContaPoupanca(int numero, double saldo, double indice){
        super(numero, saldo);
        this.indiceRendimento = indice;
    }

    /**
     * Método render() que acrescenta o rendimento mensal da poupança no saldo.
     */
    public void render(){
        double valor = getSaldo() * indiceRendimento;
        depositar(valor);
    }

    @Override
    public String toString(){
        return super.toString() + "Índice de rendimento: " + indiceRendimento + "\n";
    }
}