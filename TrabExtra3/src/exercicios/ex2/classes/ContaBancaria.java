package exercicios.ex2.classes;

public class ContaBancaria {
    private int numeroConta;
    private double saldo;
    private String dono;

    public ContaBancaria(int numeroConta, double saldo, String dono) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;
        this.dono = dono;
    }

    public void depositar(double valor) {
        saldo += Math.abs(valor);  // tratamento para caso o valor seja negativo;
    }

    public void sacar(double valor) {
        if (saldo < valor) {
            System.out.println("\u001b[1;31mErro: saldo insuficiente.\u001b[m");
            return;
        }

        saldo -= valor;
    }

    public void consultarSaldo() {
        System.out.printf("Seu saldo atual é de R$%,.2f.%n", this.saldo);
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getDono() {
        return dono;
    }
}
