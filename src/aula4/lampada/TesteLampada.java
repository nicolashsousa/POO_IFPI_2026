package aula4.lampada;

public class TesteLampada {
    public static void main(String[] args) {
        Lampada laboratorio = new Lampada(true);
        laboratorio.acender();
        laboratorio.apagar();
        laboratorio.mostraEstado();  
    }
}