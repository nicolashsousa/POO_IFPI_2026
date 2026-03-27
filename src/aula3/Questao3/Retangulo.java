package aula3.Questao3;

public class Retangulo {
    private double altura,largura;
    private int valorMetro;

    public void setAltura(double a){
        this.altura = a;
    }

    public double getAltura(){
        return altura;
    }

    public void setLargura(double l){
        this.largura = l;
    }

    public double getLargura(){
        return largura;
    }

    public void setValorMetro(int v){
        this.valorMetro = v;
    }

    public int getValorMetro(){
        return valorMetro;
    }

    public double calcularArea(){
        return this.altura*this.largura;
    }

    public double calcularValorLote(){
        return this.altura*this.largura*this.valorMetro;
    }
}