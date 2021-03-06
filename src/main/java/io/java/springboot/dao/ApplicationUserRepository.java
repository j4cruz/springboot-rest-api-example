package io.java.springboot.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import io.java.springboot.model.ApplicationUser;

public interface ApplicationUserRepository extends JpaRepository<ApplicationUser, Long> {
    ApplicationUser findByUsername(String username);
}