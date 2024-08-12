package ex_02;

import java.util.Scanner;
import ex_01.Data;

class Hora {
    private int hora;
    private int minuto;
    private int segundo;

    public Hora() {
        this.hora = 12;
        this.minuto = 50;
        this.segundo = 20;
    }

    public Hora(int h, int mi, int s) {
        this.hora = h;
        this.minuto = mi;
        this.segundo = s;
    }

    public void setHora(int h) {
        this.hora = h;
    }

    public void setMinuto(int mi) {
        this.minuto = mi;
    }

    public void setSegundo(int s) {
        this.segundo = s;
    }

    public int getHora() {
        return hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public int getSegundo() {
        return segundo;
    }

    public String getHoraFormatada() {
        return hora + ":" + minuto + ":" + segundo;
    }
}

public class ConsultaAgendada {
    private Data data;
    private Hora hora;
    private String nomePaciente;
    private String nomeMedico;
    private static int quantidade = 0;

    public ConsultaAgendada() {
        this.data = new Data();
        this.hora = new Hora();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do paciente: ");
        this.nomePaciente = scanner.nextLine();

        System.out.print("Digite o nome do médico: ");
        this.nomeMedico = scanner.nextLine();

        quantidade++;
    }

    public ConsultaAgendada(int h, int mi, int s, int d, int m, int a, String nomePaciente, String nomeMedico) {
        this.data = new Data(d, m, a);
        this.hora = new Hora(h, mi, s);
        this.nomePaciente = nomePaciente;
        this.nomeMedico = nomeMedico;
        quantidade++;
    }

    public ConsultaAgendada(Data d, Hora h, String p, String m) {
        this.data = d;
        this.hora = h;
        this.nomePaciente = p;
        this.nomeMedico = m;
        quantidade++;
    }

    public void setData() {
        this.data = new Data();
    }

    public void setHora() {
        this.hora = new Hora();
    }

    public void setNomePaciente() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o nome do paciente: ");
        this.nomePaciente = scanner.nextLine();
    }

    public void setNomeMedico() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o nome do médico: ");
        this.nomeMedico = scanner.nextLine();
    }

    public void setData(int d, int m, int a) {
        this.data = new Data(d, m, a);
    }

    public void setHora(int h, int mi, int s) {
        this.hora = new Hora(h, mi, s);
    }

    public void setNomePaciente(String p) {
        this.nomePaciente = p;
    }

    public void setNomeMedico(String m) {
        this.nomeMedico = m;
    }

    public static int getQuantidade() {
        return quantidade;
    }

    public String getData() {
        return data.getDataFormatada();
    }

    public String getHora() {
        return hora.getHoraFormatada();
    }

    public String getNomePaciente() {
        return nomePaciente;
    }

    public String getNomeMedico() {
        return nomeMedico;
    }

    public static void main(String[] args) {
        System.out.println("Ex 02 compiled class.");
    }
}
