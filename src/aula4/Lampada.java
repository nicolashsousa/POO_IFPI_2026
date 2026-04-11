package aula4;

public class Lampada {
    private boolean estadoDaLampada;

    public Lampada(){
        this.estadoDaLampada = true;
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