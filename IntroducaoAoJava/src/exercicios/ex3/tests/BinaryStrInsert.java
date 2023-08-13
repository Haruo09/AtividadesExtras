package exercicios.ex3.tests;

import java.util.ArrayList;
import java.util.List;

public class BinaryStrInsert {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();
        binaryInsert(lista, "apple", "some lemon too", "apple", "apple juice");
        System.out.println(lista);
    }

    public static void binaryInsert(List<String> lista, String... e) {
        for (String s : e) {
            int inicio = 0;
            int fim = lista.size() - 1;

            try {
                while (inicio <= fim) {
                    int meio = (inicio + fim) / 2;

                    if (lista.get(meio).compareTo(s) > 0) {
                        fim = meio - 1;
                    } else if (lista.get(meio).compareTo(s) < 0) {
                        inicio = meio + 1;
                    } else {
                        lista.add(meio, s);
                        break;
                    }
                }
            } catch (IndexOutOfBoundsException exception) {
                // catch para não estourar um erro.
            } finally {
                if (inicio > fim)
                    lista.add(inicio, s);
            }
        }
    }
}
