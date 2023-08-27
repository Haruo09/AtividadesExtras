package exercicios.ex5.main;

import exercicios.ex5.classes.RelogioAlarme;

import java.time.LocalTime;
import java.util.Locale;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        // Definindo o Locale:
        Locale.setDefault(Locale.US);

        // Instanciando o relógio:
        RelogioAlarme relogio = new RelogioAlarme();

        // Settando um alarme:
        relogio.setAlarme(LocalTime.of(18, 17, 40));

        // Executando o relógio:
        relogio.run();
    }
}
