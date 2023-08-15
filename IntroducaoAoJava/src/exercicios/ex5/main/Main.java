package exercicios.ex5.main;

import exercicios.ex5.classes.Banco;
import exercicios.ex5.classes.ContaBancaria;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        // Definindo o Locale:
        Locale.setDefault(Locale.US);

        // Instanciando várias contas:
        ContaBancaria contaHaruo = new ContaBancaria("Fábio Haruo", 2_000);
        ContaBancaria contaAlex = new ContaBancaria("Alexandre", 10_000);

        // Criando um banco para gerir estas contas:
        Banco banco = new Banco();

        // Adicionando as contas ao banco:
        banco.add(contaAlex, contaHaruo);
        System.out.println(banco.getContas());

        // Tentando adicionar uma conta já existente:
        banco.add(contaHaruo);

        // Buscando as contas:
        banco.search(contaHaruo, contaAlex, new ContaBancaria("X", 999_999_999));

        // Tentando remover uma conta inexistente:
        banco.pop(new ContaBancaria("Mark", 1_000_000_000));

        // Realizando um depósito:
        contaHaruo.depositar(300);  // Novo saldo: 2300

        // Realizando um saque:
        contaAlex.sacar(1000);  // Novo saldo: 9000

        // Realizando um saque inválido:
        contaHaruo.sacar(3000);  // Erro: saque maior do que saldo.

        // Atestando os resultados:
        System.out.println(banco.getContas());

        // Removendo contas existentes:
        banco.pop(contaAlex, contaHaruo);

        // Mostrano a lista vazia de contas:
        System.out.println(banco.getContas());
    }
}
