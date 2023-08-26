package exercicios.ex9.classes;

import java.time.LocalDate;
import java.time.LocalTime;

public class Compromisso {
    LocalDate data;
    LocalTime horario;
    String descricao;

    public Compromisso(LocalDate data, LocalTime horario, String descricao) {
        this.data = data;
        this.horario = horario;
        this.descricao = descricao;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public LocalTime getHorario() {
        return horario;
    }

    public void setHorario(LocalTime horario) {
        this.horario = horario;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
