package aula5.robo;

public class Robo {
    private static int ultimo = 0;
    private final int numeroDeSerie;

    public Robo(){
        this.numeroDeSerie = Robo.ultimo + 1;
        Robo.ultimo = this.numeroDeSerie;
    }

    public int getNumeroDeSerie(){
        return numeroDeSerie;
    }
}