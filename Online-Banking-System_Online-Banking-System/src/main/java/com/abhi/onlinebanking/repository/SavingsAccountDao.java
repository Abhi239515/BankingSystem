package com.abhi.onlinebanking.repository;

import org.springframework.data.repository.CrudRepository;

import com.abhi.onlinebanking.entity.SavingsAccount;


public interface SavingsAccountDao extends CrudRepository<SavingsAccount, Long> {

    SavingsAccount findByAccountNumber(int accountNumber);
}