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

    SaldoFrame saldoFrame = new SaldoFrame("Saldo", minhaConta);
    DepositoFrame depositoFrame = new DepositoFrame("Depositar", minhaConta);
    SaqueFrame saqueFrame = new SaqueFrame("Sacar");

    JLabel saldoLabel = new JLabel();
    JLabel depositoLabel = new JLabel();
    JLabel sacarLabel = new JLabel();

    public InicioFrame(String titulo){
        super(titulo);
        setSize(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridBagLayout());
        adicionarComponentes();
        setLocationRelativeTo(null);

    }

    public void adicionarComponentes(){
        GridBagConstraints c = new GridBagConstraints();

        c.gridx = 0;
        c.gridy = 1;
        add(saldoLabel, c);

        c.gridx = 1;
        c.gridy = 1;
        add(saldoButton, c);

        c.gridx = 0;
        c.gridy = 2;
        add(depositoLabel, c);

        c.gridx = 1;
        c.gridy = 2;
        add(depositoButton, c);

        c.gridx = 0;
        c.gridy = 3;
        add(sacarLabel, c);

        c.gridx = 1;
        c.gridy = 3;
        add(sacarButton, c);

        saldoButton.addActionListener(e -> saldoFrame.setVisible(true));

        depositoButton.addActionListener(e -> depositoFrame.setVisible(true));

        sacarButton.addActionListener(e -> saqueFrame.setVisible(true));
    }
}