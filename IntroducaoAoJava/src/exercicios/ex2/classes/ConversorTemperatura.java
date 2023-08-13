package exercicios.ex2.classes;

public class ConversorTemperatura {
    /*
    * Esta classe não possui atributos, e,
    * portanto, também não possui construtor.
    * */

    public double toFahrenheit(double celsius) {
        return celsius * (9/5.) + 32;
    }

    public double toCelsius(double fahrenheit) {
        return (fahrenheit - 32) * (5/9.);
    }
}
