package aula3.Questao4;

public class AvaliacaoFisica {
    private double altura, peso;

    /**
     *
     * @param a Altura em metros.
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
     * @param p Peso em quilogramas.
     */
    public void setPeso(double p){
        this.peso = p;
    }

    /**
     *
     * @return Retorna o peso.
     */
    public double getPeso(){
        return peso;
    }

    /**
     * IMC = Peso/(altura²).
     * @return Retorna o IMC (Índice de massa corporal).
     */
    public double IMC(){
        return this.peso/(this.altura*this.altura);
    }
}