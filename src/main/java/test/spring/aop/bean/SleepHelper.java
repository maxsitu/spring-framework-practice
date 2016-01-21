package test.spring.aop.bean;

import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * Created by appleowner on 1/20/16.
 */
public class SleepHelper implements MethodBeforeAdvice, AfterReturningAdvice {
    @Override
    public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
        System.out.println("睡前脱衣服！");
    }

    @Override
    public void before(Method method, Object[] args, Object target) throws Throwable {
        System.out.println("起床穿衣服！");
    }
}
