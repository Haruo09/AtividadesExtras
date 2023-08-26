package exercicios.ex3.classes;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class CategoriaContatos {
    private String nome;
    private final List<Contato> contatoList = new LinkedList<>();
    /*
     * Como o foco será inserção e remoção, e a listagem será de
     * todos os itens, a LinkedList terá melhor desempenho do que
     * a ArrayList.
     */

    public CategoriaContatos(String nome) {
        this.nome = nome;
    }

    public CategoriaContatos(String nome, Contato... contatos) {
        contatoList.addAll(Arrays.asList(contatos));
        this.nome = nome;
    }

    public void adicionarContatos(Contato... contatos) {
        contatoList.addAll(Arrays.asList(contatos));
    }

    public void removerContatos(Contato... contatos) {
        contatoList.removeAll(Arrays.asList(contatos));
    }

    public void listarContatos() {
        System.out.println("[");
        for (Contato contato : contatoList) {
            System.out.println(contato.toString().indent(4));
        }
        System.out.println("]");
    }

    public String getContatos() {
        StringBuilder list = new StringBuilder("[");
        int size = contatoList.size();
        for (int i = 0; i < size; i++) {
            list.append(String.format("\n%s", contatoList.get(i)).indent(4));
            if (i <= size - 1) list.append("\n,".indent(4));
        }
        list.append("]");

        return list.toString();
    }

    public List<Contato> getContatoList() {
        return contatoList;
    }

    public String getNome() {
        return nome;
    }
}
