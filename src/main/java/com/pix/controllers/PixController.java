package com.pix.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.pix.api.PixApi;
import com.pix.entity.Pessoa;

public class PixController implements PixApi{

	@Override
	public ResponseEntity<Pessoa> getPessoa() {
		
		Pessoa exemploDePessoa = new Pessoa();
		
		return ResponseEntity.status(HttpStatus.OK)
		        .body(exemploDePessoa);
	}

}
