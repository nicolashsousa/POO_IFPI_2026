package Aula_2;

import java.awt.Rectangle;

public class Questao3 {
    public static void main(String[] args) {
        Rectangle minaDeFerro = new Rectangle(350, 100, 100, 120);
        Rectangle lote1 = new Rectangle(0, 0, 400, 400);
        Rectangle lote2 = new Rectangle(400, 0, 900, 400);
        Rectangle lote3 = new Rectangle(1300, 0, 400, 400);
        Rectangle lote4 = new Rectangle(0, 400, 1700, 200);

        boolean filho1 = lote1.intersects(minaDeFerro);
        boolean filho2 = lote2.intersects(minaDeFerro);
        boolean filho3 = lote3.intersects(minaDeFerro);
        boolean filho4 = lote4.intersects(minaDeFerro);

        System.out.println("---SISTEMA DE VERIFICAÇÃO DE PROPRIEDADES---\n");
        System.out.println("Analisando mina de ferro em X: 350, Y: 100 (Largura: 100, Altura: 120)\n");
        System.out.println("Filho 1 = " + filho1);
        System.out.println("Filho 2 = " + filho2);
        System.out.println("Filho 3 = " + filho3);
        System.out.println("Filho 4 = " + filho4);
    }
}