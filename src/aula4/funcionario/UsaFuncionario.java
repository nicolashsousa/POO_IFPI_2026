package aula4.funcionario;

public class UsaFuncionario {
    public static void main(String[] args) {
        Funcionario mike = new Funcionario(1500, "Michael");
        System.out.println("Funcionario: "+mike.getNome());
        System.out.println("Salario Base = "+mike.getSalario()+" R$");
        System.out.println("IR = "+mike.calcularIR()+" R$");
        System.out.println("INSS = "+mike.calcularINSS()+" R$");
        System.out.println("Salario Final: "+mike.calcularSalarioFinal()+" R$");
    }
}
