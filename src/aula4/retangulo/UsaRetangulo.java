package aula4.retangulo;

public class UsaRetangulo {
    public static void main(String[] args) {
        Retangulo quadra = new Retangulo(10, 5);

        System.out.println("Altura 1 = " + quadra.getAltura());
        System.out.println("Base 1 = " + quadra.getBase());
        System.out.println("Area 1 = " + quadra.calcularArea());

        quadra.setAltura(20);
        quadra.setBase(10);
        System.out.println("\nAltura 2 = " + quadra.getAltura());
        System.out.println("Base 2 = " + quadra.getBase());
        System.out.print("Area 2 = " + quadra.calcularArea());
    }
}
