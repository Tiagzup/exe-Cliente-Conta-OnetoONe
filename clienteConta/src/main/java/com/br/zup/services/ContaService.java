package com.br.zup.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.zup.modells.Cliente;
import com.br.zup.modells.Conta;
import com.br.zup.repositories.ClienteRepository;
import com.br.zup.repositories.ContaRepository;

@Service
public class ContaService {
	@Autowired
	private ClienteRepository clienteRepository;
	@Autowired
	private ContaRepository contaRepository;
	
	public Iterable<Accounts> listAccount(){
		return contaRepository.findAll();
	}
	
	public void SaveAccount (Cliente cliente, Conta conta) {
		conta.setCliente(cliente);
		contaRepository.save(conta);
	}
	
}
