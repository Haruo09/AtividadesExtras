package exercicios.ex6.classes;

public class Produto {
    private String nome;
    private double preco;
    private int quantidade;
    private String sku;

    public Produto(String nome, double preco, int quantidade, String sku) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
        this.sku = sku;
    }

    public double calcularEstoque() {
        return this.quantidade * this.preco;
    }
}
