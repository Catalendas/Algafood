package com.catalendas.algafood.api.v1.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.hateoas.RepresentationModel;
import org.springframework.hateoas.server.core.Relation;

@Relation(collectionRelation = "usuarios")
@Setter
@Getter
public class UsuarioModel extends RepresentationModel<UsuarioModel> {

//	@ApiModelProperty(example = "1")
	private Long id;
	
//	@ApiModelProperty(example = "João da Silva")
	private String nome;
	
//	@ApiModelProperty(example = "joao.ger@algafood.com.br")
	private String email;
	
}
