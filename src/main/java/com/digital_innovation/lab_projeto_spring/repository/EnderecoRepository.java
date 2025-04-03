package com.digital_innovation.lab_projeto_spring.repository;

import com.digital_innovation.lab_projeto_spring.entity.Endereco;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnderecoRepository extends CrudRepository<Endereco, String> {
}
