package com.devops.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devops.demo.domain.Login;

public interface LoginRepo extends JpaRepository<Login,String>{
    Login findByUsernameAndPassword(String username, String password);

}
