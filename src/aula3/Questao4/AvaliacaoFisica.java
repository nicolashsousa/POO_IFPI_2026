package aula3.Questao4;

public class AvaliacaoFisica {
    private double altura, peso;

    public void setAltura(double a){
        this.altura = a;
    }

    public double getAltura(){
        return altura;
    }

    public void setPeso(double p){
        this.peso = p;
    }

    public double getPeso(){
        return peso;
    }

    public double IMC(){
        return this.peso/(this.altura*this.altura);
    }
}