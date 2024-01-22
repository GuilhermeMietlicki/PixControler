package com.pix.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pix.entity.Cadastro;



@Repository
public interface CadastroRepositories extends JpaRepository<Cadastro, String>{
	
	
}
