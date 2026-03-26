package aula2;

import java.time.LocalDate;
import java.util.Scanner;

public class Questao7 {
    public static void main(String[] args) {
        int soma;
        LocalDate data = LocalDate.now();

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o numero de dias a ser somado:");
        soma = entrada.nextInt();
        LocalDate novaData = data.plusDays(soma);

        int dia = novaData.getDayOfMonth();
        int mes = novaData.getMonthValue();
        int ano = novaData.getYear();

        System.out.println(dia+"/"+mes+"/"+ano);

        entrada.close();
    }
}