import java.util.Scanner;

public class TesteData {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Teste do construtor padrão:");
        Data data1 = new Data();

        System.out.println();
        System.out.println("Data formatada 1: " + data1.mostra1());
        System.out.println("Data formatada 2: " + data1.mostra2());
        System.out.println("Ano bissexto: " + data1.bissexto());
        System.out.println("Dias transcorridos: " + data1.diasTranscorridos());
        System.out.println();

        System.out.println("Teste do construtor com parâmetros:");
        Data data2 = new Data(29, 2, 2024);
        System.out.println("Data formatada 1: " + data2.mostra1());
        System.out.println("Data formatada 2: " + data2.mostra2());
        System.out.println("Ano bissexto: " + data2.bissexto());
        System.out.println("Dias transcorridos: " + data2.diasTranscorridos());
        System.out.println();

        System.out.println("Teste dos métodos de entrada:");
        data2.entraDia(1);
        data2.entraMes(3);
        data2.entraAno(2023);
        System.out.println("Nova data formatada 1: " + data2.mostra1());
        System.out.println("Nova data formatada 2: " + data2.mostra2());
        System.out.println("Ano bissexto: " + data2.bissexto());
        System.out.println("Dias transcorridos: " + data2.diasTranscorridos());
        System.out.println();

        System.out.println("Teste dos métodos de entrada com scanner:");
        data2.entraDia();
        data2.entraMes();
        data2.entraAno();
        System.out.println("Nova data formatada 1: " + data2.mostra1());
        System.out.println("Nova data formatada 2: " + data2.mostra2());
        System.out.println("Ano bissexto: " + data2.bissexto());
        System.out.println("Dias transcorridos: " + data2.diasTranscorridos());
        System.out.println();

        System.out.println("Teste dos métodos de retorno:");
        System.out.println("Dia: " + data2.retDia());
        System.out.println("Mês: " + data2.retMes());
        System.out.println("Ano: " + data2.retAno());
        System.out.println();

        System.out.println("Teste do método para apresentar a data atual:");
        data2.apresentaDataAtual();
    }
}
