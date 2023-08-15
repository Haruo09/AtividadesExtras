package exercicios.ex5.classes;

import java.util.ArrayList;
import java.util.List;

public class Banco {
    private final List<ContaBancaria> contas = new ArrayList<>();

    /*
    * Por questões de "preciso terminar logo este trabalho",
    * os algoritmos utilizados nesta classe serão mais simples
    * do que os utilizados nos exercícios 4 e 5.
    * */

    public void add(ContaBancaria... contas) {
        for (ContaBancaria conta : contas)
            if (!this.contas.contains(conta))
                this.contas.add(conta);
            else
                System.out.println("Erro: conta já cadastrada.");
    }

    public void pop(ContaBancaria... contas) {
        for (ContaBancaria conta : contas)
            this.contas.remove(conta);
    }

    public int search(ContaBancaria conta) {
        return this.contas.indexOf(conta);
    }

    public int[] search(ContaBancaria... contas) {
        int[] indexes = new int[contas.length];
        for (int i = 0; i < contas.length; i++)
            indexes[i] = this.contas.indexOf(contas[i]);

        return indexes;
    }

    // método getter para retornar as contas cadastradas:
    public List<ContaBancaria> getContas() {
        return contas;
    }
}
