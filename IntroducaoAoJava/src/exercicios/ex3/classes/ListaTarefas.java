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
        /* ListaTarefas.add(Tarefa... tarefas) -> void;
         *
         * Este método insere, de forma ordenada, novas tarefas na lista.
         * A inserção é feita por um algoritmo derivado do binarySearch,
         * e a razão para esta implementação é muito simples: melhorar a
         * eficiência do código, apesar de não ser algo necessário neste
         * caso, pois não serão armazenados enormes quantidades de
         * informações neste pequeno banco de dados. Mesmo assim, foi
         * legal redesenhar o algoritmo binarySearch para atender à
         * demanda do enunciado.
         * */


        for (Tarefa tarefa : tarefas) {
            int inicio = 0;
            int fim = listaTarefas.size() - 1;

            if (this.search(tarefa) == -1) {
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
        /* ListaTarefas.pop(Tarefa... tarefas) -> void;
        *
        * Este método não precisa de sobrecarga, visto que
        * não possui retorno. Note também que o método
        * remove() da classe ArrayList não estoura nenhuma
        * exceção caso a tarefa passada como argumento não
        * esteja cadastrada no banco de dados da instância.
        * */

        for (Tarefa tarefa : tarefas) {
            listaTarefas.remove(tarefa);
        }
    }

    public int search(Tarefa tarefa) {
        /* ListaTarefas.search(Tarefa tarefa) -> int;
        *
        * Semelhante ao método abaixo, a diferença primordial
        * para que esta sobrecarga tenha sido criada é que
        * este, ao contrário do outro método search, retorna
        * apeas um simples int ao invés de um array de uma
        * posição.
        * */

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
        /* ListaTarefas.search(Tarefa... tarefas) -> Integer[];
        *
        * Esse método usa o algoritmo binarySearch para buscar
        * objetos dentro do ArrayList. Em seguida, retorna uma lista
        * com os índices de cada tarefa passada como argumento,
        * respetivamente. Caso a tarefa não seja encontrada,
        * o índice -1 será adicionado a esta lista.
        * */

        List<Integer> indexes = new ArrayList<>();
        /* Implementação simples, com complexidade O(n):

        for (Tarefa tarefa : tarefas) {
            int index = listaTarefas.indexOf(tarefa);
        }
        */

        // Implementação BinarySearch, com complexidade O(log₂n);
        for (Tarefa tarefa : tarefas) {
            int inicio = 0;
            int fim = listaTarefas.size() - 1;
            int meio;

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
                } else if (tarefa.equals(listaTarefas.get(meio))) {
                    indexes.add(meio);
                    break;
                }
            }

            indexes.add(-1);
        }

        return indexes.toArray(new Integer[0]);
    }

    // Getter criado para garantir acesso às tarefas cadastradas.
    public List<Tarefa> getListaTarefas() {
        return listaTarefas;
    }
}
