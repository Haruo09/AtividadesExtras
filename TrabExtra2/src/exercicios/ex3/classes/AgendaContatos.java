package exercicios.ex3.classes;

import java.util.HashMap;

public class AgendaContatos {
    private final HashMap<String, CategoriaContatos> map = new HashMap<>();

    public AgendaContatos(CategoriaContatos... categorias) {
        for (CategoriaContatos categoria : categorias) {
            map.put(categoria.getNome(), categoria);
        }
    }

    public void listarCategorias() {
        System.out.println(map.keySet());
    }

    public void listarContatos() {
        System.out.println("[");
        for (CategoriaContatos categoria : map.values()) {
            System.out.print((categoria.getNome() + " = ").indent(4));
            System.out.println(categoria.getContatos().indent(4));
        }
        System.out.println("]");
    }
}
