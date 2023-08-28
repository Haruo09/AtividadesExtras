package exercicios.ex7.classes;

import java.time.LocalDate;

public class Empregado {
    private String nome;
    private String cargo;
    private double salario;
    private LocalDate dataContratacao;

    public Empregado(String nome, String cargo, double salario, LocalDate dataContratacao) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
        this.dataContratacao = dataContratacao;
    }

    public void reajustarSalario() {
        // A cada ano após o Ano de Contratação, o salário aumentará 5%.
        // Poderia fazer algo mais complexo, envolvendo meses e dias, mas não se vê necessário aqui.
        int diff = Math.abs(LocalDate.now().getYear() - this.dataContratacao.getYear());
        System.out.println(diff);
        this.salario += this.salario * diff/20.;
    }

    public String getNome() {
        return nome;
    }

    public String getCargo() {
        return cargo;
    }

    public double getSalario() {
        return salario;
    }

    public LocalDate getDataContratacao() {
        return dataContratacao;
    }
}
