package calculadora;

import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class GuiCalculadora {
    public static void main(String[] args) {
        JFrame calculadoraFrame = new JFrame();

        calculadoraFrame.setTitle("Calculadora");
        calculadoraFrame.setSize(250,300);
        calculadoraFrame.setLayout(null);
        calculadoraFrame.setLayout(new FlowLayout());

        JLabel numero1Label = new JLabel("Numero 1:");
        JTextField numero1Field = new JTextField(15);
        JLabel numero2Label = new JLabel("Numero 2:");
        JTextField numero2Field = new JTextField(15);

        JButton somarButton = new JButton("+");
        JButton subtrairButton = new JButton("-");
        JButton multiplicarButton = new JButton("*");
        JButton dividirButton = new JButton("/");
        JButton igualButton = new JButton("=");

        calculadoraFrame.add(numero1Label);
        calculadoraFrame.add(numero1Field);

        calculadoraFrame.add(somarButton);
        calculadoraFrame.add(subtrairButton);
        calculadoraFrame.add(multiplicarButton);
        calculadoraFrame.add(dividirButton);

        calculadoraFrame.add(numero2Label);
        calculadoraFrame.add(numero2Field);

        calculadoraFrame.add(igualButton);

        calculadoraFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        calculadoraFrame.setVisible(true);
    }
}