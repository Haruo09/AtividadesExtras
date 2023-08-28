package exercicios.ex5.classes;

public class Estudante {
    private String nome;
    private int idade;
    private int idEstudante;
    private double nota;

    public Estudante(String nome, int idade, int idEstudante, double nota) {
        this.nome = nome;
        this.idade = idade;
        this.idEstudante = idEstudante;
        this.nota = nota;
    }

    public double getNota() {
        return nota;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public int getIdEstudante() {
        return idEstudante;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }
}
