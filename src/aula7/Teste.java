package aula7;

import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Teste {
    public static void main(String[] args) {
        JFrame meuFrame = new JFrame();

        meuFrame.setTitle("Calculadora de média");
        meuFrame.setSize(250,400);
        meuFrame.setLayout(null);
        meuFrame.setLayout(new FlowLayout());

        JLabel matriculaLabel = new JLabel("Matricula: ");
        JTextField matriculaField = new JTextField(15);

        JLabel notaLabel = new JLabel("Media: ");
        JTextField notaField = new JTextField(15);

        JButton verificarButton = new JButton();
        verificarButton.setText("Cadastrar");

        JButton cancelarButton = new JButton();
        cancelarButton.setText("Cancelar");

        meuFrame.add(matriculaLabel);
        meuFrame.add(matriculaField);

        meuFrame.add(notaLabel);
        meuFrame.add(notaField);

        meuFrame.add(verificarButton);
        meuFrame.add(cancelarButton);

        meuFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        meuFrame.setVisible(true);
    }
}