package com.abhi.onlinebanking.repository;

import org.springframework.data.repository.CrudRepository;

import com.abhi.onlinebanking.security.Role;

public interface RoleDao extends CrudRepository<Role, Integer> {

    Role findByName(String name);
}