package aula1;

import java.util.Scanner;

public class SalarioLiquido {
    public static void main(String[] args){
        double salario, salario_liquido, imposto;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o salário: ");
        salario = entrada.nextDouble();

        imposto = salario*0.1;
        System.out.println("Salário = " + salario + " R$");
        System.out.println("Imposto = " + imposto + " R$");

        salario_liquido = salario-imposto;
        System.out.println("Salário liquido = " + salario_liquido + " R$");

        entrada.close();
    }
}