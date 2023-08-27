package exercicios.ex4.classes;

import java.util.HashMap;
import java.util.Map;

public class Estoque {
    /*
    * Este dicionário armazenará os produtos em estoque na sua keySet
    * e a quantidade disponível em estoque nos seus respectivos valores.
    * */
    private final Map<Produto, Integer> estoque = new HashMap<>();

    public String toString() {
        StringBuilder s = new StringBuilder();
        for (Produto p : estoque.keySet()) {
            s.append(p.toString()).append(String.format("\nQuandidade: %d%n%n", estoque.get(p)));
        }

        return s.toString();
    }

    public void adicionarProdutos(Produto... produtos) {
        for (Produto p : produtos) {
            if (!estoque.containsKey(p)) {
                estoque.put(p, 0);
            }
            else {
                int v = estoque.get(p);
                estoque.replace(p, v, v+1);
            }
        }
    }

    public void adicionarProdutos(Produto produto, int quantidade) {
        if (!estoque.containsKey(produto)) {
            estoque.put(produto, quantidade);
        }
        else {
            int v = estoque.get(produto);  // armazenei em uma variável separada por questões de otimização.
            estoque.replace(produto, v, v+1);
        }
    }

    public void removerProdutos(Produto produto, int quantidade) {
        if (!estoque.containsKey(produto)) {
            System.out.println("\u001b[1;31mErro: Produto não encontrado no estoque.\u001b[m");
        }
        else if (estoque.get(produto) < quantidade) {
            System.out.println("\u001b[1;31mErro: Estoque insuficiente.\u001b[m");
        }
        else if (estoque.get(produto) == quantidade) {
            estoque.remove(produto);
        }
        else {
            int q = estoque.get(produto);
            estoque.replace(produto, q, q - quantidade);
        }
    }

    public void removerProdutos(Produto produto) {
        if (!estoque.containsKey(produto)) {
            System.out.println("\u001b[1;31mErro: Produto não encontrado no estoque.\u001b[m");
        }
        else {
            estoque.remove(produto);
        }
    }

    public Map<Produto, Integer> getEstoque() {
        return estoque;
    }
}
