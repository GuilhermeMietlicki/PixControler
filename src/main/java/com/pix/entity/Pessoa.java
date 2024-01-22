package com.pix.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Table
public class Pessoa {
	
	@Id
	@Column
	private String cpf;
	
	@Column
	private String nome;
	
	@Column
	private int idade;
	
	@Column
	private Cadastro cadastro;
	


}
