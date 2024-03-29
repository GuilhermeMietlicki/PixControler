package com.pix.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pix.entity.Endereco;

@Repository
public interface EnderecoRepositories extends JpaRepository<Endereco, String> {

}
