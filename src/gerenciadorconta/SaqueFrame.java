package gerenciadorconta;

import javax.swing.*;
import java.awt.*;

public class SaqueFrame extends JFrame {
    JLabel saqueLabel = new JLabel("Digite o valor:");
    JTextField saqueField = new JTextField(10);
    JButton okButton = new JButton("OK");
    JButton cancelButton = new JButton("Cancelar");

    public SaqueFrame(String titulo){
        super(titulo);
        setSize(250, 250);
        setLayout(new GridBagLayout());
        adicionarComponentes();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void adicionarComponentes(){
        GridBagConstraints c = new GridBagConstraints();

        c.gridx = 0;
        c.gridy = 1;
        add(saqueLabel, c);

        c.gridx = 1;
        c.gridy = 1;
        add(saqueField, c);

        c.gridx = 0;
        c.gridy = 2;
        add(okButton, c);
        okButton.addActionListener(e -> dispose());

        c.gridx = 1;
        c.gridy = 2;
        add(cancelButton, c);
    }
}