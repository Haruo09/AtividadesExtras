package exercicios.ex7.classes;

public class Relogio {
    // Atributos:
    private int horas;
    private int minutos;
    private int segundos;

    // Construtor:
    public Relogio(int horas, int minutos, int segundos) {
        while (segundos >= 60) {
            minutos += 1;
            segundos -= 60;
        }

        while (minutos >= 60) {
            horas += 1;
            minutos -= 60;
        }

        while (horas >= 24) {
            horas -= 24;
        }

        this.horas = horas;
        this.minutos = minutos;
        this.segundos = segundos;
    }

    public void avancarTempo(int h, int m, int s) {

        int horas = h;
        int minutos = m;
        int segundos = s;

        this.horas += horas;
        this.minutos += minutos;
        this.segundos += segundos;

        while (this.segundos >= 60) {
            this.minutos += 1;
            this.segundos -= 60;
        }

        while (this.minutos >= 60) {
            this.horas += 1;
            this.minutos -= 60;
        }

        while (this.horas >= 24) {
            this.horas -= 24;
        }

    }

    public String getHorario() {
        return String.format("%02d:%02d:%02d%n", this.horas, this.minutos, this.segundos);
    }
}
