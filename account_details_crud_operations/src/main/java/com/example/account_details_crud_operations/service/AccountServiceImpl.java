package com.example.account_details_crud_operations.service;

import com.example.account_details_crud_operations.repo.AccountRepository;
import com.example.account_details_crud_operations.entities.Account;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountRepository accountRepository;

    @Override
    public Account createAccount(Account account) {
        return this.accountRepository.save(account);
    }

    @Override
    public List<Account> getAllAccountDetails() {
        return this.accountRepository.findAll();
    }

    @Override
    public Account depositMoney(int account_no, Double money) {
        Optional<Account> account = this.accountRepository.findById(account_no);
        if (account.isEmpty()) {
            throw new RuntimeException("account is not present with this account no.");
        } else {
            Account account1 = account.get();
            Double balance = account1.getBalance() + money;
            account1.setBalance(balance);
            return this.accountRepository.save(account1);
        }

    }

    @Override
    public Account withdrawMoney(int account_no, Double money) {
        Optional<Account> account = this.accountRepository.findById(account_no);

        if (account.isEmpty()) {
            throw new RuntimeException("account is not present with this account no.");
        } else {
            Account account1 = account.get();
            double balance = 00.00;
            if (account1.getBalance() < money) {
                throw new RuntimeException("Account balance is less than the amount you entered..");
            } else {
                balance = account1.getBalance() - money;
                account1.setBalance(balance);
            }
            return this.accountRepository.save(account1);
        }
    }

    @Override
    public void closeAccount(int account_no) {
        Optional<Account> account = this.accountRepository.findById(account_no);
        if (account.isEmpty()){
            throw new RuntimeException("account with this account no is not present");
        }
        else {
            Account account1 = account.get();
            this.accountRepository.delete(account1);
        }
    }

    @Override
    public Optional<Account> findByAccountNo(int accountNo) {
        return this.accountRepository.findById(accountNo);
    }
}
