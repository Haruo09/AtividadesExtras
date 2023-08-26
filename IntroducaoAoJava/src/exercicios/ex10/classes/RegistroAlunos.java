package exercicios.ex10.classes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RegistroAlunos {
    List<Aluno> registro = new ArrayList<>();

    public RegistroAlunos(Aluno... alunos) {
        adicionar(alunos);
    }

    public void adicionar(Aluno... alunos) {
        registro.addAll(Arrays.asList(alunos));
    }

    public double calcularMedia() {
        double sum = 0;
        for (Aluno aluno : registro) {
            sum += aluno.getNota();
        }

        return sum;
    }

    public void listarAlunos() {
        for (Aluno aluno : registro) {
            System.out.println(aluno);
        }
    }

    public void listarAlunos(Aluno... alunos) {
        for (Aluno aluno : alunos) {
            if (registro.contains(aluno)) System.out.println(aluno);
            else System.out.printf("Aluno '%s' não está registrado.%n%n", aluno.getNome());
        }
    }
}
