package com.example.account_details_crud_operations.controller;

import com.example.account_details_crud_operations.entities.Account;
import com.example.account_details_crud_operations.service.AccountServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/account")
public class MyController {
    @Autowired
    private AccountServiceImpl accountService;

    // adding new account
    @PostMapping("/create")
    public ResponseEntity<Account> createAcc(@RequestBody Account account){
        Account account1 = this.accountService.createAccount(account);
        return ResponseEntity.status(HttpStatus.CREATED).body(account1);
    }

    // get all account details
    @GetMapping("/getAllAccounts")
    public List<Account> accounts(){
        return this.accountService.getAllAccountDetails();
    }
    // get account details
    @GetMapping("/get_details/{accountNo}")
    public Account getAccountById(@PathVariable("accountNo") int accountNo){
       Optional<Account> account= this.accountService.findByAccountNo(accountNo);
       if(account.isEmpty()){
           throw new RuntimeException("account is not present with this accountNo");
       }else {
           Account account1 = account.get();
           return account1;
       }
    }
    // add money in account
    @PutMapping("/depositmoney/{accountNo}/{money}")
    public Account depositMoney(@PathVariable("accountNo") int accountNo,@PathVariable("money") Double money){
        return this.accountService.depositMoney(accountNo,money);
    }

    // withdraw amount from the account
    @PutMapping("/withdrawAmount/{accountNo}/{money}")
    public Account withdrawAmount(@PathVariable("accountNo") int acc_no,@PathVariable("money") Double drawAmount){
        return this.accountService.withdrawMoney(acc_no,drawAmount);
    }

    // delete account by
    @DeleteMapping("/delete/{accountNo}")
    public String deleteAccount(@PathVariable("accountNo")int acc_no){
        this.accountService.closeAccount(acc_no);
        return "account deleted successfully";
    }
}
