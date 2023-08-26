package exercicios.ex10.classes;

public class Aluno {
    String nome;
    int idade;
    double nota;

    public Aluno(String nome, int idade, double nota) {
        this.nome = nome;
        this.idade = idade;
        this.nota = nota;
    }

    public String toString() {
        return String.format(
            """
            Aluno: %s
            Idade: %d
            Nota: %,.2f
            """, nome, idade, nota
        );
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }
}
