package com.pix.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pix.entity.Pessoa;

@Repository
public interface PessoaRepositories extends JpaRepository<Pessoa, String> {

}
