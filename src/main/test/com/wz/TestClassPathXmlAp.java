package com.wz;


import com.wz.context.ApplicationContext;
import com.wz.context.ClassPathXmlApplicationContext;
import org.junit.Test;

public class TestClassPathXmlAp {
    @Test
    public void test() throws Exception{
        ApplicationContext context = new ClassPathXmlApplicationContext("ioc.xml");
        HelloService helloService = (HelloService) context.getBean("HelloService");
        helloService.sayHello("Java");
    }
}
