package com.example.account_details_crud_operations.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "account_details")
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int account_no;
    private String accHolderName;
    private Double balance;
}
