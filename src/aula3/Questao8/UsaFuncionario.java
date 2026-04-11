package aula3.Questao8;

import java.util.Scanner;

public class UsaFuncionario {
    public static void main(String[] args) {
        FuncionarioHorista ciclano = new FuncionarioHorista();
        Scanner entrada = new Scanner(System.in);
        double valorHora,horasTrabalhadas,aliquota;
        System.out.println("Digite a valor da hora trabalhada:");
        ciclano.setValorHora(entrada.nextDouble());
        valorHora = ciclano.getValorHora();

        System.out.println("Digite as horas trabalhadas:");
        ciclano.setHorasTrabalhadas(entrada.nextDouble());
        horasTrabalhadas = ciclano.getHorasTrabalhadas();

        System.out.println("Digite a aliquota:");
        ciclano.setAliquota(entrada.nextDouble());
        aliquota = ciclano.getAliquota();

        double salario = ciclano.calcularSalarioBruto();
        double imposto = ciclano.calcularImposto();
        double salarioLiquido = ciclano.calcularSalarioLiquido();

        System.out.println("\nSalario = "+salario+" R$");
        System.out.println("Valor da hora trabalhada = "+valorHora+" R$");
        System.out.println("Horas trabalhadas = "+horasTrabalhadas);
        System.out.println("Aliquota = "+aliquota);
        System.out.println("Imposto = "+imposto+" R$");
        System.out.println("Salario Líquido = "+salarioLiquido+" R$");
        entrada.close();
    }
}