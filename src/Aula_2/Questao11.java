package Aula_2;

import java.util.Scanner;
import java.awt.Rectangle;
import java.time.LocalDate;
import java.util.Random;

public class Questao11 {
    public static void main(String[] args) {
        //1. Receba os dados de uma nova mina (x, y, largura, comprimento) via Scanner.
        int minaX, minaY, comprimentoMina, larguraMina;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Coordenada X inicial:");
        minaX = entrada.nextInt();
        System.out.println("Coordenada Y inicial:");
        minaY = entrada.nextInt();
        System.out.println("Comprimento da mina:");
        comprimentoMina = entrada.nextInt();
        System.out.println("Largura da mina:");
        larguraMina = entrada.nextInt();

        Rectangle minaDeFerro = new Rectangle(minaX, minaY, larguraMina, comprimentoMina);

        //2. Verifique e liste quais irmãos são donos da área atingida usando intersects.
        Rectangle lote1 = new Rectangle(0, 0, 400, 400);
        Rectangle lote2 = new Rectangle(400, 0, 900, 400);
        Rectangle lote3 = new Rectangle(1300, 0, 400, 400);
        Rectangle lote4 = new Rectangle(0, 400, 1700, 200);

        boolean filho1 = lote1.intersects(minaDeFerro);
        boolean filho2 = lote2.intersects(minaDeFerro);
        boolean filho3 = lote3.intersects(minaDeFerro);
        boolean filho4 = lote4.intersects(minaDeFerro);

        //3. Gere um Número de Protocolo aleatório de 0 a 10.000 com Random.
        Random aleatorio = new Random();
        int numeroProtocolo = aleatorio.nextInt(10001);

        //4. Defina a Data de Validade do alvará para exatos 2 anos após a data atual com LocalDate.
        LocalDate data = LocalDate.now();
        LocalDate novaData = data.plusYears(2);

        int dia = novaData.getDayOfMonth();
        int mes = novaData.getMonthValue();
        int ano = novaData.getYear();

        //5. Exiba um relatório completo com Protocolo, Validade e Proprietários atingidos.
        System.out.println("\nProtocolo de Registro: #"+numeroProtocolo);
        System.out.println("Data de emissão: "+data.getDayOfMonth()+"/"+data.getMonthValue()+"/"+data.getYear());
        System.out.println("Data de validade: "+dia+"/"+mes+"/"+ano);
        System.out.println("\nPROPRIETÁRIOS AFETADOS PELA MINA:");
        if(filho1) System.out.println("Filho 1");
        if(filho2) System.out.println("Filho 2");
        if(filho3) System.out.println("Filho 3");
        if(filho4) System.out.println("Filho 4");

        entrada.close();
    }
}