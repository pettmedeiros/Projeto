package com.digital_innovation.lab_projeto_spring.service;

import com.digital_innovation.lab_projeto_spring.entity.Cliente;
import feign.Client;

public interface ClienteService {
    Iterable <Cliente> buscarTodos() {
    }

    Cliente buscarPorId(Long id);

    void inserir(Cliente cliente);

    void atualizar(Long id, Cliente cliente);

    void deletar(long id);

}
