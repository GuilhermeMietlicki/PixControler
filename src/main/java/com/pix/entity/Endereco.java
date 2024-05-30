package com.pix.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Endereco {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
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
