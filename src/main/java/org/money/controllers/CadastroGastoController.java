package org.money.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CadastroGastoController {

	@RequestMapping("cadastraGasto")
	public String cadastraGasto(){
		
		return "cadastraGasto";
	}
}
