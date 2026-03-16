package Aula_1;

import java.util.Scanner;

//Imagine que você foi contratado para desenvolver o módulo de inteligência de um caixa
//eletrônico. O objetivo é otimizar o estoque de cédulas, entregando ao cliente a menor
//quantidade possível de notas para um determinado valor de saque.
//Cédulas Disponíveis:
//O caixa possui notas de: R$ 100, R$ 50, R$ 20, R$ 10, R$ 5, R$ 2 e R$ 1.
//Requisitos do Programa:
//Entrada: Um valor inteiro representando o total a ser sacado.
//Processamento: O programa deve priorizar sempre as notas de maior valor antes de passar para
//as menores.
//Saída: A quantidade de cada nota utilizada. Notas que não forem utilizadas (quantidade zero)
//não precisam ser exibidas (opcional).

public class Cedula {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o valor a ser sacado:");
        int valor = entrada.nextInt();

        int notas100 = valor / 100;
        valor = valor % 100;

        int notas50 = valor / 50;
        valor = valor % 50;

        int notas20 = valor / 20;
        valor = valor % 20;

        int notas10 = valor / 10;
        valor = valor % 10;

        int notas5 = valor / 5;
        valor = valor % 5;

        int notas2 = valor / 2;
        int notas1 = valor % 2; // O que sobrar depois de dividir por 2 são as moedas/notas de 1

        if (notas100 > 0) System.out.println(notas100 + " nota(s) de R$ 100");
        if (notas50 > 0) System.out.println(notas50 + " nota(s) de R$ 50");
        if (notas20 > 0) System.out.println(notas20 + " nota(s) de R$ 20");
        if (notas10 > 0) System.out.println(notas10 + " nota(s) de R$ 10");
        if (notas5 > 0) System.out.println(notas5 + " nota(s) de R$ 5");
        if (notas2 > 0) System.out.println(notas2 + " nota(s) de R$ 2");
        if (notas1 > 0) System.out.println(notas1 + " nota(s) de R$ 1");

        entrada.close();
    }
}
