package gerenciadorconta;

import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class SaldoFrame extends JFrame {
    private final ContaBancaria contaVinculada;

    JLabel saldoLabel = new JLabel("Saldo: ");
    JTextField saldoField = new JTextField(10);
    JButton okButton = new JButton("OK");

    public SaldoFrame(String titulo, ContaBancaria conta){
        super(titulo);

        this.contaVinculada = conta;

        setSize(200, 200);
        setLayout(new GridBagLayout());
        adicionarComponentes();

        saldoField.setEditable(false);
        saldoField.setText(String.valueOf(this.contaVinculada.getSaldo()));

        okButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                double saldo = contaVinculada.getSaldo();
                saldoField.setText(String.valueOf(saldo));
                dispose();
            }
        });

        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    public void adicionarComponentes(){
        GridBagConstraints cS = new GridBagConstraints();

        cS.gridx = 0;
        cS.gridy = 1;
        add(saldoLabel, cS);

        cS.gridx = 1;
        cS.gridy = 1;
        add(saldoField, cS);

        cS.gridx = 1;
        cS.gridy = 2;
        add(okButton, cS);
    }
}