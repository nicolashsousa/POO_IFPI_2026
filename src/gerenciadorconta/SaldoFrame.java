package gerenciadorconta;

import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class SaldoFrame extends JFrame {
    private final ContaBancaria contaVinculada;

    JLabel saldoLabel = new JLabel("Saldo: ");
    JTextField saldoField = new JTextField(10);
    JButton okButton = new JButton("OK");

    public SaldoFrame(String titulo, ContaBancaria conta){
        this.contaVinculada = conta;

        super(titulo);
        setSize(200, 200);
        setLayout(new GridBagLayout());
        adicionarComponentes();

        okButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                double saldo = contaVinculada.getSaldo();
                saldoField.setText(String.valueOf(saldo));
            }
        });
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void adicionarComponentes(){
        GridBagConstraints c = new GridBagConstraints();

        c.gridx = 0;
        c.gridy = 1;
        add(saldoLabel, c);

        c.gridx = 1;
        c.gridy = 1;
        add(saldoField, c);

        c.gridx = 1;
        c.gridy = 2;
        add(okButton, c);
        okButton.addActionListener(e -> dispose());
    }
}