package aula3.Questao3;

import java.util.Scanner;

public class UsaRetangulo {
    public static void main(String[] args) {
        Retangulo meuRetangulo = new Retangulo();
        Scanner entrada = new Scanner(System.in);
        double altura,largura;
        int valorMetro;

        System.out.println("Digite a altura: ");
        meuRetangulo.setAltura(entrada.nextDouble());
        altura = meuRetangulo.getAltura();

        System.out.println("Digite a largura: ");
        meuRetangulo.setLargura(entrada.nextDouble());
        largura = meuRetangulo.getLargura();

        System.out.println("Digite o valor do m²: ");
        meuRetangulo.setValorMetro(entrada.nextInt());
        valorMetro = meuRetangulo.getValorMetro();

        double area = meuRetangulo.calcularArea();
        double valor = meuRetangulo.calcularValorLote();

        System.out.println("\nRetângulo");
        System.out.println("Altura = "+altura+" m");
        System.out.println("Largura = "+largura+" m");
        System.out.println("Area = "+area+" m²");
        System.out.println("Valor total = "+valor+" R$");

        entrada.close();
    }
}