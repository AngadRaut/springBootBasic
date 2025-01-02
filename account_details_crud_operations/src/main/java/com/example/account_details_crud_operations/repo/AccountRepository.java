package com.example.account_details_crud_operations.repo;

import com.example.account_details_crud_operations.entities.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account,Integer> {

  /*  @Query("select a from account_details a where a.account_no= :no")
    Account findById(@Param("no") Long accountNo);*/
}
