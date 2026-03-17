package Aula_1;

import java.util.Scanner;

public class Salario_liquido {
    public static void main(String[] args){
        double salario, salario_liquido, imposto;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o salario:");
        salario = entrada.nextDouble();

        imposto = salario*0.1;
        System.out.println("Salario = " + salario + " R$");
        System.out.println("Imposto = " + imposto + " R$");

        salario_liquido = salario-imposto;
        System.out.println("Salario liquido = " + salario_liquido + " R$");

        entrada.close();
    }
}