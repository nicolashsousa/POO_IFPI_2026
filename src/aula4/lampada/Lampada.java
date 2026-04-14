package aula4.lampada;

public class Lampada {
    private boolean estadoDaLampada;

    public Lampada(boolean valor){
        this.estadoDaLampada = valor;
    }

    public void acender(){
        this.estadoDaLampada = true;
    }

    public void apagar(){
        this.estadoDaLampada = false;
    }

    public void mostraEstado(){
        if (estadoDaLampada) {
            System.out.println("Acesa");
        } else {
            System.out.println("Apagada");
        }
    }
}