package aula1;

import java.util.Scanner;

public class Circulo {
    public static void main(String[] args){
        double raio, area, comprimento;
        double pi = 3.14;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o raio:");
        raio = entrada.nextDouble();

        area = pi*raio*raio;
        System.out.println("Area = " + area);

        comprimento = 2*pi*raio;
        System.out.println("Comprimento = " + comprimento);

        entrada.close();
    }
}