package gerenciadorconta;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SaqueFrame extends JFrame {
    private final ContaBancaria contaVinculada;
    JLabel saqueLabel = new JLabel("Digite o valor:");
    JTextField saqueField = new JTextField(10);
    JButton okButton = new JButton("OK");
    JButton cancelButton = new JButton("Cancelar");

    public SaqueFrame(String titulo, ContaBancaria conta){
        super(titulo);
        this.contaVinculada = conta;

        setSize(250, 250);
        setLayout(new GridBagLayout());
        adicionarComponentes();

        okButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double valor = Double.parseDouble(saqueField.getText());

                    contaVinculada.sacar(valor);

                    JOptionPane.showMessageDialog(null,
                            "Saque de "+valor+" R$ realizado com sucesso!");
                    saqueField.setText("");
                    dispose();
                } catch (NumberFormatException ex){
                    JOptionPane.showMessageDialog(null,
                            "Por favor, digite apenas números.", "Erro", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    public void adicionarComponentes(){
        GridBagConstraints cQ = new GridBagConstraints();

        cQ.gridx = 0;
        cQ.gridy = 1;
        add(saqueLabel, cQ);

        cQ.gridx = 1;
        cQ.gridy = 1;
        add(saqueField, cQ);

        cQ.gridx = 0;
        cQ.gridy = 2;
        add(okButton, cQ);
        okButton.addActionListener(e -> dispose());

        cQ.gridx = 1;
        cQ.gridy = 2;
        add(cancelButton, cQ);
        cancelButton.addActionListener(e -> dispose());
    }
}