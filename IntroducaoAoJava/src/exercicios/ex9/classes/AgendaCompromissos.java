package exercicios.ex9.classes;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class AgendaCompromissos {
    List<Compromisso> agenda = new ArrayList<>();

    public void agendar(Compromisso... compromissos) {
        for (Compromisso compromisso : compromissos) {
            if (!agenda.contains(compromisso)) agenda.add(compromisso);
            else System.out.println("Erro: Compromisso já agendado.");
        }
    }

    // Neste método, não irei receber mais de um argumento.
    public void editar(
        Compromisso compromisso,
        LocalDate newData,
        LocalTime newTime,
        String newDesc
    ) {
        /*
        * Coloque "null" nos argumentos que não deseja alterar.
        * */

        int i = agenda.indexOf(compromisso);
        if (i == -1) {
            System.out.println("Compromisso não encontrado. Não foi possível editar.");
            return;
        }

        if (newData != null) agenda.get(i).setData(newData);
        if (newTime != null) agenda.get(i).setHorario(newTime);
        if (newDesc != null) agenda.get(i).setDescricao(newDesc);
    }

    public void listar() {
        Compromisso c;
        for (int i = 0; i < agenda.size(); i++) {
            c = agenda.get(i);
            System.out.printf(
                """
                Compromisso %d:
                Data: %s
                Horario: %s
                Descrição: %s%n
                """,
                i + 1,
                c.getData(),
                c.getHorario(),
                c.getDescricao()
            );
        }
    }
}
