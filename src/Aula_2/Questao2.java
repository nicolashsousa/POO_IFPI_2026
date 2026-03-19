package Aula_2;

import java.awt.Rectangle;
import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args) {
        int pocoX, pocoY;
        Rectangle lote1 = new Rectangle(0,0,500,400);
        Rectangle lote2 = new Rectangle(500, 0, 800, 400);
        Rectangle lote3 = new Rectangle(1300, 0, 400, 400);
        Rectangle lote4 = new Rectangle(0, 400, 1700, 200);

        Scanner entrada =  new Scanner(System.in);

        System.out.println("Digite o ponto X:");
        pocoX = entrada.nextInt();
        System.out.println("Digite o ponto Y");
        pocoY = entrada.nextInt();

        boolean filho1 = lote1.contains(pocoX,pocoY);
        boolean filho2 = lote2.contains(pocoX,pocoY);
        boolean filho3 = lote3.contains(pocoX,pocoY);
        boolean filho4 = lote4.contains(pocoX,pocoY);
        
        System.out.println("---SISTEMA DE VERIFICAÇÃO DE PROPRIEDADES---\n");
        System.out.println("Analisando coordenadas do poço: (" + pocoX + ", " + pocoY+")");
        System.out.println("Filho 1 = " + filho1);
        System.out.println("Filho 2 = " + filho2);
        System.out.println("Filho 3 = " + filho3);
        System.out.println("Filho 4 = " + filho4);

        entrada.close();
    }
}