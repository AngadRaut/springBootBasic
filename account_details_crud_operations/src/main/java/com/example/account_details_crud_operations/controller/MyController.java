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
    @PutMapping("/create")
    public ResponseEntity<Account> createAcc(@RequestBody Account account){
        Account account1 = this.accountService.createAccount(account);
        return ResponseEntity.status(HttpStatus.CREATED).body(account1);
    }

    // get all account details
    @GetMapping("/getAllAccounts")
    public ResponseEntity<List<Account>> accounts(){
        List<Account> accountList =  this.accountService.getAllAccountDetails();
        return ResponseEntity.status(HttpStatus.FOUND).body(accountList);
    }
    // get account details
    @GetMapping("/get_details/{accountNo}")
    public ResponseEntity<Account> getAccountById(@PathVariable("accountNo") int accountNo) {
        Optional<Account> account = this.accountService.findByAccountNo(accountNo);
        if (account.isEmpty()) {
            // If no account is found, return a 404 Not Found status
            return ResponseEntity.notFound().build();
        }
        // If account is found, return it with a 200 OK status
        return ResponseEntity.ok(account.get());
    }
    
    // add money in account update the amount
    @PatchMapping("/depositmoney/{accountNo}/{money}")
    public ResponseEntity depositMoney(@PathVariable("accountNo") int accountNo, @PathVariable("money") Double money){
         Account account = this.accountService.depositMoney(accountNo,money);
         return new ResponseEntity("account balance updated",HttpStatus.CREATED);
    }

    // withdraw amount from the account update the amount
    @PatchMapping("/withdrawAmount/{accountNo}/{money}")
    public ResponseEntity<Account> withdrawAmount(@PathVariable("accountNo")
                                                      int acc_no,@PathVariable("money") Double drawAmount){
        Account account =  this.accountService.withdrawMoney(acc_no,drawAmount);
         return ResponseEntity.ok(account);
    }

    // delete account by . delete the account
    @DeleteMapping("/delete/{accountNo}")
    public ResponseEntity<String> deleteAccount(@PathVariable("accountNo")int acc_no){
        this.accountService.closeAccount(acc_no);
        return ResponseEntity.status(HttpStatus.OK).body("account deleted successfully");
    }
}