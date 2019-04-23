package com.example.demo.mapper;

import com.example.demo.model.BankAccount;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by thangdo on 3/28/2019.
 */
public class BankAccountMapper implements RowMapper<BankAccount>{

    public static final String BASE_SQL = "Select * From bank_account";

    @Override
    public BankAccount mapRow(ResultSet rs, int rowNum) throws SQLException {
        Long id = rs.getLong("id");
        String firstName = rs.getString("firstname");
        String lastName = rs.getString("lastname");
        double balance = rs.getDouble("balance");
        return BankAccount.builder().id(id).firstName(firstName).lastName(lastName).balance(balance).build();
    }
}
