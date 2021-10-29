package com.brq.cadastroCliente.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.brq.cadastroCliente.business.RegraDeNegocioBO;
import com.brq.cadastroCliente.domain.CadastroRequest;
import com.brq.cadastroCliente.domain.CadastroResponse;

import io.swagger.v3.oas.annotations.parameters.RequestBody;




@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/cadastro")
public class AppController {
	
	
	@Autowired
	private RegraDeNegocioBO regraDeNegocioBO;
	
	/*@PostMapping
	public ResponseEntity<CadastroResponse> buscaCep(@RequestBody @Valid CadastroRequest request) {
		ResponseEntity<CadastroResponse> response = null;
		try {
			regraDeNegocioBO.validaCadastro(request);
			CadastroResponse obterResposta = UsuarioService.insereUsuario(request.getEmail());
			return new ResponseEntity<CadastroResponse>(insereUsuario, HttpStatus.OK);
			return null;
		} catch (AppException app) {
			String msg = app.getMessage();
			HttpStatus status = HttpStatus.BAD_REQUEST;
			response = obterRespostaErro(msg, status);
			return response;
		} catch (Exception e) {
			return obterRespostaErro("Serviço indisponível", HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	private ResponseEntity<CadastroResponse> obterRespostaErro(String msg, HttpStatus status) {
		ResponseEntity<CadastroResponse> response;
		CadastroResponse obterResposta = new CadastroResponse();
		obterResposta.setMensagem(msg);
		obterResposta.setCodigo(status.value());
		response = new ResponseEntity<>(obterResposta, status);
		return response;
	}*/
	
}


