package test.spring.aop.bean.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import test.spring.aop.bean.Sleepable;

/**
 * Created by appleowner on 1/20/16.
 */
public class AspectjAop {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("aop/aspectj-aop.xml");
        Sleepable human = (Sleepable) ctx.getBean("human");
        human.sleep();
    }
}
