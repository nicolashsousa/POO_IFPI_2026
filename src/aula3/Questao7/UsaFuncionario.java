package aula3.Questao7;

import java.util.Scanner;

public class UsaFuncionario {
    public static void main(String[] args) {
        FuncionarioHorista ciclano = new FuncionarioHorista();
        Scanner entrada = new Scanner(System.in);
        double valorHora,horasTrabalhadas;

        System.out.println("Digite a valor da hora trabalhada:");
        ciclano.setValorHora(entrada.nextDouble());
        valorHora = ciclano.getValorHora();

        System.out.println("Digite as horas trabalhadas:");
        ciclano.setHorasTrabalhadas(entrada.nextDouble());
        horasTrabalhadas = ciclano.getHorasTrabalhadas();

        double salario = ciclano.calcularSalarioBruto();

        System.out.println("\nSalario = "+salario+" R$");
        System.out.println("Valor da hora trabalhada = "+valorHora+" R$");
        System.out.println("Horas trabalhadas = "+horasTrabalhadas);
        entrada.close();
    }
}