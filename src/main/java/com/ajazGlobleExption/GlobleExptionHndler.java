package com.ajazGlobleExption;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.ajaz.imp.ResourceNotFountExption;

@RestControllerAdvice
public class GlobleExptionHndler {
	@ExceptionHandler(ResourceNotFountExption.class)
public ResponseEntity<Apiresource> ECxpiyi(ResourceNotFountExption ex){
	String m = ex.getMessage();
	Apiresource apiresource = Apiresource.builder().mesass(m).success(true).status(HttpStatus.NOT_FOUND).build();
	return new ResponseEntity<Apiresource>(apiresource,HttpStatus.NOT_FOUND);
}
}
