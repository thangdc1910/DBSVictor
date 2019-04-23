package com.example.demo.dao;

import com.example.demo.mapper.BankAccountMapper;
import com.example.demo.model.BankAccount;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.sql.DataSource;
import java.util.List;

/**
 * Created by thangdo on 3/28/2019.
 */

@Repository
@Transactional
public class BankAccountDAO extends JdbcDaoSupport {

    public BankAccountDAO(DataSource dataSource) {
        this.setDataSource(dataSource);
    }

    public List<BankAccount> getBankAccounts() {
        String sql = BankAccountMapper.BASE_SQL;

        Object[] params = new Object[] {};
        BankAccountMapper mapper = new BankAccountMapper();
        List<BankAccount> list = this.getJdbcTemplate().query(sql, params, mapper);

        return list;
    }

}
