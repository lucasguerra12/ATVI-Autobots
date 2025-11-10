package com.autobots.automanager.controles;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.autobots.automanager.entidades.Endereco;
import com.autobots.automanager.servicos.EnderecoServico;

@RestController
@RequestMapping("/endereco")
public class EnderecoControle {

	@Autowired
	private EnderecoServico enderecoServico;

	@PutMapping("/atualizar/{clienteId}")
	public ResponseEntity<?> atualizarEndereco(@PathVariable long clienteId, @RequestBody Endereco atualizacao) {
		
		boolean atualizado = enderecoServico.atualizarEndereco(clienteId, atualizacao);
		
		if (atualizado) {
			return new ResponseEntity<>(HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND); // Cliente não encontrado
		}
	}

	@DeleteMapping("/excluir/{clienteId}")
	public ResponseEntity<?> excluirEndereco(@PathVariable long clienteId) {
		
		boolean excluido = enderecoServico.excluirEndereco(clienteId);
		
		if (excluido) {
			return new ResponseEntity<>(HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND); // Cliente não encontrado
		}
	}
}