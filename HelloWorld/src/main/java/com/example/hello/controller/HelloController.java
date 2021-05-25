package com.example.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@GetMapping("/hello")
	public String BrunoOtario() {
		return "<center><h1 style='color: #191970'>Hello World Turma 23!</h1></center>";
	}
	
	@GetMapping("/habilidades")
	public String DaniloBomNoVava(){
		return "<center>Habilidade: Persitência, <br> Mentalidade: Atenção aos detalhes</center>";
		
	}
	
	@GetMapping("/objetivo")
	public String objetivo(){
		return "Tenho por objetivo aprender o maximo possivel";
		
	}	
}
