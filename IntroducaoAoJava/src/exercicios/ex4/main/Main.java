package exercicios.ex4.main;

import exercicios.ex4.classes.Agenda;
import exercicios.ex4.classes.Contato;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        // Definindo o Locale, apesar de não ser estritamente necessário aqui:
        Locale.setDefault(Locale.US);

        // Instanciando contatos:
        Contato haruo = new Contato(
                "Fábio Haruo",
                "+55 (34) 99838-5906",
                "fabio.nishioka@estudante.iftm.edu.br"
        );

        Contato alexandre = new Contato(
                "Alexandre Vilarinho",
                "+55 (34) 99676-6889",
                "alexandre.vilarinho@iftm.edu.br"
        );  // PS: não sei qual o seu email, então inventei esse aqui

        // Instanciando a agenda:
        Agenda agenda = new Agenda();

        // Adicionando os contatos à agenda:
        agenda.add(haruo, alexandre);
        System.out.println(agenda.getAgenda());

        // Testando os método de busca:
        Integer[] indexes = agenda.search(haruo, new Contato("a", "b", "c"));
        int index = agenda.search(alexandre);
        for (int i : indexes) System.out.print(i + " ");
        System.out.println(index);

        // Testando o método de remoção:
        agenda.pop(alexandre, haruo);
        agenda.pop(new Contato("d", "e", "f"));
        System.out.println(agenda.getAgenda());
    }
}
