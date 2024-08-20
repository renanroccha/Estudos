package school.sptech;

    // AlunoPos vai herdar do Aluno
    // precisa inicializar os atributos do Aluno, ou seja, precisa de um construtor que estao definidos no Aluno
    // superclasse, subclase

public class AlunoPos extends Aluno {

    private Double notaTcc;

    public AlunoPos(String nome, Double notaAtividade, Double notaAvaliacao, Double notaTcc) {
        super(nome, notaAtividade, notaAvaliacao);
        this.notaTcc = notaTcc;

    }

    //  CTRL + O aparece todos os metodos que qr sobre escrever
    // poliformismo - metodo se comporta de duas formas

    @Override
    public Double calcularNotaFinal(){
        return (this.getNotaAtividade() * 0.2) + (this.getNotaAvaliacao() * 0.2) + (this.notaTcc * 0.6);
    }

    public Double getNotaTcc() {
        return notaTcc;
    }

    public void setNotaTcc(Double notaTcc) {
        this.notaTcc = notaTcc;
    }

    @Override
    public String toString() {
        return "AlunoPos{" +
                "notaTcc=" + notaTcc +
                "} " + super.toString();
    }
}
