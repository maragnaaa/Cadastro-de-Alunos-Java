package com.gustavo;

import com.gustavo.services.AlunoService;
import com.gustavo.validations.Validations;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        AlunoService service = new AlunoService();

        service.carregarAlunos();

        String opcao;

        do {
            System.out.println("=== Cadastro de Alunos ===");
            System.out.println(" ");
            System.out.println("1 - Cadastrar alunos");
            System.out.println("2 - Listar alunos");
            System.out.println("3 - Salvar e sair");
            System.out.println(" ");
            System.out.print("Insira sua opção: ");

            opcao = sc.nextLine();
            if (Validations.validarOpcao(opcao)) {

                switch (opcao) {
                    case "1":
                        service.cadastrarAluno();
                        break;

                    case "2":
                        service.listarAlunos();
                        break;

                    case "3":
                        System.out.println("Salvando e saindo...");
                        service.salvarAlunos();
                        break;
                    }

                } else {
                    System.out.println("Opção inválida, tente novamente.");
                }

            } while (!opcao.equals("3"));

            sc.close();
        }
    }