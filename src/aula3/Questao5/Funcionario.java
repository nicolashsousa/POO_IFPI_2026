package aula3.Questao5;

public class Funcionario {
    private double salario,aliquota;

    /**
     *
     * @param s Valor do salário em reais.
     */
    public void setSalario(double s){
        this.salario = s;
    }

    /**
     *
     * @return Retorna o salário.
     */
    public double getSalario(){
        return this.salario;
    }

    /**
     *
     * @param a Valor da alíquota.
     */
    public void setAliquota(double a){
        this.aliquota = a;
    }

    /**
     *
     * @return Retorna a alíquota.
     */
    public double getAliquota(){
        return this.aliquota;
    }

    /**
     * Imposto = Salário * (aliquota/100).
     * @return Retorna o valor do Imposto.
     */
    public double calcularImposto(){
        return this.salario * (this.aliquota/100);
    }
}
