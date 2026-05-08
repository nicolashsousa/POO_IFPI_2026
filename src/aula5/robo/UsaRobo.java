package aula5.robo;

public class UsaRobo {
    public static void main(String[] args) {
        Robo r1 = new Robo();
        Robo r2 = new Robo();
        Robo r3 = new Robo();

        System.out.println("R1: " + r1.getNumeroDeSerie());
        System.out.println("R2: " + r2.getNumeroDeSerie());
        System.out.println("R3: " + r3.getNumeroDeSerie());
    }
}