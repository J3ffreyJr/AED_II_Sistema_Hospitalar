package ui;

import service.SistemaAtendimento;

import java.util.Scanner;

public class Menu {
    Scanner scanner = new Scanner(System.in);
    SistemaAtendimento sistema;

    public void iniciar() {
        int opcao;
        do {
            System.out.println("1. Inserir paciente");
            System.out.println("2. Atender paciente");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    //TODO: ahhh something deve ser feito aqui
                    //sistema.inserirPaciente();
                    break;

                case 2:
                    //TODO: Aqui tambem, tarefa por concluir
                    //sistema.atenderPaciente();
                    break;

            }
        } while (opcao != 0);
    }
}