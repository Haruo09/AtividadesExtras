package exercicios.ex6.main;

import exercicios.ex6.classes.CarrinhoCompras;
import exercicios.ex6.classes.Produto;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        // Definindo o Locale:
        Locale.setDefault(Locale.US);

        // Instanciando os produtos:
        Produto celular = new Produto("Celular", 10_000_000, 2);
        Produto fone = new Produto("Fone de Ouvido", 1_200_000, 4);
        /* peguei os exemplos da lista de Encapsulamento,
        *  mas não é plágio pegar código de si mesmo, certo?
        * */

        // Instanciando o carrinho:
        CarrinhoCompras carrinho = new CarrinhoCompras();

        // Adicionando os produtos ao carrinho:
        carrinho.add(celular, fone);

        // Obtendo o valor total do carrinho:
        System.out.printf("Total: R$%,.2f%n", carrinho.getTotal());

        /*
        * A lógica dos outros métodos de busca e remoção é
        * idêntica às dos exercícios anteriores, poratanto
        * não vejo necessidade de testar os métodos de novo.
        * Caso queira testar, é só editar o código e criar
        * os testes.
        * */
    }
}
