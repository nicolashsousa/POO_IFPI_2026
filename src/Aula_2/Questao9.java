package Aula_2;

import java.util.Random;

public class Questao9 {
    public static void main(String[] args) {
        Random aleatorio = new Random();
        int aluno = aleatorio.nextInt(10)+1;
        System.out.println("Aluno sorteado: " + aluno);
    }
}