package aula5.conta;

public class TesteConta {
    public static void main(String[] args) {
        Conta c1 = new Conta();
        Conta c2 = new Conta();
        Conta c3 = new Conta();

        c1.depositar(100);
        c2.depositar(150);
        c3.depositar(200);

        c1.sacar(5.0);
        c2.sacar(7.5);
        c3.sacar(10.0);

        System.out.println("Conta " + c1.getNumero() + " saldo: " + c1.getSaldo());
        System.out.println("Conta " + c2.getNumero() + " saldo: " + c2.getSaldo());
        System.out.println("Conta " + c3.getNumero() + " saldo: " + c3.getSaldo());
    }
}