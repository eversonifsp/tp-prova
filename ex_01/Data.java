package ex_01;

import java.text.DateFormat;
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
        } while (!getIsDataValida(this.dia, this.mes, this.ano));
    }

    public Data(int dia, int mes, int ano) {
        if (getIsDataValida(dia, mes, ano)) {
            this.dia = dia;
            this.mes = mes;
            this.ano = ano;
        } else {
            throw new IllegalArgumentException("Data inválida.");
        }
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAno() {
        return ano;
    }

    public void setDia(int dia) {
        if (getIsDataValida(dia, this.mes, this.ano)) {
            this.dia = dia;
        } else {
            throw new IllegalArgumentException("Dia inválido.");
        }
    }

    public void setMes(int mes) {
        if (getIsDataValida(this.dia, mes, this.ano)) {
            this.mes = mes;
        } else {
            throw new IllegalArgumentException("Mês inválido.");
        }
    }

    public void setAno(int ano) {
        if (getIsDataValida(this.dia, this.mes, ano)) {
            this.ano = ano;
        } else {
            throw new IllegalArgumentException("Ano inválido.");
        }
    }

    public String getDataFormatada() {
        return String.format("%02d/%02d/%04d", this.dia, this.mes, this.ano);
    }

    public String getDataFormatadaComNomeMes() {
        String[] meses = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};
        return String.format("%02d/%s/%04d", this.dia, meses[this.mes - 1], this.ano);
    }

    public boolean getIsBissexto() {
        return (this.ano % 4 == 0 && this.ano % 100 != 0) || (this.ano % 400 == 0);
    }

    public int getDiasTranscorridos() {
        int[] diasPorMes = {31, getIsBissexto() ? 29 : 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int dias = 0;
        for (int i = 0; i < this.mes - 1; i++) {
            dias += diasPorMes[i];
        }
        dias += this.dia;
        return dias;
    }

    public String getDataAtual() {
        DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.FULL);
        Date dataAtual = new Date();
        
        return dateFormat.format(dataAtual);
    }

    private boolean getIsDataValida(int dia, int mes, int ano) {
        if (mes < 1 || mes > 12) return false;
        if (dia < 1 || dia > 31) return false;
        if (ano < 1) return false;

        int[] diasPorMes = {31, getIsBissexto() ? 29 : 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        return dia <= diasPorMes[mes - 1];
    }

    public static void main(String[] args) {
        System.out.println("Ex 01 compiled class.");
    }
}
