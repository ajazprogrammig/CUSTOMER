package com.ajaz.imp;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ajaz.Entity.UserAjaz;
import com.ajaz.UserajazInterface.UserajazInterface;
import com.ajaz.inte.userInterface;


@Service
public class UserImplement implements UserajazInterface {
	@Autowired
private userInterface interface1;
	@Override
	public UserAjaz savem(UserAjaz ajaz) {
		String ee = UUID.randomUUID().toString();
		ajaz.setUserId(ee);
		return interface1.save(ajaz);
	}

	@Override
	public UserAjaz Singlem(String userId) {
	UserAjaz ajazz	=interface1.findById(userId).orElseThrow(() -> new ResourceNotFountExption(
                "ResourceNotFountExption not single user available " + userId));
		return  ajazz ;
	}

	@Override
	public List<UserAjaz> Alluser() {
		
		return interface1.findAll();
	}

}
