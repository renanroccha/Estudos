package school.sptech;

public class Main {
    public static void main(String[] args) {

        Aluno aluno1 = new Aluno("Maria", 10.0, 9.0);

        System.out.println(aluno1);

        AlunoPos aluno2 = new AlunoPos("Eduarda", 10.0, 9.0, 8.0);
        System.out.println(aluno2);
    }
}