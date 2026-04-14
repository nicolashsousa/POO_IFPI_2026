package aula4.retangulo;

public class Retangulo {
    private double altura;
    private double base;

    public Retangulo(double a, double b){
        this.altura = a;
        this.base = b;
    }

    public void setBase(double b){
        this.base = b;
    }

    public double getBase(){
        return base;
    }

    public void setAltura(double a){
        this.altura = a;
    }

    public double getAltura(){
        return altura;
    }

    public double calcularArea(){
        return this.altura*this.base;
    }
}