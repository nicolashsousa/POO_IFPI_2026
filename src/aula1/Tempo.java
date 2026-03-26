package aula1;

import java.util.Scanner;

public class Tempo {
    //Tempo em horas, minutos e segundos
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite sua distância: ");
        double distancia = entrada.nextDouble();
        System.out.println("Digite sua velocidade: ");
        double velocidade = entrada.nextDouble();
        
        double tempo = (distancia / velocidade);
        int horas = (int) tempo;
        double minutos = (tempo - horas) * 60;
        int minuto = (int) minutos;
        int segundos = (int) ((minutos - minuto) * 60);
        System.out.println("Tempo: " + horas + " hr " + minuto + " min " + segundos + " s");

        entrada.close();
    }
}