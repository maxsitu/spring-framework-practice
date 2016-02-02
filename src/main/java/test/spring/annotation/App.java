package test.spring.annotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import test.spring.annotation.service.AccountService;
import test.spring.annotation.service.DefaultService;

/**
 * Created by appleowner on 2/1/16.
 */
@Configuration
@PropertySource("classpath:annotation/acct.properties")
public class App {
    @Value("${account.max_size}")
    private int maxSize;

    @Bean
    public DefaultService getAccountService(){
        return new AccountService(maxSize);
    }

    @Bean
    public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
        return new PropertySourcesPlaceholderConfigurer();
    }

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(App.class);
        DefaultService acctSvc = context.getBean(DefaultService.class);
        acctSvc.service();
    }
}
