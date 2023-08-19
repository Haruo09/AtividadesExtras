package exercicios.ex8.classes;

import java.util.Locale;

public class ConversorMoedas {
    public double converter(double valor, String moeda1, String moeda2) throws Exception {
        Locale.setDefault(Locale.US);
        switch (moeda1) {
            case "R$" -> {
                switch (moeda2) {
                    case "R$" -> {
                        return valor;
                    }
                    case "U$" -> {
                        return valor * 0.2;
                    }
                    case "E$" -> {
                        return valor * 0.18;
                    }
                    default -> {
                        throw new Exception("Não foi possível converter.");
                    }
                }
            }
            case "U$" -> {
                switch (moeda2) {
                    case "R$" -> {
                        return valor * 4.97;
                    }
                    case "U$" -> {
                        return valor;
                    }
                    case "E$" -> {
                        return valor * 0.92;
                    }
                    default -> {
                        throw new Exception("Não foi possível converter.");
                    }
                }
            }
            case "E$" -> {
                switch (moeda2) {
                    case "R$" -> {
                        return valor * 5.41;
                    }
                    case "U$" -> {
                        return valor * 1.09;
                    }
                    case "E$" -> {
                        return valor;
                    }
                    default -> {
                        throw new Exception("Não foi possível converter.");
                    }
                }
            }
            default -> {
                throw new Exception("Não foi possível converter.");
            }
        }
    }
}
