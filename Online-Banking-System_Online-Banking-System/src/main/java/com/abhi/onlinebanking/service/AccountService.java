package com.abhi.onlinebanking.service;

import java.security.Principal;

import com.abhi.onlinebanking.entity.PrimaryAccount;
import com.abhi.onlinebanking.entity.SavingsAccount;



public interface AccountService {

    PrimaryAccount createPrimaryAccount();

    SavingsAccount createSavingsAccount();

    void deposit(String accountType, double amount, Principal principal);

    void withdraw(String accountType, double amount, Principal principal);

}
