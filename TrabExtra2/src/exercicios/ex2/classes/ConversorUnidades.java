package exercicios.ex2.classes;

import java.util.HashMap;

public class ConversorUnidades {
    // Criando um dicionário:
    private final HashMap<String, Double> values = new HashMap<>();

    // Atribuindo os valores no bloco de inicialização:
    {
        values.put("mm", 0.001);
        values.put("cm", 0.010);
        values.put("dm", 0.100);
        values.put("m" , 1.000);
        values.put("dam", 10.0);
        values.put("hm", 100.0);
        values.put("km", 1000.);
    }
    public double converter(double v, String on, String to) {
        // Verificando se as unidades passadas como argumnto são válidas:
        if (
            !(
                values.containsKey(on.toLowerCase())
                &&
                values.containsKey(to.toLowerCase())
            )
        ) {
            System.out.println(
                "\u001b[1;31mErro: Unidade inválida passada como argumento.\u001b[m"
            );
            return 0;
        }

        v *= values.get(on.toLowerCase());
        v /= values.get(to.toLowerCase());

        return v;
    }
}
