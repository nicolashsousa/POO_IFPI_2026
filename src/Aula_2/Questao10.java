package Aula_2;

import java.util.Random;
import java.time.LocalDate;

public class Questao10 {
    public static void main(String[] args) {
        Random aleatorio = new Random();
        int aluno = aleatorio.nextInt(10)+1;
        LocalDate data = LocalDate.now();
        
        int folga;
        folga = aleatorio.nextInt(10, 15);

        LocalDate novaData = data.plusDays(folga);
        int dia = novaData.getDayOfMonth();
        int mes = novaData.getMonthValue();
        int ano = novaData.getYear();

        System.out.println("Aluno " + aluno + ": " + dia+"/"+mes+"/"+ano+"("+folga+" dias)");
    }
}