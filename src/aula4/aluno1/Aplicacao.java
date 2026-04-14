package aula4.aluno1;

public class Aplicacao {
    public static void main(String[] args) {
        Aluno a1 = new Aluno("Nicolas");

        a1.setMedia(8);
        double media = a1.getMedia();
        
        String msg = "Aluno \n"+"Nome: "+a1.getNome() + "\n" + "Situação: "+ a1.calcularSituacao(media);

        System.out.println(msg);
    }
}