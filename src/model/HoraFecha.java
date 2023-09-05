package model;


import java.io.Serializable;
import java.util.Calendar;

public class HoraFecha implements Serializable {

    private int horas;
    private int minutos;
    private int segundo;
    private int dia;
    private int mes;
    private int anio;
    private Calendar dHour = Calendar.getInstance();


    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    public int getSegundo() {
        return segundo;
    }

    public void setSegundo(int segundo) {
        this.segundo = segundo;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String registrarFecha() {

        setHoras(dHour.get(Calendar.HOUR_OF_DAY));
        setMinutos(dHour.get(Calendar.MINUTE));
        setSegundo(dHour.get(Calendar.SECOND));
        setDia(dHour.get(Calendar.DATE));
        setMes(dHour.get(Calendar.MONTH));
        setAnio(dHour.get(Calendar.YEAR));

        return String.format("Fecha: %02d/%02d/%d, Hora: %02d:%02d:%02d", this.dia, this.mes, this.anio, this.horas, this.minutos, this.segundo);

    }
}
