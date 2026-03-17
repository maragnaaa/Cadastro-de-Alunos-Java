package com.gustavo.repository;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.gustavo.models.Aluno;
import java.io.FileReader;
import java.io.FileWriter;
import java.lang.reflect.Type;
import java.util.List;

public class AlunoRepository {

    private static final String ARQUIVO = "alunos.json";
    private Gson gson = new Gson();

    public void salvarAlunos(List<Aluno> alunos) throws Exception {
        FileWriter writer = new FileWriter(ARQUIVO);

        gson.toJson(alunos, writer);

        writer.close();
    }

    public List<Aluno> carregarAlunos() throws Exception {
        FileReader reader = new FileReader(ARQUIVO);

        Type tipoLista = new TypeToken<List<Aluno>>(){}.getType();

        List<Aluno> alunos = gson.fromJson(reader, tipoLista);

        reader.close();

        return alunos;
    }
}
