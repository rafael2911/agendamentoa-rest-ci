package br.com.crcarvalho.agendamentos.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HomeController {
	
	@GetMapping
	public String index() {
		return "Olá pessoal, seja bem vindo...";
	}
	
}
