package exercicios.ex6.main;

import exercicios.ex6.classes.AgendaNotas;
import exercicios.ex6.classes.Nota;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        // Definindo o Locale:
        Locale.setDefault(Locale.US);

        // Instanciando notas:
        Nota pessoal = new Nota(
            "NOTAS PESSOAIS",
            """
            1. Não se esqueça de quem você é;
            2. Não deixe ninguém te derrubar;
            3. Sempre haverá alguém melhor que você;
            4. Não desista."""
        );

        Nota escolar = new Nota(
            "NOTAS ESCOLARES",
            """
            1. Terminar o caderno de artista;
            2. Terminar o auto retrato;
            3. Estudar para a prova de química;
            4. Terminar as listas de Programação."""
        );

        Nota familiar = new Nota(
            "NOTAS FAMILIARES",
            """
            1. Jamais esqueça da sua educação;
            2. Seja sempre grato ao teu pai e tua mãe, principalmente tua mãe;
            3. Honrai tua família, por pior que ela seja (não é meu caso)."""
        );

        // Instanciando a agenda de notas:
        AgendaNotas agenda = new AgendaNotas(pessoal, escolar);

        // Litando as notas:
        agenda.listarNotas();

        // Editando uma nota:
        agenda.editarNota(
            escolar,
            null, // caso o parâmetro seja "null", o valor não será alterado.
            """
            1. Terminar o caderno de artista;
            2. Terminar o auto retrato;
            3. Terminar as listas de Programção."""
        );
        agenda.listarNotas();

        // Tentando editar uma nota inexistente:
        agenda.editarNota(
            new Nota("a", "lorem ipsum"),
            "b",
            "dolor sit amet"
        );  // Erro: nota não encontrada.

        // Adicionando uma nova nota:
        agenda.adicionarNota(familiar);
        agenda.listarNotas();
    }
}
