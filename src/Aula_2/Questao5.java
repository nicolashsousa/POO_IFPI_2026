package Aula_2;

import java.time.LocalDate;

public class Questao5 {
    public static void main(String[] args) {
        LocalDate data = LocalDate.of(2026, 2, 18);
        LocalDate novaData = data.plusDays(25);

        int dia = novaData.getDayOfMonth();
        int mes = novaData.getMonthValue();
        int ano = novaData.getYear();

        System.out.println(dia+"/"+mes+"/"+ano);
    }
}