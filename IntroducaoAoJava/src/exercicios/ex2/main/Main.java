package exercicios.ex2.main;

import exercicios.ex2.classes.ConversorTemperatura;

import java.util.Locale;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // Definindo o Locale:
        Locale.setDefault(Locale.US);

        // Instanciando um objeto Random:
        Random r = new Random();

        // Instanciando o conversor:
        ConversorTemperatura conversor = new ConversorTemperatura();

        // Obtendo uma temperatura aleatória em Celsius:
        double celsius = r.nextDouble(-273.15, 301);

        // Obtendo uma temperatura aleatória em Fahrenheit:
        double fahrenheit = r.nextDouble(-459.67, 301);

        // Imprimindo os valores obtidos:
        System.out.printf("Celsius: %.2f%n", celsius);
        System.out.printf("Fahrenheit: %.2f%n%n", fahrenheit);

        // Convertendo as temperaturas:
        double convertedCelsius = conversor.toCelsius(fahrenheit);
        double convertedFahrenheit = conversor.toFahrenheit(celsius);

        // Imprimindo os resultados na tela:
        System.out.printf("%.2f °C = %.2f °F%n", celsius, convertedFahrenheit);
        System.out.printf("%.2f °F = %.2f °C%n", fahrenheit, convertedCelsius);
    }
}
