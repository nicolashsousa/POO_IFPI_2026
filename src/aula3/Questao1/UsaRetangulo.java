package aula3.Questao1;

public class UsaRetangulo {
    public static void main(String[] args) {
        Retangulo meuRetangulo = new Retangulo();

        meuRetangulo.setAltura(10.0);
        meuRetangulo.setLargura(15.0);

        System.out.println("Altura = "+meuRetangulo.getAltura());
        System.out.println("Largura = "+meuRetangulo.getLargura());
        System.out.println("Area = "+meuRetangulo.calcularArea());
    }
}