package com.autobots.automanager.controles;

import java.util.List; // Import novo
import java.util.Optional; // Import novo

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.autobots.automanager.entidades.Telefone;
import com.autobots.automanager.repositorios.TelefoneRepositorio; 
import com.autobots.automanager.servicos.TelefoneServico;

@RestController
@RequestMapping("/telefone")
public class TelefoneControle {

	@Autowired
	private TelefoneServico telefoneServico;
	
	@Autowired
	private TelefoneRepositorio repositorio; 

	@GetMapping("/telefone/{id}")
	public ResponseEntity<Telefone> obterTelefone(@PathVariable long id) {
		Optional<Telefone> telefone = repositorio.findById(id);
		if (telefone.isPresent()) {
			return new ResponseEntity<>(telefone.get(), HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

	@GetMapping("/telefones")
	public List<Telefone> obterTelefones() {
		return repositorio.findAll();
	}
	
	@PostMapping("/adicionar/{clienteId}")
	public ResponseEntity<?> adicionarTelefone(@PathVariable long clienteId, @RequestBody Telefone novoTelefone) {
		boolean adicionado = telefoneServico.adicionarTelefone(clienteId, novoTelefone);
		if (adicionado) {
			return new ResponseEntity<>(HttpStatus.CREATED);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

	@PutMapping("/atualizar/{telefoneId}")
	public ResponseEntity<?> atualizarTelefone(@PathVariable long telefoneId, @RequestBody Telefone atualizacao) {
		boolean atualizado = telefoneServico.atualizarTelefone(telefoneId, atualizacao);
		if (atualizado) {
			return new ResponseEntity<>(HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND); 
		}
	}

	@DeleteMapping("/excluir/{clienteId}/{telefoneId}")
	public ResponseEntity<?> excluirTelefone(@PathVariable long clienteId, @PathVariable long telefoneId) {
		boolean excluido = telefoneServico.excluirTelefone(clienteId, telefoneId);
		if (excluido) {
			return new ResponseEntity<>(HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
}