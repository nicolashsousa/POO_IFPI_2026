package aula1;

import java.util.Scanner;

public class Imposto {
    public static void main(String[] args){
        double salario, imposto;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o salario:");
        salario = entrada.nextDouble();

        imposto = salario*0.1;
        System.out.println("Salario = " + salario + " R$");
        System.out.println("Imposto = " + imposto + " R$");

        entrada.close();
    }
}