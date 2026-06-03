package aula9;

public class UsaConta {
    public static void main(String[] args) {
        Conta c1 = new Conta(1, 100);
        ContaCorrente c2 = new ContaCorrente(2, 200, 50.3);
        ContaPoupanca c3 = new ContaPoupanca(3, 300, 0.05);

        c1.depositar(3000);
        c2.depositar(2000);
        c3.depositar(1000);

        c1.sacar(200);
        c2.sacar(400);
        c3.sacar(600);

        System.out.print(c1+"\n");
        System.out.println(c2);
        System.out.println(c3);

        c2.cobrarTaxa();
        System.out.println(c2.getSaldo());

        c3.render();
        System.out.println(c3.getSaldo());
    }
}