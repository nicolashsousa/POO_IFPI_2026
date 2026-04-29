package aula1;

import java.util.Scanner;

public class Velocidade {
    public static void main(String[] args){
        double distancia, velocidade, tempo;
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a distancia: ");
        distancia = entrada.nextDouble();

        System.out.print("Digite a velocidade: ");
        velocidade = entrada.nextDouble();

        tempo = distancia/velocidade;
        System.out.println("Tempo = " + tempo + " h");

        entrada.close();
    }
}