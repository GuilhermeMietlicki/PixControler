package com.pix.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Endereco {
	
	@Id
	@Column
	String idEndereco;
	
	@Column
	String cidade;
	
	@Column
	String rua;
	
	@Column
	int numeroCasa;
	
	@Column
	String cep;
}
