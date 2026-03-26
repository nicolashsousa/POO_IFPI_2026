package aula3;

public class AvaliacaoFisica {
    private double altura, peso;

    public void setAtributos(double a,double p){
        this.altura = a;
        this.peso = p;
    }

    public double getAltura(){
        return altura;
    }

    public double getPeso(){
        return peso;
    }

    public double IMC(){
        return this.peso/(this.altura*this.altura);
    }
}