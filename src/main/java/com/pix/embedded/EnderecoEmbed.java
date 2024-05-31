package com.pix.embedded;

import jakarta.persistence.Embeddable;

@Embeddable
public class EnderecoEmbed {
	String cidade;

	String rua;

	int numeroCasa;

	String cep;
}
