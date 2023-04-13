package com.generation.helloword.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {
	
	@GetMapping
	public String hello(){
		return "<i>Hello Turma 62!</i>";
		}
	
	@GetMapping("/bsm")
	public String bsm() {
		return "<b>Responsabilidade Pessoal<br />"
				+ "Mentalidade de Crescimento<br />"
				+ "Orientação ao Futuro<br />"
				+ "Persistência<br />"
				+ "Comunicação<br />"
				+ "Orientação aos Detalhes<br />"
				+ "Trabalho em Equipe<br />"
				+ "Proatividade</b>";
	}
	
	@GetMapping("/objetivos")
	public String objetivos() {
		return "<b>Objetivos<br />"
				+ "- Melhorar minha diciplina<br />"
				+ "- Melhorar meu foco<br />"
				+ "- Participar mais das aulas<br />"
				+ "- Apender o spring<br />"
				+ "- Revisar os conceitos de Sql</b>";
	}
 }
