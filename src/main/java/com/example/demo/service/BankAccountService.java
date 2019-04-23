package com.example.demo.service;

import com.example.demo.dao.BankAccountDAO;
import com.example.demo.model.BankAccount;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by thangdo on 3/28/2019.
 */

@Service
public class BankAccountService {

    @Autowired
    private BankAccountDAO bankAccountDAO;

    public List<BankAccount> getBankAccounts() {
        return bankAccountDAO.getBankAccounts();
    }
}
