package br.com.zup.SpringBootOne.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.com.zup.SpringBootOne.domain.Cadastro;
import br.com.zup.SpringBootOne.repository.CadastroRepository;

@Service
public class CadastroService {

	@Autowired
	CadastroRepository cadastroRepository;

	// Cadastrar

	public Cadastro cadastrar(Cadastro cadastro) throws Exception {

		return cadastroRepository.save(cadastro);

	}

	// Buscar

	public Cadastro buscar(Long id) {

		return cadastroRepository.findById(id).get();

	}

	public List<Cadastro> buscarTudo() {

		return cadastroRepository.findAll();

	}

	
}
