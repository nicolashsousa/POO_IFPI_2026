package aula6;

import javax.swing.JOptionPane;

public class Salario {
    public static void main(String[] args) {
        String entrada = JOptionPane.showInputDialog("Digite o salario: ");
        double salario = Double.valueOf(entrada);
        double imposto = salario*0.1;
        String message = "Contra Cheque \nSalario: "+entrada+ " R$\n" + 
        "Imposto: "+imposto+" R$\n" + "Salario liquido: "+ (salario-imposto) + " R$";
        JOptionPane.showMessageDialog(null, message);
    }
}