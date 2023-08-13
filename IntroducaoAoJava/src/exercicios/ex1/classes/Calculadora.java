package exercicios.ex1.classes;

public class Calculadora {
    // Métodos de soma:
    public int soma(int... seq) {
        int sum = 0;
        for (int i : seq) {
            sum += i;
        }
        return sum;
    }

    public double soma(double... seq) {
        double sum = 0;
        for (double d : seq) {
            sum += d;
        }

        return sum;
    }

    // Métodos de subtração:
    public int subtracao(int... seq) {
        int diff = seq[0];
        for (int i = 1; i < seq.length; i++) {
            diff -= seq[i];
        }

        return diff;
    }

    public double sub(double... seq) {
        double diff = seq[0];
        for (int i = 1; i < seq.length; i++) {
            diff -= seq[i];
        }

        return diff;
    }

    // Métodos de multiplicação:
    public int multiplicacao(int... seq) {
        int prod = 1;
        for (int i : seq) {
            prod *= i;
        }

        return prod;
    }

    public double multiplicacao(double... seq) {
        double prod = 1;
        for (double d : seq) {
            prod *= d;
        }

        return prod;
    }

    // Métodos de Divisão:
    public double divisao(int... seq) {
        double quo = seq[0];
        for (int i = 1; i < seq.length; i++) {
            quo /= seq[i];
        }

        return quo;
    }

    public double divisao(double... seq) {
        double quo = seq[0];
        for (int i = 1; i < seq.length; i++) {
            quo /= seq[i];
        }

        return quo;
    }

    /*
    * Importante citar: o Java não estoura exceção por divir
    * algo por 0. Nesse caso, a linguagem retorna "Infinity"
    * como resultado.
    * */
}
