package com.br.zup.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.br.zup.services.ClienteService;

@Controller
public class ClienteController {
	 @Autowired
	 private ClienteService clienteService;
	 
	 
}
