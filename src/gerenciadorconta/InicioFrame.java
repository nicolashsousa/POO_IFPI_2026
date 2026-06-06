package gerenciadorconta;

import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.BorderFactory;

public class InicioFrame extends JFrame {
    private final ContaBancaria minhaConta = new ContaBancaria();
    
    JLabel tituloLabel = new JLabel("Gerenciador de Conta");
    JButton saldoButton = new JButton("Saldo");
    JButton depositoButton = new JButton("Depósito");
    JButton sacarButton = new JButton("Sacar");

    public InicioFrame(String titulo){
        super(titulo);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridBagLayout());
        setResizable(false);

        JPanel painel = new JPanel(new GridBagLayout());
        painel.setBorder(BorderFactory.createEmptyBorder(20, 30, 20, 30));
        add(painel);

        adicionarComponentes(painel);

        saldoButton.addActionListener(e -> {
            SaldoFrame saldoFrame = new SaldoFrame("Saldo", minhaConta);
            saldoFrame.setVisible(true);
        });

        depositoButton.addActionListener(e -> {
            DepositoFrame depositoFrame = new DepositoFrame("Depósito", minhaConta);
            depositoFrame.setVisible(true);
        });

        sacarButton.addActionListener(e -> {
            SaqueFrame saqueFrame = new SaqueFrame("Sacar", minhaConta);
            saqueFrame.setVisible(true);
        });

        pack();
        setLocationRelativeTo(null);
    }

    public void adicionarComponentes(JPanel painel){
        GridBagConstraints cF = new GridBagConstraints();
        cF.insets = new Insets(8, 8, 8, 8);
        cF.fill = GridBagConstraints.HORIZONTAL;

        tituloLabel.setFont(new Font("Arial", Font.BOLD, 18));

        cF.gridx = 0;
        cF.gridy = 0;
        cF.gridwidth = 1;
        painel.add(tituloLabel, cF);

        cF.gridy = 1;
        painel.add(saldoButton, cF);

        cF.gridy = 2;
        painel.add(depositoButton, cF);

        cF.gridy = 3;
        painel.add(sacarButton, cF);
    }
}