package aula6;

import javax.swing.JOptionPane;

public class Area {
    public static void main(String[] args) {
        String entrada1 = JOptionPane.showInputDialog("Digite a altura do triângulo: ");
        String entrada2 = JOptionPane.showInputDialog("Digite a base do triângulo: ");
        
        double altura = Double.valueOf(entrada1);
        double base = Double.valueOf(entrada2);

        String message = "Area = "+ (altura*base)/2;
        JOptionPane.showMessageDialog(null, message);
    }
}
