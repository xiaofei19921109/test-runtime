package com.example.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

    @Test
    public void contextLoads() {
    }

    @Test
    public void r1_test() throws InterruptedException {
        Thread.sleep(15000);
        System.out.println(Runtime.getRuntime());
}

    @Test
    public void r2_test() throws InterruptedException {
        Thread.sleep(15000);
        System.out.println(Runtime.getRuntime());
    }

}
