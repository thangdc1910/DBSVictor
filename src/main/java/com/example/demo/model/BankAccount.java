package com.example.demo.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by thangdo on 3/28/2019.
 */

@Builder
@Getter
@Setter
public class BankAccount {
    private Long id;
    private String firstName;
    private String lastName;
    private double balance;
}
