package aula3.Questao8;

public class FuncionarioHorista {
    private double valorHora,horasTrabalhadas,aliquota;

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

    public void setAliquota(double a){
        this.aliquota = a;
    }

    public double getAliquota(){
        return this.aliquota;
    }

    public double calcularSalarioBruto(){
        return this.horasTrabalhadas*this.valorHora;
    }

    public double calcularImposto(){
        return calcularSalarioBruto()*(this.aliquota/100);
    }

    public double calcularSalarioLiquido(){
        return calcularSalarioBruto()-calcularImposto();
    }
}