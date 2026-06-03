package aula10;

import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class MeuFrame extends JFrame {
    JLabel pesoLabel = new JLabel("Peso");
    JLabel alturaLabel = new JLabel("Altura");
    JTextField pesoField = new JTextField(10);
    JTextField alturaField = new JTextField(10);
    JButton calcularButton = new JButton("Calcular");
    JButton limparButton = new JButton("Limpar");

    public MeuFrame(String titulo){
        super(titulo);
        setSize(200, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridBagLayout());
        adicionarComponentes();
        setLocationRelativeTo(null);
        calcularButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calcular();
            }
        });
        limparButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                limpar();
            }
        });
    }

    public void calcular(){
        double peso = Double.parseDouble(pesoField.getText());
        double altura = Double.parseDouble(alturaField.getText());
        double imc = peso/(altura*altura);
        JOptionPane.showMessageDialog(null, "IMC = "+imc);
    }
    public void limpar(){
        pesoField.setText("");
        alturaField.setText("");
    }

    public void adicionarComponentes(){
        GridBagConstraints c = new GridBagConstraints();

        c.gridx = 0;
        c.gridy = 0;
        add(pesoLabel, c);

        c.gridx = 1;
        c.gridy = 0;
        add(pesoField, c);

        c.gridx = 0;
        c.gridy = 1;
        add(alturaLabel, c);

        c.gridx = 1;
        c.gridy = 1;
        add(alturaField, c);

        c.gridx = 0;
        c.gridy = 2;
        add(calcularButton, c);

        c.gridx = 1;
        c.gridy = 2;
        add(limparButton, c);
    }
}