package test.spring.test;

/**
 * Created by appleowner on 1/24/16.
 */
public class SomeBO {
    public String say(){
        System.out.println("Hello from " + this.getClass().getName() + "!");
        return this.getClass().getName();
    }
}
