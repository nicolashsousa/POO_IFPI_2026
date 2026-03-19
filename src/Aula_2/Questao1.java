package Aula_2;

import java.awt.Rectangle;

public class Questao1 {
    public static void main(String[] args) {
        Rectangle lote1 = new Rectangle(0,0,500,400);
        Rectangle lote2 = new Rectangle(500, 0, 800, 400);
        Rectangle lote3 = new Rectangle(1300, 0, 400, 400);
        Rectangle lote4 = new Rectangle(0, 400, 1700, 200);

        boolean filho1 = lote1.contains(750,250);
        boolean filho2 = lote2.contains(750,250);
        boolean filho3 = lote3.contains(750,250);
        boolean filho4 = lote4.contains(750,250);
        
        System.out.println("---SISTEMA DE VERIFICAÇÃO DE PROPRIEDADES---\n");
        System.out.println("Analisando coordenadas do poço: (750, 250)\n");
        System.out.println("Filho 1 = " + filho1);
        System.out.println("Filho 2 = " + filho2);
        System.out.println("Filho 3 = " + filho3);
        System.out.println("Filho 4 = " + filho4);
    }
}