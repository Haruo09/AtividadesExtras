package exercicios.ex4.classes;

public class Loja {
    private final Estoque estoque = new Estoque();  // relacionei diretamente a loja com o estoque.

    public Loja(Produto... produtos) {
        estoque.adicionarProdutos(produtos);
    }

    public Loja() {
        // construtor vazio.
    }

    public void importarProduto(Produto produto, int quantidade) {
        estoque.adicionarProdutos(produto, quantidade);
    }

    public void exportarProduto(Produto produto, int quantidade) {
        estoque.removerProdutos(produto, quantidade);
    }

    public Estoque getEstoque() {
        return estoque;
    }

    public void imprimirEstoque() {
        System.out.println(this.getEstoque());
    }
}
