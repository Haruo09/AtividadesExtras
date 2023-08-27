package exercicios.ex5.classes;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class RelogioAlarme {
    private LocalTime horaAtual;
    private List<LocalTime> alarmes = new ArrayList<>();

    public RelogioAlarme() {
        this.horaAtual = LocalTime.now();
    }

    public void atualizarHora() {
        this.horaAtual = LocalTime.now();
    }

    public void setAlarme(LocalTime horario) {
        alarmes.add(horario);
    }

    public void throwAlarm() throws InterruptedException {
        if (
            alarmes.contains(
                LocalTime.parse(
                    LocalTime
                        .now()
                        .format(
                        DateTimeFormatter.ofPattern("HH:mm:ss")
                    )
                )
            )
        ) {
            System.out.println("ALARME!!!");
            Thread.sleep(200);
        }
    }

    public void run() throws InterruptedException {
        while (true) {
            atualizarHora();
            throwAlarm();
        }
    }
}
