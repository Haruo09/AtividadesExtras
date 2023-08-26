package exercicios.ex10.main;

import exercicios.ex10.classes.Aluno;
import exercicios.ex10.classes.RegistroAlunos;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        // Definindo o Locale:
        Locale.setDefault(Locale.US);

        // Instanciando alunos:
        Aluno haruo = new Aluno("Fábio Haruo", 16, 9.5);
        Aluno otavio = new Aluno("Otávio D. Silva", 20, 8.0);
        Aluno victor = new Aluno("Victor Hugo", 17, 7.6);

        // Instanciando um registro:
        RegistroAlunos registro = new RegistroAlunos(haruo, otavio, victor);

        // Listando os alunos registrados:
        System.out.println("\u001b[1;34mAlunos Registrados:\u001b[m");
        registro.listarAlunos();

        // Listando apenas um aluno:
        System.out.println("\u001b[1;34mAluno único:\u001b[m");
        registro.listarAlunos(otavio);

        // Listando um aluno não cadastrado:
        System.out.println("\u001b[1;34mAluno não cadastrado incluso:\u001b[m");
        registro.listarAlunos(haruo, victor, new Aluno("a", 16, 18));

        // Imprimindo a média de notas:
        System.out.println("\u001b[1;34mMédia das notas:\u001b[m");
        System.out.println(registro.calcularMedia());
    }
}
