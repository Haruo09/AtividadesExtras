package exercicios.ex9.main;

import exercicios.ex9.classes.AgendaCompromissos;
import exercicios.ex9.classes.Compromisso;

import java.time.LocalTime;
import java.time.LocalDate;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        // Definindo o Locale:
        Locale.setDefault(Locale.US);

        // Instanciando os compromissos:
        Compromisso listaExtra = new Compromisso(
            LocalDate.of(2023, 8, 30),
            LocalTime.of(23, 59, 59),
            "Entrega da Lista Extra do prof Alexandre"
        );

        Compromisso expFisica = new Compromisso(
            LocalDate.of(2023, 8, 18),
            LocalTime.of(9, 10, 0),
            "Apresentação dos Experimentos de Física durante o Intervalo."
        );

        // Instanciando um objeto agenda:
        AgendaCompromissos agenda = new AgendaCompromissos();

        // Agendando os compromissos:
        agenda.agendar(listaExtra, expFisica);

        // Listando os compromissos:
        agenda.listar();
    }
}
