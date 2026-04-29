package aula1;

import java.util.Scanner;

public class Conversao_temperatura {
    public static void main(String[] args){
        double celsius, fahrenheit, kelvin;
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a temperatura em Graus Celsius: ");
        celsius = entrada.nextDouble();

        System.out.println("Celsius = " + celsius);
        fahrenheit = (celsius*1.8)+32;
        System.out.println("Fahrenheit = " + fahrenheit);

        kelvin = (fahrenheit+459.67)/1.8;
        System.out.println("Kelvin = " + kelvin);

        entrada.close();
    }
}