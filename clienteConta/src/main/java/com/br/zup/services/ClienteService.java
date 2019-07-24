package com.br.zup.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.zup.modells.Cliente;
import com.br.zup.repositories.ClienteRepository;

@Service
public class ClienteService {
	@Autowired
	private ClienteRepository clienteRepository;
	
	public Iterable<Cliente> mostrarClientes(){
		return clienteRepository.findAll();
	}
}
