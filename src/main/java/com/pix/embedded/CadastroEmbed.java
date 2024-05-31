package com.pix.embedded;

import jakarta.persistence.Embeddable;

@Embeddable
public class CadastroEmbed {

	String cidade;
	
	String rua;
	
	int numeroCasa;
	
	String cep;
}
