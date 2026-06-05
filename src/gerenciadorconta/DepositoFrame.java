package gerenciadorconta;

import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class DepositoFrame extends JFrame {
    private final ContaBancaria contaVinculada;

    JLabel depositoLabel = new JLabel("Digite o valor: ");
    JTextField depositoField = new JTextField(10);
    JButton okButton = new JButton("OK");
    JButton cancelButton = new JButton("Cancelar");

    public DepositoFrame(String titulo, ContaBancaria conta){
        this.contaVinculada = conta;

        super(titulo);
        setSize(250, 150);
        setLayout(new GridBagLayout());
        adicionarComponentes();

        okButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double valor = Double.parseDouble(depositoField.getText());

                    contaVinculada.depositar(valor);

                    JOptionPane.showMessageDialog(null,
                            "Depósito de "+valor+" R$ realizado com sucesso!");
                    dispose();
                } catch (NumberFormatException ex){
                    JOptionPane.showMessageDialog(null,
                            "Por favor, digite apenas números.", "Erro", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void adicionarComponentes(){
        GridBagConstraints c = new GridBagConstraints();

        c.gridx = 0;
        c.gridy = 1;
        add(depositoLabel, c);

        c.gridx = 1;
        c.gridy = 1;
        add(depositoField, c);

        c.gridx = 0;
        c.gridy = 2;
        add(okButton, c);
        okButton.addActionListener(e -> dispose());

        c.gridx = 1;
        c.gridy = 2;
        add(cancelButton, c);
        cancelButton.addActionListener(e -> dispose());
    }
}