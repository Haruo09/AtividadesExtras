package exercicios.ex4.main;

import exercicios.ex4.classes.Loja;
import exercicios.ex4.classes.Produto;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        // Definindo o Locale:
        Locale.setDefault(Locale.US);

        // Instanciando produtos:
        Produto paoDeQueijo = new Produto("Pão de Queijo", 5.00);
        Produto frangoAssado = new Produto("Frango Assado", 12.00);
        Produto torneira = new Produto("Torneira", 25.99);
        Produto bone = new Produto("Boné", 5_789.90);
        Produto cadeira = new Produto("Cadeira", 45.30);

        // Instanciando a loja:
        Loja lojinhaDaEsquina = new Loja();
        lojinhaDaEsquina.importarProduto(paoDeQueijo, 20);
        lojinhaDaEsquina.importarProduto(frangoAssado, 5);
        lojinhaDaEsquina.importarProduto(torneira, 10);
        lojinhaDaEsquina.importarProduto(bone, 1);
        lojinhaDaEsquina.importarProduto(cadeira, 30);

        // Imprimindo o estoque:
        lojinhaDaEsquina.imprimirEstoque();

        // Vendendo um produto:
        lojinhaDaEsquina.exportarProduto(bone, 1);
        lojinhaDaEsquina.imprimirEstoque();  // boné removido do estoque

        // Tentando vender mais do que disponível no estoque:
        lojinhaDaEsquina.exportarProduto(paoDeQueijo, 125_489);  // Erro: Estoque insuficiente.
        lojinhaDaEsquina.imprimirEstoque();
    }
}
