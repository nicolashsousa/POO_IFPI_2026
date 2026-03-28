package aula3.Questao7;

public class FuncionarioHorista {
    private double valorHora,horasTrabalhadas;

    public void setValorHora(double vH){
        this.valorHora = vH;
    }

    public double getValorHora(){
        return this.valorHora;
    }

    public void setHorasTrabalhadas(double hT){
        this.horasTrabalhadas = hT;
    }

    public double getHorasTrabalhadas(){
        return this.horasTrabalhadas;
    }

    public double calcularSalarioBruto(){
        return this.horasTrabalhadas*this.valorHora;
    }
}