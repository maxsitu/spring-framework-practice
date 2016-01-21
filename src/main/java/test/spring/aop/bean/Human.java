package test.spring.aop.bean;

/**
 * Created by appleowner on 1/20/16.
 */
public class Human implements Sleepable {
    @Override
    public void sleep() {
        System.out.println("睡觉！");
    }
}
