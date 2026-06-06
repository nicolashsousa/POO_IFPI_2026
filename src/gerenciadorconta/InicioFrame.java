package gerenciadorconta;

import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;

import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JFrame;

public class InicioFrame extends JFrame {
    private final ContaBancaria minhaConta = new ContaBancaria();

    JButton saldoButton = new JButton("Saldo");
    JButton depositoButton = new JButton("Deposito");
    JButton sacarButton = new JButton("Sacar");

    JLabel saldoLabel = new JLabel();
    JLabel depositoLabel = new JLabel();
    JLabel sacarLabel = new JLabel();

    public InicioFrame(String titulo){
        super(titulo);
        setSize(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridBagLayout());
        adicionarComponentes();

        saldoButton.addActionListener(e -> {
            SaldoFrame saldoFrame = new SaldoFrame("Saldo", minhaConta);
            saldoFrame.setVisible(true);
        });

        depositoButton.addActionListener(e -> {
            DepositoFrame depositoFrame = new DepositoFrame("Deposito", minhaConta);
            depositoFrame.setVisible(true);
        });

        sacarButton.addActionListener(e -> {
            SaqueFrame saqueFrame = new SaqueFrame("Sacar", minhaConta);
            saqueFrame.setVisible(true);
        });

        setLocationRelativeTo(null);
    }

    public void adicionarComponentes(){
        GridBagConstraints cF = new GridBagConstraints();

        cF.gridx = 0;
        cF.gridy = 1;
        add(saldoLabel, cF);

        cF.gridx = 1;
        cF.gridy = 1;
        add(saldoButton, cF);

        cF.gridx = 0;
        cF.gridy = 2;
        add(depositoLabel, cF);

        cF.gridx = 1;
        cF.gridy = 2;
        add(depositoButton, cF);

        cF.gridx = 0;
        cF.gridy = 3;
        add(sacarLabel, cF);

        cF.gridx = 1;
        cF.gridy = 3;
        add(sacarButton, cF);
    }
}