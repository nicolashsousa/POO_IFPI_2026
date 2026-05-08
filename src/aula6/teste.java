package aula6;

import javax.swing.JOptionPane;

public class teste {
    public static void main(String[] args) {
        String entrada = JOptionPane.showInputDialog("Digite sua idade: ");
        int idade = Integer.valueOf(entrada);
        JOptionPane.showMessageDialog(null, idade+" anos");
    }
}