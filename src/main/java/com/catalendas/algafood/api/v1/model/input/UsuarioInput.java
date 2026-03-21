package com.catalendas.algafood.api.v1.model.input;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class UsuarioInput {

	@NotBlank
	private String nome;

	@NotBlank
	@Email
	private String email;
	
}
