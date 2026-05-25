package aula8;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class CalculadoraCirculo {
    public static void main(String[] args) {
        JFrame meuFrame = new JFrame("Calculadora do círculo");
        meuFrame.setSize(450,350);
        meuFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        meuFrame.setLayout(new FlowLayout());
        meuFrame.setLocationRelativeTo(null);
        
        JLabel raioLabel = new JLabel("Raio:");
        JTextField raioField = new JTextField(10);

        JButton calcularButton = new JButton();
        calcularButton.setText("Calcular");
        calcularButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                double raio = Double.valueOf(raioField.getText());
                double area = 3.14*raio*raio;
                String mensagem = "Area = "+area;
                JOptionPane.showMessageDialog(meuFrame, mensagem);
            }
        });

        JButton limparButton = new JButton();
        limparButton.setText("Limpar");
        limparButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                raioField.setText("");
            }
        });

        meuFrame.add(raioLabel);
        meuFrame.add(raioField);

        meuFrame.add(calcularButton);
        meuFrame.add(limparButton);

        meuFrame.setVisible(true);
    }
}