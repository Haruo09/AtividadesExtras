package exercicios.ex4.classes;

public class Livro {
    private String titulo;
    private String autor;
    private String isbn;  // nem sabia que isso existia
    private int numPaginas;

    public Livro(String titulo, String autor, String isbn, int numPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.numPaginas = numPaginas;
    }

    /*
     * Foi pedido apenas para acessar e atualizar o NÚMERO DE PÁGINAS,
     * portanto criei um getter e setter apenas para este atributo.
     */
    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }
}
