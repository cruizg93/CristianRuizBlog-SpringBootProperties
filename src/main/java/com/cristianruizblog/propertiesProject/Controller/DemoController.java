package com.cristianruizblog.propertiesProject.Controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {
	
	@Value("${com.cristianruizblog.titulo}")
	private String titulo;
	
	@Value("${com.cristianruizblog.util.cont.post}")
	private String cont;
	
	@GetMapping
	public String index(Model modelo) {
		modelo.addAttribute("mititulo", titulo);
		modelo.addAttribute("segundoValor",cont);
		return "index";
	}
}
