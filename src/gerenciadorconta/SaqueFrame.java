package gerenciadorconta;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.BorderFactory;

import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Font;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SaqueFrame extends JFrame {
    private final ContaBancaria contaVinculada;

    JLabel tituloLabel = new JLabel("Realizar Saque");
    JLabel saqueLabel = new JLabel("Valor:");
    JTextField saqueField = new JTextField(10);
    JButton okButton = new JButton("OK");
    JButton cancelButton = new JButton("Cancelar");

    public SaqueFrame(String titulo, ContaBancaria conta){
        super(titulo);
        this.contaVinculada = conta;

        setResizable(false);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JPanel painel = new JPanel(new GridBagLayout());
        painel.setBorder(BorderFactory.createEmptyBorder(20, 25, 20, 25));
        add(painel);

        adicionarComponentes(painel);

        okButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double valor = Double.parseDouble(saqueField.getText().replace(",", "."));

                    boolean saqueRealizado = contaVinculada.sacar(valor);

                    if (saqueRealizado) {
                        JOptionPane.showMessageDialog(null,
                                "Saque de " + String.format("R$ %.2f", valor) + " realizado com sucesso!");
                        saqueField.setText("");
                        dispose();
                    } else {
                        JOptionPane.showMessageDialog(null,
                                "Saldo insuficiente ou valor inválido.",
                                "Erro",
                                JOptionPane.ERROR_MESSAGE);
                        saqueField.setText("");
                    }
                } catch (NumberFormatException ex){
                    JOptionPane.showMessageDialog(null,
                            "Por favor, digite apenas números.",
                            "Erro",
                            JOptionPane.ERROR_MESSAGE);
                    saqueField.setText("");
                }
            }
        });

        cancelButton.addActionListener(e -> dispose());

        pack();
        setLocationRelativeTo(null);
    }

    public void adicionarComponentes(JPanel painel){
        GridBagConstraints cQ = new GridBagConstraints();
        cQ.insets = new Insets(8, 8, 8, 8);
        cQ.fill = GridBagConstraints.HORIZONTAL;

        tituloLabel.setFont(new Font("Arial", Font.BOLD, 16));
        okButton.setPreferredSize(new Dimension(100, 30));
        cancelButton.setPreferredSize(new Dimension(100, 30));

        cQ.gridx = 0;
        cQ.gridy = 0;
        cQ.gridwidth = 2;
        painel.add(tituloLabel, cQ);

        cQ.gridwidth = 1;
        cQ.gridx = 0;
        cQ.gridy = 1;
        painel.add(saqueLabel, cQ);

        cQ.gridx = 1;
        cQ.gridy = 1;
        painel.add(saqueField, cQ);

        cQ.gridx = 0;
        cQ.gridy = 2;
        painel.add(okButton, cQ);

        cQ.gridx = 1;
        cQ.gridy = 2;
        painel.add(cancelButton, cQ);
    }
}