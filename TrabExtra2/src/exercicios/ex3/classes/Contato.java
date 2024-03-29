package exercicios.ex3.classes;

public class Contato {
    private String nome;
    private String tel;

    public Contato(String nome, String tel) {
        this.nome = nome;
        this.tel = tel;
    }

    public String toString() {
        return String.format(
            """
            Contato: %s
            telefone: %s
            """, nome, tel
        );
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }
}
