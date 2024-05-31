package com.pix.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Endereco {
	
	@Id
	String idEndereco;
	
	String cidade;
	
	String rua;
	
	int numeroCasa;
	
	String cep;
}
