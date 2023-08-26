package exercicios.ex3.main;

import exercicios.ex3.classes.AgendaContatos;
import exercicios.ex3.classes.CategoriaContatos;
import exercicios.ex3.classes.Contato;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        // Definindo o Locale:
        Locale.setDefault(Locale.US);

        // Instanciando Contatos:
        Contato haruo = new Contato("Eu", "(34) 9838-5906");
        Contato duda = new Contato("Duda", "(34) 9686-9343");
        Contato otavio = new Contato("Otávio", "(34) 9877-8864");
        Contato anderson = new Contato("Anderson", "(34) 9656-0226");
        Contato alexandre = new Contato("Prof. Alexandre", "(34) 9676-6889");
        Contato andre = new Contato("Prof. André Chaves", "(34) 9814-2972");
        Contato mae = new Contato("Mãe<3", "(34) 8400-2572");
        Contato elaine = new Contato("Tia Elaine", "(34) 9696-8681");

        // Instanciando categorias:
        CategoriaContatos professores = new CategoriaContatos("Professores", alexandre, andre);
        CategoriaContatos pessoais = new CategoriaContatos("Pessoais", haruo, duda);
        CategoriaContatos amigos = new CategoriaContatos("Amigos", otavio, anderson);
        CategoriaContatos familia = new CategoriaContatos("Família", mae, elaine);

        // Instanciando a Agenda:
        AgendaContatos agenda = new AgendaContatos(professores, pessoais, amigos, familia);

        // Listando as categorias:
        agenda.listarCategorias();

        // Listando os contatos:
        agenda.listarContatos();
    }
}
