package exercicios.ex3.classes;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {
    // Atributos:
    List<Tarefa> listaTarefas = new ArrayList<>();

    // Construtor:
    public ListaTarefas(List<Tarefa> listaTarefas) {
        this.listaTarefas = listaTarefas;
    }

    public ListaTarefas() {
        // Construtor vazio
    }

    // Métodos Públicos da Classe:
    public void add(Tarefa... tarefas) {
        for (Tarefa tarefa : tarefas) {
            int inicio = 0;
            int fim = listaTarefas.size() - 1;

            if (this.search(tarefa) != -1) {
                try {
                    insertionLoop: while (inicio <= fim) {
                        int meio = (inicio + fim) / 2;
                        int compare = listaTarefas
                                .get(meio)
                                .getNome()
                                .compareTo(tarefa.getNome());

                        if (compare > 0) {
                            fim = meio - 1;
                        }
                        else if (compare < 0) {
                            inicio = meio + 1;
                        }
                        else {
                            listaTarefas.add(meio, tarefa);
                            break insertionLoop;
                        }
                    }
                } catch (IndexOutOfBoundsException exception) {
                    // catch para não estourar um erro.
                } finally {
                    if (inicio > fim) {
                        listaTarefas.add(inicio, tarefa);
                    }
                }
            }

            else {
                System.out.println("\u001b[1;31mErro: Tarefa já cadastrada.\u001b[m");
            }
        }
    }

    public void pop(Tarefa... tarefas) {
        for (Tarefa tarefa : tarefas) {
            listaTarefas.remove(tarefa);
        }
    }

    public int search(Tarefa tarefa) {
        int inicio, fim, meio;
        inicio = 0;
        fim = listaTarefas.size() - 1;

        while (inicio <= fim) {
            meio = (inicio + fim)/2;
            int compare = listaTarefas
                    .get(meio)
                    .getNome()
                    .compareTo(tarefa.getNome());

            if (compare > 0) {
                fim = meio - 1;
            }
            else if (compare < 0) {
                inicio = meio + 1;
            }
            else {
                return meio;
            }
        }

        return -1;
    }

    public Integer[] search(Tarefa... tarefas) {
        List<Integer> indexes = new ArrayList<>();
        /* Implementação simples, com complexidade O(n):

        for (Tarefa tarefa : tarefas) {
            int index = listaTarefas.indexOf(tarefa);
        }
        */

        // Implementação BinarySearch, com complexidade log²(n);
        for (Tarefa tarefa : tarefas) {
            int inicio = 0;
            int fim = listaTarefas.size() - 1;
            int meio;

            searchLoop:
            while (inicio <= fim) {
                meio = (inicio + fim) / 2;

                int compare = listaTarefas
                        .get(meio)
                        .getNome()
                        .compareTo(tarefa.getNome());

                if (compare > 0) {
                    fim = meio - 1;
                } else if (compare < 0) {
                    inicio = meio + 1;
                } else {
                    indexes.add(meio);
                    break searchLoop;
                }
            }
        }

        return indexes.toArray(new Integer[indexes.size()]);

    }
}
