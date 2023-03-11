package com.auth.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/auth")
public class AuthController {

	@Value("${auth.usuarios}")
	public String valor;
	
	protected final  Logger logger = LogManager.getLogger(getClass());
	@GetMapping("/${auth.usuarios}")
	private ResponseEntity<?> buscarUsuario() {
		logger.info(valor);
		return ResponseEntity.status(HttpStatus.ACCEPTED).build();
	}
	
}
