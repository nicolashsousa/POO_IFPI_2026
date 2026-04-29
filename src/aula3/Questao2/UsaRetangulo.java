package aula3.Questao2;

import java.util.Scanner;

public class UsaRetangulo {
    public static void main(String[] args) {
        Retangulo meuRetangulo = new Retangulo();
        Scanner entrada = new Scanner(System.in);
        double altura,largura;

        System.out.print("Digite a altura: ");
        meuRetangulo.setAltura(entrada.nextDouble());
        altura = meuRetangulo.getAltura();

        System.out.print("Digite a largura: ");
        meuRetangulo.setLargura(entrada.nextDouble());
        largura = meuRetangulo.getLargura();

        double area = meuRetangulo.calcularArea();

        System.out.println("\nRetângulo");
        System.out.println("Altura = "+altura);
        System.out.println("Largura = "+largura);
        System.out.println("Area = "+area);

        entrada.close();
    }
}