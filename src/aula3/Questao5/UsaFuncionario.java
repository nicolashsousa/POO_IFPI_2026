package aula3.Questao5;

import java.util.Scanner;

public class UsaFuncionario {
    public static void main(String[] args) {
        Funcionario fulano = new Funcionario();
        Scanner entrada = new Scanner(System.in);
        double salario,aliquota;

        System.out.println("Digite o salário:");
        fulano.setSalario(entrada.nextDouble());
        salario = fulano.getSalario();

        System.out.println("Digite a alíquota: ");
        fulano.setAliquota(entrada.nextDouble());
        aliquota = fulano.getAliquota();

        double imposto = fulano.calcularImposto();
        
        System.out.println("\nSalário = "+salario+" R$");
        System.out.println("Alíquota = "+aliquota);
        System.out.println("Imposto: "+imposto+" R$");

        entrada.close();
    }
}