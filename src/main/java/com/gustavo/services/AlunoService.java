package com.gustavo.services;

import com.gustavo.models.Aluno;
import com.gustavo.repository.AlunoRepository;
import com.gustavo.validations.Validations;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class AlunoService {
    public void cadastrarAluno() {
        String nome;
        double nota;
        boolean ativo;

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Digite seu nome: ");
            nome = sc.nextLine();

            if (Validations.validarNome(nome)) {
                break;
            }

            System.out.println("Nome inválido. Tente novamente.");

        }

        System.out.print("Digite sua nota: ");
        nota = sc.nextDouble();
        sc.nextLine();

        while (true) {
            System.out.print("O aluno está ativo (S/N)? ");
            String inputAtivo = sc.nextLine();
            if (Validations.validarAtivo(inputAtivo)) {
                ativo = inputAtivo.equals("s");
                break;
            }
        }

        Aluno aluno = new Aluno(nome, nota, ativo);

        if (ativo) {
            ativar(aluno);
        } else {
            desativar(aluno);
        }

        this.adicionarAluno(aluno);
    }

    public static void ativar(Aluno aluno) {
        aluno.setAtivo(true);
    }

    public static void desativar(Aluno aluno) {
        aluno.setAtivo(false);
    }

    private List<Aluno> alunos = new ArrayList<>();
    AlunoRepository alunoRepository = new AlunoRepository();

    public void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    public void salvarAlunos() throws Exception {
        alunoRepository.salvarAlunos(alunos);
    }

    public void carregarAlunos() throws Exception {
        this.alunos = alunoRepository.carregarAlunos();
    }

    public void listarAlunos() {
        for (Aluno aluno : alunos) {
            System.out.println(aluno.getNome());
            System.out.println(aluno.getNota());
            System.out.println(aluno.getAtivo());
        }
    }

    /*
    public String mostrarNome() {
        return aluno.getNome();
    }

    public void mostrarStatus() {
        if (aluno.isAtivo()) {
            System.out.println("Ativo");
        } else {
            System.out.println("Inativo");
        }
    }

     */
}
