package aula1;

import java.util.Scanner;
//Questão1
public class Area_triangulo {
    public static void main(String[] args){
        double altura, base, area;
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a base: ");
        base = entrada.nextDouble();

        System.out.print("Digite a altura: ");
        altura = entrada.nextDouble();

        area = (altura*base)/2;
        System.out.println("Area = " + area);
        
        entrada.close();
    }
}