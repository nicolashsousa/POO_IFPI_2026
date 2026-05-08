package aula3.Questao8;

public class FuncionarioHorista {
    private double valorHora,horasTrabalhadas,aliquota;

    /**
     *
     * @param vH Valor da hora de trabalho.
     */
    public void setValorHora(double vH){
        this.valorHora = vH;
    }

    /**
     *
     * @return Retorna o valor da hora de trabalho.
     */
    public double getValorHora(){
        return this.valorHora;
    }

    /**
     *
     * @param hT Número de horas trabalhadas no mês.
     */
    public void setHorasTrabalhadas(double hT){
        this.horasTrabalhadas = hT;
    }

    /**
     *
     * @return Retorna o número de horas trabalhadas no mês.
     */
    public double getHorasTrabalhadas(){
        return this.horasTrabalhadas;
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
     * @return Retorna o valor da alíquota.
     */
    public double getAliquota(){
        return this.aliquota;
    }

    /**
     * SalárioBruto = horasTrabalhadas * valorHora.
     * @return Retorna salário bruto.
     */
    public double calcularSalarioBruto(){
        return this.horasTrabalhadas*this.valorHora;
    }

    /**
     * Imposto = SalárioBruto * (aliquota*100).
     * @return Retorna o imposto.
     */
    public double calcularImposto(){
        return calcularSalarioBruto()*(this.aliquota/100);
    }

    /**
     * SalárioLíquido = SalárioBruto - imposto.
     * @return Retorna o salário líquido.
     */
    public double calcularSalarioLiquido(){
        return calcularSalarioBruto()-calcularImposto();
    }
}