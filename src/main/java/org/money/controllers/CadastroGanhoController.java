package org.money.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CadastroGanhoController {

	@RequestMapping("cadastraGanho")
	public String cadastraGasto(){
		
		return "cadastraGanho";
	}
}
