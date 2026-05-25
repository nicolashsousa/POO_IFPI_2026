package aula7;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class CalculadoraIMC {
    public static void main(String[] args) {
        JFrame principalFrame = new JFrame("Calculadora IMC");
        principalFrame.setSize(300,300);
        principalFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        principalFrame.setLayout(new GridBagLayout());

        JLabel pesoLabel = new JLabel("Peso (kg) ");
        JTextField pesoField = new JTextField(15);

        JLabel alturaLabel = new JLabel("Altura (m) ");
        JTextField alturaField = new JTextField(15);

        GridBagConstraints c = new GridBagConstraints();

        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.gridy = 0;
        principalFrame.add(pesoLabel, c);

        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 1;
        c.gridy = 0;
        c.gridwidth = 3;
        principalFrame.add(pesoField, c);

        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.gridy = 1;
        principalFrame.add(alturaLabel, c);

        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 2;
        c.gridy = 1;
        c.gridwidth = 3;
        principalFrame.add(alturaField, c);


        principalFrame.setVisible(true);
    }
}