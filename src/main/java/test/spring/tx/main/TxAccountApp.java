package test.spring.tx.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import test.spring.tx.Account;
import test.spring.tx.service.AccountService;

/**
 * Created by appleowner on 1/31/16.
 */
public class TxAccountApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:tx/context-tx.xml");
        AccountService accountService = (AccountService) context.getBean("accountService");
        Account account = accountService.getByAcctId(0);
        System.out.println(account);
        System.out.println(accountService.getCount());
    }
}
