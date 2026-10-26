package com.ajaz.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ajaz.Entity.UserAjaz;
import com.ajaz.imp.UserImplement;

@RestController
@RequestMapping("/UserA")
public class mycontroller {
	@Autowired
	private UserImplement implement;
	
@PostMapping
public ResponseEntity<UserAjaz> saves(@RequestBody UserAjaz ajaz){
	UserAjaz savem = implement.savem(ajaz);
	return ResponseEntity.ok(savem);
	
}
@GetMapping("/{userId}")
public ResponseEntity<UserAjaz>Singleget(@PathVariable String userId){
	UserAjaz singlem = implement.Singlem(userId);
	
	return ResponseEntity.ok(singlem);
}

}
