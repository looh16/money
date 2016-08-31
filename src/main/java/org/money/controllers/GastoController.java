package org.money.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GastoController {

	
	@RequestMapping("/gasto")
	public String gasto(){
		
		return "gasto";
	}
	
	/*@RequestMapping("/novoGasto11")
	public String novoGasto(){
		
		
		return "cadastraGasto";
	}*/
}
