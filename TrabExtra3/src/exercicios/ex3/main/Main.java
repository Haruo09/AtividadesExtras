package exercicios.ex3.main;

import exercicios.ex3.classes.Carro;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        // Definindo o Locale:
        Locale.setDefault(Locale.US);

        // Instanciando o objeto Carro:
        Carro carro = new Carro(
            "Uno 4 portas com escada",
            "Fiat",
            1657,
            3_457_867.98
        );

        // Imprimindo as informações do carro:
        System.out.println(carro);

        // Atualizando a quilometragem:
        carro.somarQuilometragem(1_345_980.01234);
        System.out.printf("Nova quilometragem: %,.2f%n", carro.getQuilometragem());
    }
}
