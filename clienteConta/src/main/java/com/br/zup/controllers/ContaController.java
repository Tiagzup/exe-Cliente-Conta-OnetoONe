package com.br.zup.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.br.zup.modells.Cliente;
import com.br.zup.modells.Conta;
import com.br.zup.services.ClienteService;
import com.br.zup.services.ContaService;


@Controller
public class ContaController {
	@Autowired
	private ClienteService clienteService;
	@Autowired
	private ContaService contaService;
	
	
	@GetMapping("/criarConta")
	public ModelAndView criarConta() {
		ModelAndView modelAndView = new ModelAndView();
		return modelAndView;
		
	}
	@PostMapping("/criarConta")
	public ModelAndView salvarConta(@Valid Conta conta, BindingResult bindingConta, 
			@Valid Cliente cliente, BindingResult bindingCliente) {
		ModelAndView modelAndView = new ModelAndView("criarConta.html");
		
		List<String> erros = new ArrayList<String>();
		if (bindingConta.hasErrors()|| bindingCliente.hasErrors()) {
			for (ObjectError erro : bindingConta.getAllErrors() ) {
				erros.add(erro.getDefaultMessage());
				modelAndView.addObject("erros", erros);
			}
		}else {
			modelAndView.addObject("messages", contaService.SalvarConta(cliente, conta));
		}
		return modelAndView;
	}
	@GetMapping("/Contas")
	public ModelAndView mostrarContas() {
		ModelAndView modelAndView = new ModelAndView();
		return modelAndView;
	}
}



















