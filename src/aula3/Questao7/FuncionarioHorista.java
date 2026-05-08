package aula3.Questao7;

public class FuncionarioHorista {
    private double valorHora,horasTrabalhadas;

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
     * salárioBruto = horasTrabalhadas * valorHora.
     * @return Retorna salário bruto.
     */
    public double calcularSalarioBruto(){
        return this.horasTrabalhadas*this.valorHora;
    }
}