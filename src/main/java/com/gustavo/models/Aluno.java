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

    public String getAtivo() {
        String ativado =  "sim";
        String desativado = "não";

        if (ativo) {
            return ativado;
        } else {
            return desativado;
        }
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }
}
