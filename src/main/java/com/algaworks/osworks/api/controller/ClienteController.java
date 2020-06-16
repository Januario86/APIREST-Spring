package com.algaworks.osworks.api.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.algaworks.osworks.domain.model.Cliente;

@RestController
public class ClienteController {
	
	@GetMapping("/clientes")
	public List<Cliente> lista() {
		
		var cliente = new Cliente();
		cliente.setId(1L);
		cliente.setNome("João");
		cliente.setTelefone("21 9999999");
		cliente.setEmail("emailTeste@Gmail.com");
		
		var cliente2 = new Cliente();
		
		cliente2.setId(2L);
		cliente2.setNome("Maria");
		cliente2.setTelefone("21 98888888");
		cliente2.setEmail("mariadaSilva@Gmail.com");
		
		return Arrays.asList(cliente,cliente2);
	}
}
