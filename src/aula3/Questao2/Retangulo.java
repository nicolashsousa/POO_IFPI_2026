package aula3.Questao2;

public class Retangulo {
    private double altura,largura;

    public void setAltura(double a){
        this.altura = a;
    }

    public void setLargura(double l){
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