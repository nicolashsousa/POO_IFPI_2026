package calculadora;
import java.util.Scanner;

public class UsaCalculadora {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double a,b;
        String op;

        System.out.println("Adição(+) Subtração(-) Multiplicação(*) Divisão(/)\n");

        System.out.print("Digite o 1º numero: ");
        a = scan.nextDouble();
        System.out.print("Digite o 2º numero: ");
        b = scan.nextDouble();
        System.out.print("Digite o operador: ");
        op = scan.next();

        while (!op.equals("+") && !op.equals("-") && !op.equals("*") && !op.equals("/") || (op.equals("/") && b == 0)) {
            System.out.print("Operador Inválido ou Divisão por Zero! Digite novamente: ");
            op = scan.next();
        }

        switch (op) {
            case "+": System.out.println("Resultado = "+Calculadora.adicao(a, b));break;
            case "-": System.out.println("Resultado = "+Calculadora.subtracao(a, b));break;
            case "*": System.out.println("Resultado = "+Calculadora.multiplicacao(a, b));break;
            case "/": System.out.println("Resultado = "+Calculadora.divisao(a, b));break;
            default: System.out.println("Operação Invalida");
        }
        scan.close();
    }
}