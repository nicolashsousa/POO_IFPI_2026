package aula4.aluno2;

public class Aluno {
    private String nome;
    private double media, qualitativo;
    private int totalDeFaltas;

    public Aluno(String nome){
        this.nome = nome;
        this.media = 2;
        this.qualitativo = 2;
        this.totalDeFaltas = 0;
    }

    public void adicionarFaltas(int quantidade){
        this.totalDeFaltas += quantidade;
        this.qualitativo -= 0.1*quantidade;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

    public void setMedia(double media){
        this.media = media;
    }

    public double getNotaFinal(){
        if ((this.media + this.qualitativo) > 10){
            return 10;
        }

        return this.media + this.qualitativo;
    }

    public String calcularSituacao(){
        if (this.media + this.qualitativo >= 7 && this.totalDeFaltas < 10) {
            return "aprovado";
        } else {
            return "reprovado";
        }
    }
}