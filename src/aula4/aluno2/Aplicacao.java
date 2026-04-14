package aula4.aluno2;

public class Aplicacao {
    public static void main(String[] args) {
        Aluno a1 = new Aluno("Nícolas Henrique");

        a1.setMedia(9);
        a1.adicionarFaltas(5);
        
        String msg = "Aluno \n"+"Nome: "+a1.getNome() +"\nMedia = "+a1.getNotaFinal() +"\nSituação: "+ a1.calcularSituacao();

        System.out.println(msg);
    }
}