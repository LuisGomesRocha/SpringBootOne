package br.com.zup.SpringBootOne.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.zup.SpringBootOne.domain.Cadastro;
import br.com.zup.SpringBootOne.dto.CadastroRequest;
import br.com.zup.SpringBootOne.dto.CadastroResponse;
import br.com.zup.SpringBootOne.service.CadastroService;

@RestController
@RequestMapping(value = "/api/cadastro")
public class CadastroController {

	@Autowired
	CadastroService cadastroService;
	

	// Criar Cadastro
	@PostMapping
	public ResponseEntity<CadastroResponse> novoCadastro(@Validated  @RequestBody CadastroRequest cadastroRequest) throws Exception {

		Cadastro cadastro = cadastroRequest.toModel();
		cadastroService.cadastrar(cadastro);
		CadastroResponse cadastroResponse = cadastro.toResponse();
		
		return ResponseEntity.status(HttpStatus.OK).body(cadastroResponse);
		
	}

	// Buscar Cadastro
	@GetMapping("/{id}")

	public ResponseEntity<CadastroResponse> buscar(@PathVariable Long id) {

		return ResponseEntity.status(HttpStatus.OK).body(cadastroService.buscar(id).toResponse());

	}
	
	@GetMapping("/listar")
	public ResponseEntity <List<Cadastro>>  buscarTudo() {

		return ResponseEntity.status(HttpStatus.OK).body(cadastroService.buscarTudo());

	}
	
		

}
