package com.gof.facade;

import subsistema1.CrmService;
import subsistema2.CepApi;

public class Facade {

    public void migrarCliente(String nome, String cep){
        String cidade = CepApi.getInstancia().recuperarCidade(cep);
        String uf = CepApi.getInstancia().recuperarUf(cep);

        CrmService.gravarCliente(nome, cep, cidade, uf);

    }

}
