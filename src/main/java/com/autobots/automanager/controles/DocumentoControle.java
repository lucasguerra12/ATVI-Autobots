package com.autobots.automanager.controles;

import java.util.List;
import java.util.Optional;

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

import com.autobots.automanager.entidades.Documento;
import com.autobots.automanager.repositorios.DocumentoRepositorio;
import com.autobots.automanager.servicos.DocumentoServico; 

@RestController
@RequestMapping("/documento")
public class DocumentoControle {
	
	@Autowired
	private DocumentoServico documentoServico;
	
	@Autowired
	private DocumentoRepositorio repositorio; 

	@GetMapping("/documento/{id}")
	public ResponseEntity<Documento> obterDocumento(@PathVariable long id) {
		Optional<Documento> documento = repositorio.findById(id);
		if (documento.isPresent()) {
			return new ResponseEntity<>(documento.get(), HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

	@GetMapping("/documentos")
	public List<Documento> obterDocumentos() {
		return repositorio.findAll();
	}
	
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
	public ResponseEntity<?> atualizarDocumento(@PathVariable long documentoId, @RequestBody Documento atualizacao) {
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