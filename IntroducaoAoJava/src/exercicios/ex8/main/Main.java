package exercicios.ex8.main;

import exercicios.ex8.classes.ConversorMoedas;

import java.util.Locale;

public class Main {
    public static void main(String[] args) throws Exception {
        // Definindo o Locale:
        Locale.setDefault(Locale.US);

        // Instanciando o conversor:
        ConversorMoedas conversor = new ConversorMoedas();

        // Convertendo valores:
        double realParaReal = conversor.converter(300, "R$", "R$");
        double realParaDolar = conversor.converter(300, "R$", "U$");
        double realParaEuro = conversor.converter(300, "R$", "E$");

        double dolarParaReal = conversor.converter(400, "U$", "R$");
        double dolarParaDolar = conversor.converter(400, "U$", "U$");
        double dolarParaEuro = conversor.converter(400, "U$", "E$");

        double euroParaReal = conversor.converter(500, "E$", "R$");
        double euroParaDolar = conversor.converter(500, "E$", "U$");
        double euroParaEuro = conversor.converter(500, "E$", "E$");

        // Imprimindo as conversões feitas:
        System.out.printf(
            """
            300 reais para:
            Real: %,.2f
            Dólar: %,.2f
            Euro: %,.2f
            
            400 dólares para:
            Real: %,.2f
            Dólar: %,.2f
            Euro: %,.2f
            
            500 euros para:
            Real: %,.2f
            Dólar: %,.2f
            Euro: %,.2f
            """,
            realParaReal, realParaDolar, realParaEuro,
            dolarParaReal, dolarParaDolar, dolarParaEuro,
            euroParaReal, euroParaDolar, euroParaEuro
        );
    }
}
