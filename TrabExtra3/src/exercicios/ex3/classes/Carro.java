package exercicios.ex3.classes;

public class Carro {
    private String marca;
    private String modelo;
    private int ano;
    private double quilometragem;

    public Carro(String modelo, String marca, int ano, double quilometragem) {
        this.modelo = modelo;
        this.marca = marca;
        this.ano = ano;
        this.quilometragem = Math.abs(quilometragem);
    }

    public String toString() {
        return String.format(
            """
            Modelo: %s
            Marca: %s
            Ano: %d
            Quilometragem: %,.1f
            """, modelo, marca, ano, quilometragem
        );
    }

    public void somarQuilometragem(double quilometragem) {
        this.quilometragem += Math.abs(quilometragem);
    }

    public void setQuilometragem(double quilometragem) {
        this.quilometragem = quilometragem;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAno() {
        return ano;
    }

    public double getQuilometragem() {
        return quilometragem;
    }
}
