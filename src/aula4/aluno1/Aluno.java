package aula4.aluno1;

public class Aluno {
    private String nome;
    private double media;

    public Aluno(String nome){
        this.nome = nome;
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

    public double getMedia(){
        return media;
    }

    public String calcularSituacao(double media){
        if (media >= 7) {
            return "aprovado";
        } else {
            return "reprovado";
        }
    }
}