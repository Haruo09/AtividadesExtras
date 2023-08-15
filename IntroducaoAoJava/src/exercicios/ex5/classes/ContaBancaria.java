package exercicios.ex5.classes;

public class ContaBancaria {
    // Atributos:
    private String titular;
    private double saldo;

    // Construtor:
    public ContaBancaria(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    // toString():
    public String toString() {
        return String.format(
            """
            
            Titular: %s
            Saldo disponível: %s
            """,
            this.titular, this.saldo
        );
    }

    // Métodos da classe:
    public void depositar(double valor) {
        this.saldo += valor;
    }

    public void sacar(double valor) {
        if (valor <= this.saldo) this.saldo -= valor;
        else System.out.println("Erro: valor se daque maior que saldo disponível.");
    }

    // Getters & Setters:
    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }  // setSaldo() não foi implementado, pois seria incoerente com o contexto.
}
