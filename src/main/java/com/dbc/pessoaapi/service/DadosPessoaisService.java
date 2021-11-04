package com.dbc.pessoaapi.service;

import com.dbc.pessoaapi.client.DadosPessoaisClient;
import com.dbc.pessoaapi.dto.DadosPessoaisDTO;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class DadosPessoaisService {

    private final DadosPessoaisClient dadosPessoaisClient;

    public List<DadosPessoaisDTO> listar (DadosPessoaisDTO dadosPessoaisDTO){
        return dadosPessoaisClient.listar();
    }

    public DadosPessoaisDTO criar(DadosPessoaisDTO dadosPessoaisDTO){
        return dadosPessoaisClient.post(dadosPessoaisDTO);
    }

    public DadosPessoaisDTO listarDadosPorCpf(String cpf){
        return dadosPessoaisClient.getPorCpf(cpf);
    }


}
