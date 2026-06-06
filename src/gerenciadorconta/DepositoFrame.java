package gerenciadorconta;

import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Font;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.BorderFactory;

public class DepositoFrame extends JFrame {
    private final ContaBancaria contaVinculada;

    JLabel tituloLabel = new JLabel("Realizar Depósito");
    JLabel depositoLabel = new JLabel("Valor:");
    JTextField depositoField = new JTextField(10);
    JButton okButton = new JButton("OK");
    JButton cancelButton = new JButton("Cancelar");

    public DepositoFrame(String titulo, ContaBancaria conta){
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
                    double valor = Double.parseDouble(depositoField.getText().replace(",", "."));

                    if (valor > 0) {
                        contaVinculada.depositar(valor);

                        JOptionPane.showMessageDialog(null,
                                "Depósito de " + String.format("R$ %.2f", valor) + " realizado com sucesso!");
                        depositoField.setText("");
                        dispose();
                    } else {
                        JOptionPane.showMessageDialog(null,
                                "Digite um valor maior que zero.",
                                "Erro",
                                JOptionPane.ERROR_MESSAGE);
                        depositoField.setText("");
                    }
                } catch (NumberFormatException ex){
                    JOptionPane.showMessageDialog(null,
                            "Por favor, digite apenas números.",
                            "Erro",
                            JOptionPane.ERROR_MESSAGE);
                    depositoField.setText("");
                }
            }
        });

        cancelButton.addActionListener(e -> dispose());

        pack();
        setLocationRelativeTo(null);
    }

    public void adicionarComponentes(JPanel painel){
        GridBagConstraints cD = new GridBagConstraints();
        cD.insets = new Insets(8, 8, 8, 8);
        cD.fill = GridBagConstraints.HORIZONTAL;

        tituloLabel.setFont(new Font("Arial", Font.BOLD, 16));
        okButton.setPreferredSize(new Dimension(100, 30));
        cancelButton.setPreferredSize(new Dimension(100, 30));

        cD.gridx = 0;
        cD.gridy = 0;
        cD.gridwidth = 2;
        painel.add(tituloLabel, cD);

        cD.gridwidth = 1;
        cD.gridx = 0;
        cD.gridy = 1;
        painel.add(depositoLabel, cD);

        cD.gridx = 1;
        cD.gridy = 1;
        painel.add(depositoField, cD);

        cD.gridx = 0;
        cD.gridy = 2;
        painel.add(okButton, cD);

        cD.gridx = 1;
        cD.gridy = 2;
        painel.add(cancelButton, cD);
    }
}