package Aula_2;

import java.time.LocalDate;

public class Questao6 {
    public static void main(String[] args) {
        LocalDate data = LocalDate.of(2025, 4, 12);
        LocalDate Data1 = data.plusDays(20);
        LocalDate Data2 = data.plusDays(40);
        LocalDate Data3 = data.plusDays(75);

        int dia1 = Data1.getDayOfMonth();
        int mes1 = Data1.getMonthValue();
        int ano1 = Data1.getYear();

        int dia2 = Data2.getDayOfMonth();
        int mes2 = Data2.getMonthValue();
        int ano2 = Data2.getYear();

        int dia3 = Data3.getDayOfMonth();
        int mes3 = Data3.getMonthValue();
        int ano3 = Data3.getYear();

        System.out.println("Prova 1: "+dia1+"/"+mes1+"/"+ano1);
        System.out.println("Prova 2: "+dia2+"/"+mes2+"/"+ano2);
        System.out.println("Prova 3: "+dia3+"/"+mes3+"/"+ano3); 
    }
}