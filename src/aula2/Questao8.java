package aula2;

import java.util.Random;

public class Questao8 {
    public static void main(String[] args) {
        Random aleatorio = new Random();
        int aluno = aleatorio.nextInt(10);
        System.out.println("Aluno sorteado: " + aluno);
    }
}