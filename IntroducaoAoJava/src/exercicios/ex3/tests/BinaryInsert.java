package exercicios.ex3.tests;

import java.util.ArrayList;
import java.util.List;

/**
 * BinaryInsert
 */
public class BinaryInsert {

    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>();
        binaryInsert(lista, 7, 3, 5, 1, 9);

        binaryInsert(lista, 6);

        System.out.println(lista);
    }

    public static void binaryInsert(List<Integer> lista, int... e) {
        for (int i : e) {
            int inicio = 0;
            int fim = lista.size();

            try {
                while (inicio <= fim) {
                    int meio = (inicio + fim) / 2;

                    if (lista.get(meio) > i) {
                        fim = meio - 1;
                    } else if (lista.get(meio) < i) {
                        inicio = meio + 1;
                    } else {
                        lista.add(meio, i);
                        return;
                    }
                }
            } catch (IndexOutOfBoundsException exception) {
                // catch para não estourar um erro.
            } finally {
                lista.add(inicio, i);
            }
        }
    }
}