package Aula_3;

public class Retangulo {
    private double altura,largura;

    public void setAtributos(double a, double l){
        this.altura = a;
        this.largura = l; 
    }

    public double getAltura(){
        return altura;
    }

    public double getLargura(){
        return largura;
    }

    public double calcularArea(){
        return this.altura*this.largura;
    }
}