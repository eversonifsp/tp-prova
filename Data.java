import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Data {
    private int dia;
    private int mes;
    private int ano;
    
    public Data() {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Digite o dia: ");
            this.dia = scanner.nextInt();
            System.out.print("Digite o mês: ");
            this.mes = scanner.nextInt();
            System.out.print("Digite o ano: ");
            this.ano = scanner.nextInt();
        } while (!validaData(this.dia, this.mes, this.ano));
    }

    public Data(int d, int m, int a) {
        if (validaData(d, m, a)) {
            this.dia = d;
            this.mes = m;
            this.ano = a;
        } else {
            throw new IllegalArgumentException("Data inválida.");
        }
    }

    public void entraDia(int d) {
        if (validaData(d, this.mes, this.ano)) {
            this.dia = d;
        } else {
            throw new IllegalArgumentException("Dia inválido.");
        }
    }

    public void entraMes(int m) {
        if (validaData(this.dia, m, this.ano)) {
            this.mes = m;
        } else {
            throw new IllegalArgumentException("Mês inválido.");
        }
    }

    public void entraAno(int a) {
        if (validaData(this.dia, this.mes, a)) {
            this.ano = a;
        } else {
            throw new IllegalArgumentException("Ano inválido.");
        }
    }

    public void entraDia() {
        Scanner scanner = new Scanner(System.in);
        int d;
        do {
            System.out.print("Digite o dia: ");
            d = scanner.nextInt();
        } while (!validaData(d, this.mes, this.ano));
        this.dia = d;
    }

    public void entraMes() {
        Scanner scanner = new Scanner(System.in);
        int m;
        do {
            System.out.print("Digite o mês: ");
            m = scanner.nextInt();
        } while (!validaData(this.dia, m, this.ano));
        this.mes = m;
    }

    public void entraAno() {
        Scanner scanner = new Scanner(System.in);
        int a;
        do {
            System.out.print("Digite o ano: ");
            a = scanner.nextInt();
        } while (!validaData(this.dia, this.mes, a));
        this.ano = a;
    }

    public int retDia() {
        return this.dia;
    }

    public int retMes() {
        return this.mes;
    }

    public int retAno() {
        return this.ano;
    }

    public String mostra1() {
        return String.format("%02d/%02d/%04d", this.dia, this.mes, this.ano);
    }

    public String mostra2() {
        String[] meses = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};
        return String.format("%02d/%s/%04d", this.dia, meses[this.mes - 1], this.ano);
    }

    public boolean bissexto() {
        return (this.ano % 4 == 0 && this.ano % 100 != 0) || (this.ano % 400 == 0);
    }

    public int diasTranscorridos() {
        int[] diasPorMes = {31, bissexto() ? 29 : 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int dias = 0;
        for (int i = 0; i < this.mes - 1; i++) {
            dias += diasPorMes[i];
        }
        dias += this.dia;
        return dias;
    }

    public void apresentaDataAtual() {
        DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.FULL);
        Date dataAtual = new Date();
        System.out.println(dateFormat.format(dataAtual));
    }

    private boolean validaData(int dia, int mes, int ano) {
        if (mes < 1 || mes > 12) return false;
        if (dia < 1 || dia > 31) return false;
        if (ano < 1) return false;

        int[] diasPorMes = {31, bissexto() ? 29 : 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        return dia <= diasPorMes[mes - 1];
    }

    public static void main(String[] args) {
        Data data = new Data();
        data.apresentaDataAtual();
        System.out.println("Data formatada 1: " + data.mostra1());
        System.out.println("Data formatada 2: " + data.mostra2());
        System.out.println("Ano bissexto: " + data.bissexto());
        System.out.println("Dias transcorridos: " + data.diasTranscorridos());
    }
}
