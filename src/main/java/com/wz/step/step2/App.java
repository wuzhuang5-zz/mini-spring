package com.wz.step.step2;

import com.wz.step.HelloWorldService;

/**
 * @Description: test
 * @Author: wz
 */
public class App {
    public static void main(String[] args) throws ClassNotFoundException {
        // 1、初始化beanFactory
        BeanFactory beanFactory = new AutowireBeanFactory();
        // 2、初始化beanDefinition
        BeanDefinition beanDefinition = new BeanDefinition();
        beanDefinition.setBeanClass(Class.forName("com.wz.step.HelloWorldService"));
        // 3、注册bean
        beanFactory.registerBeanDefinition("HelloWorldService", beanDefinition);

        HelloWorldService helloWorldService =(HelloWorldService) beanFactory.getBean("HelloWorldService");
        helloWorldService.sayHello();
    }
}
