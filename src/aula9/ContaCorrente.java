package aula9;

/**
 * Classe ContaCorrente que herda da classe Conta.
 */
public class ContaCorrente extends Conta{
    private final double taxaDeManutencao;

    /**
     * Construtor da classe ContaCorrente.
     * @param numero Numero da conta.
     * @param saldo Saldo inicial da conta.
     * @param taxa Taxa de manutenção da conta.
     */
    public ContaCorrente(int numero, double saldo, double taxa){
        super(numero, saldo);
        this.taxaDeManutencao = taxa;
    }

    /**
     * Método cobrarTaxa() que decrementa a taxa de manutenção do saldo.
     */
    public void cobrarTaxa(){
        double novoSaldo = getSaldo() - taxaDeManutencao;
        setSaldo(novoSaldo);
    }

    /**
     * O método toString retorna uma 'String' formatada com os dados da conta.
     * @return 'String' formatada com os dados da conta.
     */
    @Override
    public String toString(){
        return super.toString() + "Taxa de manutenção: " + taxaDeManutencao + "\n";
    }
}