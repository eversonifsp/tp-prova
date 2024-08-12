package ex_03;

import ex_01.Data;
import ex_02.ConsultaAgendada;

public class TesteConsultaAgendada {
    public static void main(String[] args) {
        ConsultaAgendada p1 = new ConsultaAgendada(14, 30, 20, 15, 8, 2024, "João Silva", "Dr. Ricardo");

        System.out.println("Propriedades de p1:");
        System.out.println("Data: " + p1.getData());
        System.out.println("Hora: " + p1.getHora());
        System.out.println("Nome do Paciente: " + p1.getNomePaciente());
        System.out.println("Nome do Médico: " + p1.getNomeMedico());
        System.out.println();

        ConsultaAgendada p2 = new ConsultaAgendada();

        System.out.println("Propriedades de p2:");
        System.out.println("Data: " + p2.getData());
        System.out.println("Hora: " + p2.getHora());
        System.out.println("Nome do Paciente: " + p2.getNomePaciente());
        System.out.println("Nome do Médico: " + p2.getNomeMedico());
        System.out.println();

        p1.setData(20, 9, 2024);
        p1.setHora(16, 45, 50);
        p1.setNomePaciente("Ana Pereira");
        p1.setNomeMedico("Dr. Carlos");

        System.out.println("Propriedades de p1 após alterações:");
        System.out.println("Data: " + p1.getData());
        System.out.println("Hora: " + p1.getHora());
        System.out.println("Nome do Paciente: " + p1.getNomePaciente());
        System.out.println("Nome do Médico: " + p1.getNomeMedico());
        System.out.println();

        System.out.println("Quantidade final de consultas agendadas: " + ConsultaAgendada.getQuantidade());
    }
}
