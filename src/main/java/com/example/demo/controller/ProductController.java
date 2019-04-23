package com.example.demo.controller;

import com.example.demo.model.BankAccount;
import com.example.demo.service.BankAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by thangdo on 3/26/2019.
 */

@RestController
public class ProductController {

    @Autowired
    private BankAccountService bankAccountService;

    @RequestMapping(value = "/getAllProducts",method = RequestMethod.GET)
    public Map getAllProducts(){

        Map map=new HashMap<>();
        map.put("cocacola","999");
        map.put("lavi","000");
        return map;
    }
    @RequestMapping(value = "/getAllBankAccounts",method = RequestMethod.GET)
    public List<BankAccount> getAllBankAccounts(){
       return bankAccountService.getBankAccounts();
    }
}
