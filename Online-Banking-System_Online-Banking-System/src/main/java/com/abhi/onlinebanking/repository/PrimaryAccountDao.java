package com.abhi.onlinebanking.repository;

import org.springframework.data.repository.CrudRepository;

import com.abhi.onlinebanking.entity.PrimaryAccount;


public interface PrimaryAccountDao extends CrudRepository<PrimaryAccount, Long> {

    PrimaryAccount findByAccountNumber(int accountNumber);
}