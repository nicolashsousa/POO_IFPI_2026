package aula4.conta;

public class UsaConta {
    public static void main(String[] args) {
        Conta minhaConta = new Conta(5);
        
        minhaConta.depositar(100);
        minhaConta.sacar(50);

        System.out.println("Saldo: "+minhaConta.getSaldo()+" R$");
    }
}