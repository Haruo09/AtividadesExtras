package exercicios.ex1.main;

import exercicios.ex1.classes.Retangulo;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        // Definindo o Locale:
        Locale.setDefault(Locale.US);

        // Instanciando um retângulo:
        Retangulo a = new Retangulo(3.0, 4.5);

        // Obtendo a sua área:
        System.out.printf("Área = %.2f%n", a.calcularArea());

        // Obtendo o seu perímetro:
        System.out.printf("Perímetro = %.2f%n", a.calcularPerimetro());
    }
}
