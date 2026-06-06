package gerenciadorconta;

import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JOptionPane;

public class DepositoFrame extends JFrame {
    private final ContaBancaria contaVinculada;

    JLabel depositoLabel = new JLabel("Digite o valor: ");
    JTextField depositoField = new JTextField(10);
    JButton okButton = new JButton("OK");
    JButton cancelButton = new JButton("Cancelar");

    public DepositoFrame(String titulo, ContaBancaria conta){
        super(titulo);
        this.contaVinculada = conta;

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
                    depositoField.setText("");
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
        GridBagConstraints cD = new GridBagConstraints();

        cD.gridx = 0;
        cD.gridy = 1;
        add(depositoLabel, cD);

        cD.gridx = 1;
        cD.gridy = 1;
        add(depositoField, cD);

        cD.gridx = 0;
        cD.gridy = 2;
        add(okButton, cD);

        cD.gridx = 1;
        cD.gridy = 2;
        add(cancelButton, cD);
        cancelButton.addActionListener(e -> dispose());
    }
}