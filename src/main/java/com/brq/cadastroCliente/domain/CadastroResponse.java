package com.brq.cadastroCliente.domain;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder 
@Getter
@Setter
public class CadastroResponse {
	
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private String mensagem;
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private int codigo;
	private String nome;
	private long usuarioId;
	private String token;
	

}
