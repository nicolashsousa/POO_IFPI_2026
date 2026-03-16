package Aula_1;

import java.util.Scanner;

public class Retangulo {
    public static void main(String[] args){
        double altura, base, area, perimetro;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite a base:");
        base = entrada.nextDouble();

        System.out.println("Digite a altura");
        altura = entrada.nextDouble();

        area = altura*base;
        System.out.println("Area = " + area);

        perimetro =(2*altura)+(2*base);
        System.out.println("Perimetro = " + perimetro);

        entrada.close();
    }
}