package com.gustavo.models;

public class Aluno {
    String nome;
    double nota;
    boolean ativo;

    public Aluno(String nome, double nota, boolean ativo) {
        this.nome = nome;
        this.nota = nota;
        this.ativo = ativo;
    }

    public String getNome() {
        return nome;
    }

    public double getNota() {
        return nota;
    }

    public boolean getAtivo() {
        return ativo;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }
}
