package com.ajaz.inte;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ajaz.Entity.UserAjaz;

public interface userInterface extends JpaRepository<UserAjaz, String> {

}
