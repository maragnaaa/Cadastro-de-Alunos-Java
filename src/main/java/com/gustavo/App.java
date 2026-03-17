package com.gustavo;

import com.gustavo.services.AlunoService;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args ) throws Exception {
        Scanner sc = new Scanner(System.in);
        AlunoService service = new AlunoService();

        int opcao;

        do {
            System.out.println("=== Cadastro de Alunos ===");
            System.out.println("1- Cadastrar alunos");
            System.out.println("2 - Listar alunos");
            System.out.println("3 - Salvar e sair");
        }

        service.cadastrarAluno();
        service.salvarAlunos();

    }
}
