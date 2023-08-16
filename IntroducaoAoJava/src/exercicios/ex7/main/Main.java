package exercicios.ex7.main;

import exercicios.ex7.classes.Relogio;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        // Definindo o Locale:
        Locale.setDefault(Locale.US);

        // Instanciando o Relógio:
        Relogio relogio = new Relogio(24, 125, 120);

        // Imprimindo as horas:
        System.out.println(relogio.getHorario());

        // Avançando o tempo:
        relogio.avancarTempo(3, 8, 69);
        System.out.println(relogio.getHorario());
    }
}
