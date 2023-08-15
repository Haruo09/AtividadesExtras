package exercicios.ex4.classes;

import exercicios.ex3.classes.Tarefa;

import java.util.ArrayList;
import java.util.List;

public class Agenda {
    // Atributos:
    List<Contato> agenda = new ArrayList<>();

    // Construtor:
    public Agenda(List<Contato> agenda) {
        this.agenda = agenda;
    }

    public Agenda() {
        // Construtor vazio;
    }

    /*
    * Não irei criar comentários detalhados explicando
    * cada método aqui, pois a ideia é idêntica à do
    * exercício anterior. A única coisa que muda são
    * os objetos tratados, mas o algoritmo é idêntico.
    * */

    // Métodos públicos:
    public void add(Contato... contatos) {
        for (Contato contato : contatos) {
            int inicio = 0;
            int fim = agenda.size() - 1;

            if (this.search(contato) == -1) {
                try {
                    insertionLoop:
                    while (inicio <= fim) {
                        int meio = (inicio + fim) / 2;
                        int compare = agenda
                            .get(meio)
                            .getEmail()
                            .compareTo(contato.getEmail());

                        if (compare > 0) {
                            fim = meio - 1;
                        }
                        else if (compare < 0) {
                            inicio = meio + 1;
                        }
                        else {
                            agenda.add(meio, contato);
                            break insertionLoop;
                        }
                    }
                } catch (IndexOutOfBoundsException exception) {
                    // catch para não estourar um erro.
                } finally {
                    if (inicio > fim) {
                        agenda.add(inicio, contato);
                    }
                }
            }

            else {
                System.out.println("\u001b[1;31mErro: Contato já cadastrado.\u001b[m");
            }
        }
    }

    public void pop(Contato... contatos) {
        for (Contato contato : contatos) {
            agenda.remove(contato);
        }
    }

    public Integer[] search(Contato... contatos) {
        List<Integer> indexes = new ArrayList<>();
        for (Contato contato : contatos) {
            boolean added = false;
            int inicio = 0;
            int fim = agenda.size() - 1;
            int meio;

            while (inicio <= fim) {
                meio = (inicio + fim) / 2;

                int compare = agenda
                        .get(meio)
                        .getEmail()
                        .compareTo(contato.getEmail());

                if (compare > 0) {
                    fim = meio - 1;
                } else if (compare < 0) {
                    inicio = meio + 1;
                } else if (contato.equals(agenda.get(meio))) {
                    indexes.add(meio);
                    added = true;
                    break;
                }
            }

            if (!added) indexes.add(-1);
        }

        return indexes.toArray(new Integer[0]);
    }

    public int search(Contato contato) {
        int inicio, fim, meio;
        inicio = 0;
        fim = agenda.size() - 1;

        while (inicio <= fim) {
            meio = (inicio + fim)/2;
            int compare = agenda
                .get(meio)
                .getEmail()
                .compareTo(contato.getEmail());
            if (compare > 0) {
                fim = meio - 1;
            }
            else if (compare < 0) {
                inicio = meio + 1;
            }
            else if (contato.equals(agenda.get(meio))) {
                return meio;
            }
        }

        return -1;
    }

    public List<Contato> getAgenda() {
        return agenda;
    }
}
