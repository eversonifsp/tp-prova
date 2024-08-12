package ex_04;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import ex_01.Data;
import ex_02.ConsultaAgendada;

public class TesteConsultaAgendadaTexto {
    public static void main(String[] args) {
        try (PrintWriter writer = new PrintWriter(new FileWriter("resultado_consultas.txt"))) {
            ConsultaAgendada p1 = new ConsultaAgendada(14, 30, 20, 15, 8, 2024, "João Silva", "Dr. Ricardo");

            writer.println("Propriedades de p1:");
            writer.println("Data: " + p1.getData());
            writer.println("Hora: " + p1.getHora());
            writer.println("Nome do Paciente: " + p1.getNomePaciente());
            writer.println("Nome do Médico: " + p1.getNomeMedico());
            writer.println();

            ConsultaAgendada p2 = new ConsultaAgendada();

            writer.println("Propriedades de p2:");
            writer.println("Data: " + p2.getData());
            writer.println("Hora: " + p2.getHora());
            writer.println("Nome do Paciente: " + p2.getNomePaciente());
            writer.println("Nome do Médico: " + p2.getNomeMedico());
            writer.println();

            p1.setData(20, 9, 2024);
            p1.setHora(16, 45, 50);
            p1.setNomePaciente("Ana Pereira");
            p1.setNomeMedico("Dr. Carlos");

            writer.println("Propriedades de p1 após alterações:");
            writer.println("Data: " + p1.getData());
            writer.println("Hora: " + p1.getHora());
            writer.println("Nome do Paciente: " + p1.getNomePaciente());
            writer.println("Nome do Médico: " + p1.getNomeMedico());
            writer.println();

            writer.println("Quantidade final de consultas agendadas: " + ConsultaAgendada.getQuantidade());

            System.out.println("Resultado escrito no arquivo 'resultado_consultas.txt' com sucesso.");

        } catch (IOException e) {
            System.out.println("Ocorreu um erro ao escrever no arquivo: " + e.getMessage());
        }
    }
}
