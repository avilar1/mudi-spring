package br.com.alura.mvc.mudi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/oferta")
public class OfertaController {

	
	@GetMapping
	public String getFormularioParaOfertas() {
		return "oferta/home";

	}
	
	/**
	 * De fato, a nossa aplicação em Java com 
	 * Spring apenas está processando o 
	 * comportamento e retornando os dados, 
	 * mas não se preocupa mais em 
	 * gerar a visão: o HTML.
	 */
}

