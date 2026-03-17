package com.gustavo.validations;

public class Validations {

    public static boolean validarAtivo(String ativo) {
        if (ativo == null) {
            return false;
        }

        ativo = ativo.toLowerCase();

        return ativo.matches("(?i)^[sn]$");
    }

    public static boolean validarNome(String nome) {
        if (nome == null) {
            return false;
        }

        nome = nome.toLowerCase();
        return nome.matches("^[A-Za-zÀ-ÿ]{2,}(?:[ '-][A-Za-zÀ-ÿ]{2,})+$");
    }
}
