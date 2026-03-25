package Aula_3;

public class UsaRetangulo {
    public static void main(String[] args) {
        Retangulo meuRetangulo = new Retangulo();

        meuRetangulo.setAtributos(10, 15);

        System.out.println(meuRetangulo.getAltura());
        System.out.println(meuRetangulo.getLargura());
        System.out.println(meuRetangulo.calcularArea());
    }
}