package exercicios.ex3.classes;

public class Tarefa {
    // Atributos:
    private String nome;
    private String descricao;
    private String status;

    public Tarefa(String nome, String descricao, String status) {
        this.nome = nome;
        this.descricao = descricao;
        this.status = status;
    }

    // Método toString():
    public String toString() {
        return String.format(
            """
            
            Nome: %s
            Descrição: %s
            Status: %s
            """,
            this.nome, this.descricao, this.status
        );
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
