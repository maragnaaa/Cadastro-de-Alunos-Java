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
        return nome.matches("^[A-Za-zÀ-ÿ]+( [A-Za-zÀ-ÿ]+)*$");
    }

    public static boolean validarOpcao(String opcao) {
        if (opcao == null) {
            return false;
        }

        return opcao.matches("^[1-3]$");
    }
}
