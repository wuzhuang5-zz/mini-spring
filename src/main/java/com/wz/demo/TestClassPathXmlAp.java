package com.wz.demo;

import com.wz.context.ApplicationContext;
import com.wz.context.ClassPathXmlApplicationContext;

/**
 * @Author: wz
 */
public class TestClassPathXmlAp {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
    }
}
