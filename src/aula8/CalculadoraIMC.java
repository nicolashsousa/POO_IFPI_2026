package aula8;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class CalculadoraIMC {
    public static void main(String[] args) {
        JFrame principalFrame = new JFrame("Calculadora IMC");
        principalFrame.setSize(250,250);
        principalFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        principalFrame.setLayout(new FlowLayout());
        principalFrame.setLocationRelativeTo(null);

        JLabel pesoLabel = new JLabel("Peso (kg) ");
        JTextField pesoField = new JTextField(15);

        JLabel alturaLabel = new JLabel("Altura (m) ");
        JTextField alturaField = new JTextField(15);


        principalFrame.add(pesoLabel);
        principalFrame.add(pesoField);

        principalFrame.add(alturaLabel);
        principalFrame.add(alturaField);

        JButton calcularButton = new JButton();
        calcularButton.setText("Calcular");
        calcularButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                double altura = Double.valueOf(alturaField.getText());
                double peso = Double.valueOf(pesoField.getText()); 
                double imc = peso/(altura*altura);
                String mensagem = "IMC = "+imc;
                JOptionPane.showMessageDialog(principalFrame, mensagem);
            }
        });
        principalFrame.add(calcularButton);

        JButton limparButton = new JButton();
        limparButton.setText("Limpar");
        limparButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                alturaField.setText("");
                pesoField.setText("");
            }
        });
        principalFrame.add(limparButton);

        principalFrame.setVisible(true);
    }
}