package test.spring.test;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by appleowner on 1/24/16.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:test/context-test.xml")
public class ContextTest {
    @Autowired
    private SomeBO someBO;

    @Test
    public void testSay(){
        assertNotNull(someBO.say());
    }
}
