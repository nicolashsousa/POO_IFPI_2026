package aula3.Questao3;

public class Retangulo {
    private double altura,largura;
    private int valorMetro;

    /**
     *
     * @param a Altura do retângulo.
     */
    public void setAltura(double a){
        this.altura = a;
    }

    /**
     *
     * @return Retorna a altura.
     */
    public double getAltura(){
        return altura;
    }

    /**
     *
     * @param l Largura do retângulo.
     */
    public void setLargura(double l){
        this.largura = l;
    }

    /**
     *
     * @return Retorna a largura.
     */
    public double getLargura(){
        return largura;
    }

    /**
     *
     * @param v Valor do m² em reais.
     */
    public void setValorMetro(int v){
        this.valorMetro = v;
    }

    /**
     *
     * @return Retorna o valor do m².
     */
    public int getValorMetro(){
        return valorMetro;
    }

    /**
     *
     * @return Retorna a área do retângulo.
     */
    public double calcularArea(){
        return this.altura*this.largura;
    }

    /**
     *
     * @return Retorna o valor do lote.
     */
    public double calcularValorLote(){
        return this.altura*this.largura*this.valorMetro;
    }
}