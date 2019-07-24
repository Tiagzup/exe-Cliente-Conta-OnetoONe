package com.br.zup.modells;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
public class Cliente implements Serializable{
	public static final long serialVerisonUID = 1L;
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Integer id;
	
	@OneToOne(mappedBy = "cliente")
	private Conta conta;
	
	@NotBlank(message = "O campo nome precisa ser preenchido")
	@Size(min = 2, message = "O nome deve ter no mínimo duas letras")
	private String nome;
	@NotBlank(message = "O campo cpf recisa sem preenchido")
	@Size(min = 16, message = "O campo cpf precisa conter no mínido 16 dígitos")
	private String cpf;
	@NotBlank(message = "O campo telefone precisa sem preenchido")
	@Size(min = 8, message = "O telefone precisa ter 8 dígitos")
	private String telefone;
	
	
	
	public Cliente() {
		
	}
	
	public Conta getConta() {
		return conta;
	}

	public void setConta(Conta conta) {
		this.conta = conta;
	}



	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	
	
}
