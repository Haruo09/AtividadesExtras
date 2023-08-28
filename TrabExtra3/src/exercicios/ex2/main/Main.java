package exercicios.ex2.main;

import exercicios.ex2.classes.ContaBancaria;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        // Instanciando o objeto conta:
        ContaBancaria conta = new ContaBancaria(1, 1_000_000, "Haruo");

        // Realizando saque:
        conta.sacar(30_000);
        conta.consultarSaldo();  // 1,000,000 - 30,000 = 970,000

        // Realizando depósito:
        conta.depositar(350_000);  // 970,000 + 350,000 = 1,320,000
        conta.consultarSaldo();

        // Realizando saque inválido:
        conta.sacar(1_320_000.01);  // Erro: saldo insuficiente.
        conta.consultarSaldo();
    }
}
