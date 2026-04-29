package contabancaria;

public class TesteConta {
    public static void main(String[] args) {
        ContaBancaria p1 = new ContaBancaria("Nícolas Henrique", 10);

        p1.depositar(1000);
        p1.sacar(450);

        System.out.println(p1);
    }
}