package exercicios.ex9.classes;

public class Curso {
    private String nomeCurso;
    private String instrutor;
    private int numEstudantes;
    private String agenda;

    public Curso(String nomeCurso, String instrutor, int numEstudantes, String agenda) {
        this.nomeCurso = nomeCurso;
        this.instrutor = instrutor;
        this.numEstudantes = numEstudantes;
        this.agenda = agenda;
    }

    public void adicionarEstudantes(int estudantes) {
        numEstudantes += estudantes;
    }

    public void removerEstudantes(int estudantes) {
        if (estudantes > numEstudantes) return;
        else numEstudantes -= estudantes;
    }
}
