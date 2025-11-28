package com.autobots.automanager.controles;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.autobots.automanager.entidades.Endereco;
import com.autobots.automanager.repositorios.EnderecoRepositorio;
import com.autobots.automanager.servicos.EnderecoServico;

@RestController
@RequestMapping("/endereco")
public class EnderecoControle {

	@Autowired
	private EnderecoServico enderecoServico;
	
	@Autowired
	private EnderecoRepositorio repositorio; 

	@GetMapping("/endereco/{id}")
	public ResponseEntity<Endereco> obterEndereco(@PathVariable long id) {
		Optional<Endereco> endereco = repositorio.findById(id);
		if (endereco.isPresent()) {
			return new ResponseEntity<>(endereco.get(), HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

	@GetMapping("/enderecos")
	public List<Endereco> obterEnderecos() {
		return repositorio.findAll();
	}

	@PutMapping("/atualizar/{clienteId}")
	public ResponseEntity<?> atualizarEndereco(@PathVariable long clienteId, @RequestBody Endereco atualizacao) {
		boolean atualizado = enderecoServico.atualizarEndereco(clienteId, atualizacao);
		if (atualizado) {
			return new ResponseEntity<>(HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

	@DeleteMapping("/excluir/{clienteId}")
	public ResponseEntity<?> excluirEndereco(@PathVariable long clienteId) {
		boolean excluido = enderecoServico.excluirEndereco(clienteId);
		if (excluido) {
			return new ResponseEntity<>(HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
}