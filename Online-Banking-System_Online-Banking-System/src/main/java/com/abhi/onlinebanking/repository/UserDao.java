package com.abhi.onlinebanking.repository;

import org.springframework.data.repository.CrudRepository;

import com.abhi.onlinebanking.entity.User;

import java.util.List;

public interface UserDao extends CrudRepository<User, Long> {

    User findByUsername(String username);

    User findByEmail(String email);

    List<User> findAll();
}