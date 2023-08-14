package exercicios.ex3.main;

import exercicios.ex3.classes.ListaTarefas;
import exercicios.ex3.classes.Tarefa;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        // Definindo o Locale para US (apesar de desnecessário neste exercício):
        Locale.setDefault(Locale.US);

        // Instanciando o objeto ListaTarefas:
        ListaTarefas lista = new ListaTarefas();

        // Criando novas tarefas:
        Tarefa trabFisica = new Tarefa(
                "Experimento de Física",
                "Experimento de física que será realizado dia 18/08",
                "não concluída"
        );

        Tarefa listaAlexandre = new Tarefa(
                "Atividade Extra - Introdução ao Java",
                "Lista de exercícios valendo ponto extra que deve ser entregue até dia 16/08",
                "não concluída"
        );

        Tarefa p2LabDeProgramacao = new Tarefa(
                "P2 - Lab. de Programação",
                "Segunda prova da disciplina de Laboratório de Programação II.",
                "concluída"
        );

        // Inserindo as tarefas na lista:
        lista.add(trabFisica, p2LabDeProgramacao, listaAlexandre);

        // Exibindo as tarefas na tela:
        System.out.println(lista.getListaTarefas());

        // Tentando adicionar uma tarefa já existente:
        lista.add(trabFisica);  // Erro: Tarefa já cadastrada.

        // Buscando uma tarefa existente:
        int index = lista.search(p2LabDeProgramacao);
        System.out.println(index);

        // Buscando uma tarefa inexistente:
        index = lista.search(new Tarefa("a", "b", "não concluída"));
        System.out.println(index);

        // Removendo uma tarefa:
        lista.pop(p2LabDeProgramacao);
        System.out.println(lista.getListaTarefas());

        // Removendo várias tarefas:
        lista.pop(trabFisica, listaAlexandre);
        System.out.println(lista.getListaTarefas());

        // Tentando remover uma tarefa inexistente:
        lista.pop(trabFisica);  // note que nenhuma excessão é ativada;
        System.out.println(lista.getListaTarefas());

    }
}
