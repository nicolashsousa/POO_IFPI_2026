package aula3.Questao1;

public class Retangulo {
    private double altura,largura;

    /**
     *
     * @param a Altura a ser passada.
     */
    public void setAltura(double a){
        this.altura = a;
    }

    /**
     *
     * @param l Largura a ser passada.
     */
    public void setLargura(double l){
        this.largura = l;
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
     * @return Retorna a largura.
     */
    public double getLargura(){
        return largura;
    }

    /**
     *
     * @return Retorna a area do retângulo.
     */
    public double calcularArea(){
        return this.altura*this.largura;
    }
}