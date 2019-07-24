package com.br.zup.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.br.zup.modells.Cliente;

@Repository
public interface ClienteRepository extends CrudRepository<Cliente, Integer> {

}
