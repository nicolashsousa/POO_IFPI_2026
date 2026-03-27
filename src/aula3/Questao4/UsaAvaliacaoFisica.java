package aula3.Questao4;

import java.util.Scanner;

public class UsaAvaliacaoFisica {
    public static void main(String[] args) {
        AvaliacaoFisica paciente = new AvaliacaoFisica();
        Scanner entrada = new Scanner(System.in);
        double altura,peso;

        System.out.println("Digite a altura: ");
        paciente.setAltura(entrada.nextDouble());
        altura = paciente.getAltura();

        System.out.println("Digite o peso: ");
        paciente.setPeso(entrada.nextDouble());
        peso = paciente.getPeso();
        
        double IMC = paciente.IMC();

        System.out.println("\nAltura: "+altura+" m");
        System.out.println("Peso: "+peso+" Kg");
        System.out.println("IMC: "+IMC);

        entrada.close();
    }
}