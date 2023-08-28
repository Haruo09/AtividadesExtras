package exercicios.ex8.classes;

import java.time.LocalDate;

public class Casa {
    private String endereco;
    private int numQuartos;
    private double tamanho;  // em m²;
    private LocalDate anoConstrucao;

    public Casa(String endereco, int numQuartos, double tamanho, LocalDate anoConstrucao) {
        this.endereco = endereco;
        this.numQuartos = numQuartos;
        this.tamanho = tamanho;
        this.anoConstrucao = anoConstrucao;
    }

    public String getEndereco() {
        return endereco;
    }

    public int getNumQuartos() {
        return numQuartos;
    }

    public double getTamanho() {
        return tamanho;
    }

    public LocalDate getAnoConstrucao() {
        return anoConstrucao;
    }
}
