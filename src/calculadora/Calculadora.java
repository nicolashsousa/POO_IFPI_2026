package calculadora;

public final class Calculadora {
    private Calculadora() {
        throw new UnsupportedOperationException("Esta é uma classe utilitária e não pode ser instanciada.");
    }

    public static double adicao(double v1, double v2){
        return v1 + v2;
    }

    public static double subtracao(double v1, double v2){
        return v1 - v2;
    }

    public static double multiplicacao(double v1, double v2){
        return v1 * v2;
    }

    public static double divisao(double v1, double v2){
        return v1 / v2;
    }
}
