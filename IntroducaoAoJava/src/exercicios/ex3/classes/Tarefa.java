package exercicios.ex3.classes;

public class Tarefa {
    // Atributos:
    private String nome;
    private String descricao;
    private String status;

    // Construtor:
    public Tarefa(String descricao, String status) {
        this.descricao = descricao;
        this.status = status;
    }

    // Getters & Setters:
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
