package exercicios.ex4.classes;

public class Produto {
    /*
    * Não adicionei nenhum atributo "quantidade" aqui,
    * por questões de coesão. Um objeto é único, e por
    * mais que vários objetos iguais podem ser instanciados
    * ou até mesmo um único objeto represente vários outros
    * neste caso, faz mais sentido pensar em 'quantidade'
    * no Estoque, e especializar esta classe apenas com
    * atributos principais de um produto.
    * */
    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String toString() {
        return String.format(
            """
            Produto: %s
            Preço: %,.2f""", nome, preco
        );
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }
}
