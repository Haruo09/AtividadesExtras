package exercicios.ex6.classes;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoCompras {
    List<Produto> carrinho = new ArrayList<>();

    /*
    * Aqui, a lógica é literalmente a mesma dos 3
    * exercícios anteriores. A única diferença é
    * que aqui temos um método a mais, que serve
    * para calcular o valor total do carrinho, mas
    * de resto é idêntico.
    * */

    public void add(Produto... produtos) {
        for (Produto produto : produtos)
            if (!carrinho.contains(produto)) {
                carrinho.add(produto);
            }
            else {
                int i = carrinho.indexOf(produto);
                carrinho
                    .get(i)
                    .setQuantidade(
                        produto.getQuantidade() +
                        carrinho.get(i).getQuantidade()
                    );
            }
    }

    public void pop(Produto... produtos) {
        for (Produto produto : produtos)
            carrinho.remove(produto);
    }

    public int search(Produto produto) {
        return carrinho.indexOf(produto);
    }

    public int[] search(Produto... produtos) {
        int[] indexes = new int[produtos.length];
        for (int i = 0; i < produtos.length; i++) {
            indexes[i] = carrinho.indexOf(produtos[i]);
        }
        return indexes;
    }

    public double getTotal() {
        double soma = 0;
        for (Produto produto : this.carrinho) {
            soma += produto.getPreco() * produto.getQuantidade();
        }

        return soma;
    }

    public List<Produto> getCarrinho() {
        return carrinho;
    }
}
