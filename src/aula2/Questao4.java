package aula2;

import java.awt.Rectangle;
import java.util.Scanner;

public class Questao4 {
    public static void main(String[] args) {
        int minaX, minaY, alturaMina, larguraMina;
        
        Rectangle lote1 = new Rectangle(0, 0, 400, 400);
        Rectangle lote2 = new Rectangle(400, 0, 900, 400);
        Rectangle lote3 = new Rectangle(1300, 0, 400, 400);
        Rectangle lote4 = new Rectangle(0, 400, 1700, 200);

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o eixo X:");
        minaX = entrada.nextInt();
        System.out.println("Digite o eixo Y:");
        minaY = entrada.nextInt();
        System.out.println("Digite a altura:");
        alturaMina = entrada.nextInt();
        System.out.println("Digite a largura:");
        larguraMina = entrada.nextInt();

        Rectangle minaDeFerro = new Rectangle(minaX, minaY, larguraMina, alturaMina);

        boolean filho1 = lote1.intersects(minaDeFerro);
        boolean filho2 = lote2.intersects(minaDeFerro);
        boolean filho3 = lote3.intersects(minaDeFerro);
        boolean filho4 = lote4.intersects(minaDeFerro);

        System.out.println("---SISTEMA DE VERIFICAÇÃO DE PROPRIEDADES---\n");
        System.out.println("Analisando mina de ferro em X: " + minaX + ", Y: " + minaY + " (Largura: " + larguraMina + ", Altura: " + alturaMina + ")\n");
        System.out.println("Filho 1 = " + filho1);
        System.out.println("Filho 2 = " + filho2);
        System.out.println("Filho 3 = " + filho3);
        System.out.println("Filho 4 = " + filho4);

        entrada.close();
    }
}