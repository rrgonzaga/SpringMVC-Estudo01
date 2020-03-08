package org.casadocodigo.loja.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping(value="/")
	public String index() {
		//aqui ainda vamos carregar os produtos.
		System.out.println("Carregando os produtos");
		return "hello-world";
	}

}
