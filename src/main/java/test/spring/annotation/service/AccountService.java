package test.spring.annotation.service;

import org.springframework.stereotype.Service;

/**
 * Created by appleowner on 2/1/16.
 */
public class AccountService implements DefaultService {
    private int maxSize;
    public AccountService(int maxSize) {
        this.maxSize = maxSize;
    }

    @Override
    public void service() {
        System.out.println("service account...");
        System.out.println("account max_size: " + maxSize);
    }
}
