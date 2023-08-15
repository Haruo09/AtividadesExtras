package exercicios.ex4.classes;

public class Contato {
    // Atributos:
    private String nome;
    private String telefone;  // ‘String’, pois pode conter "-", "+" e "()".
    private String email;

    // Construtor:
    public Contato(String nome, String telefone, String email) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
    }

    // toString():
    public String toString() {
        return String.format(
            """
            
                Nome: %s
                Telefone: %s
                Email: %s
            """,
            this.nome, this.telefone, this.email
        );
    }

    // Getters and Setters:
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
