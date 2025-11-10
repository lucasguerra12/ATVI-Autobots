package com.autobots.automanager.controles;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.autobots.automanager.entidades.Documento;
import com.autobots.automanager.servicos.DocumentoServico; 

@RestController
@RequestMapping("/documento")
public class DocumentoControle {
	@Autowired
	private DocumentoServico documentoServico;
	
	@PostMapping("/adicionar/{clienteId}")
	public ResponseEntity<?> adicionarDocumento(@PathVariable long clienteId, @RequestBody Documento novoDocumento) {
		
		boolean adicionado = documentoServico.adicionarDocumento(clienteId, novoDocumento);
		
		if (adicionado) {
			return new ResponseEntity<>(HttpStatus.CREATED);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND); 
		}
	}

	@PutMapping("/atualizar/{documentoId}")
	public ResponseEntity<?> atualizarDocumento(
			@PathVariable long documentoId,
			@RequestBody Documento atualizacao) {
		
		boolean atualizado = documentoServico.atualizarDocumento(documentoId, atualizacao);
		
		if (atualizado) {
			return new ResponseEntity<>(HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND); 
		}
	}

	@DeleteMapping("/excluir/{clienteId}/{documentoId}")
	public ResponseEntity<?> excluirDocumento(@PathVariable long clienteId, @PathVariable long documentoId) {
		
		boolean excluido = documentoServico.excluirDocumento(clienteId, documentoId);
		
		if (excluido) {
			return new ResponseEntity<>(HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND); 
		}
	}
}