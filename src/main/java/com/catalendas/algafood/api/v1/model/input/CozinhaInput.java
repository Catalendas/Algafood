package com.catalendas.algafood.api.v1.model.input;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class CozinhaInput {

	@NotBlank
	private String nome;
	
}
