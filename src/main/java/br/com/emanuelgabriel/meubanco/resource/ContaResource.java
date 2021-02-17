package br.com.emanuelgabriel.meubanco.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.emanuelgabriel.meubanco.model.Conta;
import br.com.emanuelgabriel.meubanco.repository.ContaRepository;

@RestController
@RequestMapping(name = "/contas")
public class ContaResource {

	@Autowired
	private ContaRepository contaRepository; // nosso repositório de conta

	@PostMapping
	public Conta salvar(@RequestBody Conta conta) {
		return this.contaRepository.save(conta);
	}

	@GetMapping
	public List<Conta> findAll() {
		return this.contaRepository.findAll();
	}

}
