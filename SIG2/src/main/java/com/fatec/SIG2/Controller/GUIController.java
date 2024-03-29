package com.fatec.SIG2.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class GUIController {
	@GetMapping("/")
	public ModelAndView menu() {
		return new ModelAndView("paginaMenu");
	}

	@GetMapping("/login")
	public ModelAndView autenticacao() {
		return new ModelAndView("paginaLogin");
	}

	@GetMapping("/clientes")
	public ModelAndView cadastrarCliente() {
		return new ModelAndView("cadastrarCliente");
	}

	@GetMapping("/fornecedores")
	public ModelAndView cadastrarFornecedor() {
		return new ModelAndView("cadastrarFornecedor");
	}
}
