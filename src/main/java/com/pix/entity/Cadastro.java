package com.pix.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Table
public class Cadastro {
	
	@Id
	@Column
	String idCadastro;
	
	@Column
	String telefone;
	
	@Column
	String email;
	
	@Column
	Endereco endereco;
}
