package exercicios.ex1.main;

import exercicios.ex1.classes.Calculadora;

import java.util.Locale;
import java.util.Random;

public class Main {
    static int x, y, z;
    public static void main(String[] args) {
        // Definindo o Locale:
        Locale.setDefault(Locale.US);

        // Instanciando o objeto Random:
        Random r = new Random();

        // Instanciando a Calculadora:
        Calculadora calculadora = new Calculadora();

        // ================== ABA DOS NATURAIS ==================
        System.out.println("============= TESTES NATURAIS =============");

        // Gerando números naturais aleatórios:
        int x = r.nextInt(1, 11);
        int y = r.nextInt(1, 11);
        int z = r.nextInt(1, 11);

        // Mostrando os números na tela:
        System.out.printf("x = %d; y = %d; z = %d%n",x,y,z);

        // Testando os métodos naturais da calculadora:
        int soma = calculadora.soma(x, y, z);  // x+y+z
        int diff = calculadora.subtracao(x, y, z);  // x-y-z
        int prod = calculadora.multiplicacao(x, y, z);  // x*y*z

        // Imprimindo os resultados:
        System.out.printf("%d + %d + %d = %d%n", x,y,z,soma);
        System.out.printf("%d - %d - %d = %d%n", x,y,z,diff);
        System.out.printf("%d * %d * %d = %d%n", x,y,z,prod);

        // ================== ABA DOS INTEIROS ==================
        System.out.println("\n============= TESTES INTEIROS =============");

        // Gerando números inteiros aleatórios:
        x = r.nextInt(-10, 11);
        y = r.nextInt(-10, 11);
        z = r.nextInt(-10, 11);

        // Mostrando os números na tela:
        System.out.printf("x = %d; y = %d; z = %d%n", x,y,z);

        // Testando os métodos inteiros da calculadora:
        soma = calculadora.soma(x, y, z);
        diff = calculadora.subtracao(x, y, z);
        prod = calculadora.multiplicacao(x, y, z);

        // Imprimindo os resultados:
        System.out.printf("%d + %d + %d = %d%n", x,y,z,soma);
        System.out.printf("%d - %d - %d = %d%n", x,y,z,diff);
        System.out.printf("%d * %d * %d = %d%n", x,y,z,prod);

        // ================== ABA DOS REAIS ==================
        System.out.println("\n============== TESTES REAIS ===============");

        // Gerando números reais aleatórios:
        double a = r.nextDouble(-5, 6);
        double b = r.nextDouble(-5, 6);
        double c = r.nextDouble(-5, 6);

        // Mostrando os números na tela:
        System.out.printf("a = %.2f; b = %.2f; c = %.2f%n", a,b,c);

        // Testando os métodos reais da calculadora:
        double sum = calculadora.soma(a, b, c);
        double sub = calculadora.sub(a, b, c);
        double mul = calculadora.multiplicacao(a, b, c);

        // Imprimindo os resultados:
        System.out.printf("%.2f + %.2f + %.2f = %.2f%n", a,b,c,sum);
        System.out.printf("%.2f - %.2f - %.2f = %.2f%n", a,b,c,sub);
        System.out.printf("%.2f * %.2f * %.2f = %.2f%n", a,b,c,mul);

        // ================== ABA DAS DIVISÕES ==================
        System.out.println("\n=========== TESTANDO A DIVISÃO ============");

        // ------------------ ABA DOS NATURAIS ------------------
        // Gerando números naturais aleatórios novamente:
        x = r.nextInt(0, 11);
        y = r.nextInt(0, 11);
        z = r.nextInt(0, 11);

        // Mostrando os números na tela:
        System.out.println("Divisão Natural: ");
        System.out.printf("x = %d; y = %d; z = %d%n", x,y,z);

        // Testando a divisão inteira da calculadora:
        double quo = calculadora.divisao(x, y, z);

        // Imprimindo o resultado:
        System.out.printf("%d / %d / %d = %.3f%n%n", x,y,z,quo);

        // ------------------ ABA DOS INTEIROS ------------------
        // Gerando números inteiros aleatórios novamente:
        x = r.nextInt(-5, 11);
        y = r.nextInt(-5, 11);
        z = r.nextInt(-5, 11);

        // Mostrando os números na tela:
        System.out.println("Divisão Inteira: ");
        System.out.printf("x = %d; y = %d; z = %d%n", x,y,z);

        // Testando a divisão inteira da calculadora:
        quo = calculadora.divisao(x, y, z);

        // Imprimindo o resultado:
        System.out.printf("%d / %d / %d = %.3f%n%n", x,y,z,quo);

        // ------------------ ABA DOS REAIS ------------------
        // Gerando números reais aleatórios novamente:
        a = r.nextDouble(-5, 11);
        b = r.nextDouble(-5, 11);
        c = r.nextDouble(-5, 11);

        // Mostrando os números na tela:
        System.out.println("Divisão Real: ");
        System.out.printf("a = %.2f; b = %.2f; c = %.2f%n", a,b,c);

        // Testando a divisão real da calculadora:
        quo = calculadora.divisao(a, b, c);

        // Imprimindo o resultado:
        System.out.printf("%.2f / %.2f / %.2f = %.3f%n%n", a,b,c,quo);

        /*
        * Note que: como os valores foram arredondados para duas casas
        * decimais, o resultado também será aproximado, podendo perder
        * um pouco de precisão e, talvez, obter um resultado diferente
        * de outra calculadora, mesmo que seja muito pouca diferença..
        * */
    }
}
