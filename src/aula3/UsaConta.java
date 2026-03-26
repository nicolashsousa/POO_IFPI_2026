package aula3;

public class UsaConta {
    public static void main(String[] args) {
        Conta minhaConta = new Conta();

        minhaConta.setTitular("Fulano");
        minhaConta.depositar(1000);
        minhaConta.sacar(370);
        minhaConta.equals(minhaConta);

        System.out.println("Conta: "+minhaConta.getTitular());
        System.out.println("Saldo: "+minhaConta.getSaldo()+" R$");
    }
}