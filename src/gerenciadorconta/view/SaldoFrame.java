package gerenciadorconta.view;

import gerenciadorconta.model.ContaBancaria;

import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.BorderFactory;

public class SaldoFrame extends JFrame {
    private final ContaBancaria contaVinculada;

    JLabel tituloLabel = new JLabel("Saldo Atual");
    JLabel saldoLabel = new JLabel("Saldo:");
    JTextField saldoField = new JTextField(10);
    JButton okButton = new JButton("OK");

    public SaldoFrame(String titulo, ContaBancaria conta){
        super(titulo);
        this.contaVinculada = conta;

        setResizable(false);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JPanel painel = new JPanel(new GridBagLayout());
        painel.setBorder(BorderFactory.createEmptyBorder(20, 25, 20, 25));
        add(painel);

        adicionarComponentes(painel);

        saldoField.setEditable(false);
        saldoField.setText(String.format("R$ %.2f", this.contaVinculada.getSaldo()));

        okButton.addActionListener(e -> dispose());

        pack();
        setLocationRelativeTo(null);
    }

    public void adicionarComponentes(JPanel painel){
        GridBagConstraints cS = new GridBagConstraints();
        cS.insets = new Insets(8, 8, 8, 8);
        cS.fill = GridBagConstraints.HORIZONTAL;

        tituloLabel.setFont(new Font("Arial", Font.BOLD, 16));

        cS.gridx = 0;
        cS.gridy = 0;
        cS.gridwidth = 2;
        painel.add(tituloLabel, cS);

        cS.gridwidth = 1;
        cS.gridx = 0;
        cS.gridy = 1;
        painel.add(saldoLabel, cS);

        cS.gridx = 1;
        cS.gridy = 1;
        painel.add(saldoField, cS);

        cS.gridx = 0;
        cS.gridy = 2;
        cS.gridwidth = 2;
        painel.add(okButton, cS);
    }
}