package Aula_3.Exemplos;

public class UsaAvaliacaoFisica {
    public static void main(String[] args) {
        AvaliacaoFisica Fulano = new AvaliacaoFisica();

        Fulano.setAtributos(1.80, 90);
        System.out.println(Fulano.getAltura());
        System.out.println(Fulano.getPeso());
        System.out.println(Fulano.IMC());
    }
}