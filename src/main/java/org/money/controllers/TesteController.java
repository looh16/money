package org.money.controllers;

import org.money.repository.TipoRepository;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@Configuration
@ComponentScan("org.money.repository")
@EnableJpaRepositories
public class TesteController {
	
	//@Autowired
	//@Qualifier("TipoRepository")
	TipoRepository repository;
	
	@RequestMapping("/")
	public String index(){
		System.out.println("testando a estrutura");
		return "teste";
	}


}
