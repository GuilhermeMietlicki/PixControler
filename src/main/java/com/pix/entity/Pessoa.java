package com.pix.entity;

import com.pix.embedded.CadastroEmbed;

import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Pessoa {
	
	@Id
	private String cpf;
	
	private String nome;
	
	private int idade;
	
	@Embedded
	private CadastroEmbed cadastro;
	
	


}
