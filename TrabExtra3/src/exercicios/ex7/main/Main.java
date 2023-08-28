package exercicios.ex7.main;

import exercicios.ex7.classes.Empregado;

import java.time.LocalDate;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        // Instanciando um empregado:
        Empregado empregado = new Empregado(
            "Randandano",
            "entreador",
            3500,
            LocalDate.of(2022, 8, 28)
        );

        // Reajustando salário:
        empregado.reajustarSalario();
        System.out.println(empregado.getSalario());
    }
}
