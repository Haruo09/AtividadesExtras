package exercicios.ex2.main;

import exercicios.ex2.classes.ConversorUnidades;

import java.util.HashMap;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        // Definindo o Locale:
        Locale.setDefault(Locale.US);

        // Instanciando o conversor:
        ConversorUnidades conversor = new ConversorUnidades();

        // Realizando conversões:
        System.out.printf("%,f%n", conversor.converter(1, "cm", "m"));
        System.out.printf("%,f%n", conversor.converter(1, "hm", "M"));
        System.out.printf("%,f%n", conversor.converter(25, "km", "mm"));

        // Tentando realizar uma conversão impossível:
        System.out.printf("%,f%n", conversor.converter(25, "km", "mmm"));
    }
}
