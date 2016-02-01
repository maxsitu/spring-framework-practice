package test.spring.tx.service;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import test.spring.tx.Account;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by appleowner on 1/31/16.
 */
public class AccountService {

    private JdbcTemplate jdbcTemplate;

    public AccountService(DataSource dataSource){
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    public Account getByAcctId(long acctId){
        throw new UnsupportedOperationException();
//        Account account = this.jdbcTemplate.queryForObject(
//                "select * from PUBLIC.account where acct_id=?", new Object[]{acctId},
//                new RowMapper<Account>() {
//                    @Override
//                    public Account mapRow(ResultSet rs, int rowNum) throws SQLException {
//                        Account acct = new Account();
//                        acct.setAcct_id(rs.getLong("acct_id"));
//                        acct.setFirstName(rs.getString("first_name"));
//                        acct.setLastName(rs.getString("last_name"));
//                        acct.setDob(rs.getString("dob"));
//                        acct.setSsn(rs.getString("ssn"));
//                        return acct;
//                    }
//                });
//        return account;
    }

    public int getCount(){
        int cnt = this.jdbcTemplate.queryForObject(
                "select count(*) from account",
                Integer.class);
        return cnt;
    }
}
