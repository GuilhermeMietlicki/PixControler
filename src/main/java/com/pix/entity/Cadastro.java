package com.pix.entity;

import com.pix.embedded.EnderecoEmbed;

import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Cadastro {
	
	@Id
	@Column(name="ID_CADASTRO")
	String idCadastro;
	
	String telefone;
	
	String email;
	
	@Embedded
	EnderecoEmbed endereco;
}
