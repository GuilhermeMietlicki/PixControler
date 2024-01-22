package com.pix.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import com.pix.entity.Pessoa;

public interface PixApi {
	
	@GetMapping("/get-pessoa")
	public ResponseEntity<Pessoa> getPessoa();
}
