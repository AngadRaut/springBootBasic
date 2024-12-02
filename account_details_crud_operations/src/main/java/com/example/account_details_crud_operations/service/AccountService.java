package com.example.account_details_crud_operations.service;

import com.example.account_details_crud_operations.entities.Account;

import java.util.List;
import java.util.Optional;

public interface AccountService {
    public Account createAccount(Account account);
    List<Account> getAllAccountDetails();
    Account depositMoney(int account_no,Double money);
    Account withdrawMoney(int account_no,Double money);
    void closeAccount(int account_no);
    Optional<Account> findByAccountNo(int accountNo);
}
