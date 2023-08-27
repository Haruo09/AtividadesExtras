package exercicios.ex6.classes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AgendaNotas {
    private final List<Nota> agenda = new ArrayList<>();

    public AgendaNotas(Nota... notas) {
        agenda.addAll(Arrays.asList(notas));
    }

    public void listarNotas() {
        System.out.println("[");
        for (Nota nota : agenda) {
            System.out.println(nota.toString().indent(4));
        }
        System.out.println("]");
    }

    public void editarNota(Nota nota, String novoTitulo, String novaDesc) {
        int i = agenda.indexOf(nota);
        if (i == -1) {
            System.out.println("\u001b[1;31mErro: nota não encontrada.\u001b[m");
            return;
        }
        if (novoTitulo == null) {
            novoTitulo = agenda.get(i).getTitulo();
        }
        if (novaDesc == null) {
            novaDesc = agenda.get(i).getConteudo();
        }
        agenda.set(i, new Nota(novoTitulo, novaDesc));
        nota.setTitulo(novoTitulo);
        nota.setConteudo(novaDesc);
    }

    public void adicionarNota(Nota nota) {
        if (!agenda.contains(nota)) agenda.add(nota);
        else System.out.println("\u001b[1;31mErro: nota já armazenada.\u001b[m");
    }
}
