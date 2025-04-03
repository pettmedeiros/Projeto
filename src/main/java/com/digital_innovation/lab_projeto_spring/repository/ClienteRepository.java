package com.digital_innovation.lab_projeto_spring.repository;

import com.digital_innovation.lab_projeto_spring.entity.Cliente;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends CrudRepository <Cliente, Long>{
}
