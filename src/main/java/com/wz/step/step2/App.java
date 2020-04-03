package com.wz.step.step2;

import com.wz.step.HelloWorldService;

/**
 * @Description: test
 * @Author: wz
 */
public class App {
    public static void main(String[] args) throws ClassNotFoundException {
        BeanFactory beanFactory = new AutowireBeanFactory();
        BeanDefinition beanDefinition = new BeanDefinition();
        beanDefinition.setBeanClass(Class.forName("com.wz.step.HelloWorldService"));
        beanFactory.registerBeanDefinition("HelloWorldService", beanDefinition);

        HelloWorldService helloWorldService =(HelloWorldService) beanFactory.getBean("HelloWorldService");
        helloWorldService.sayHello();
    }
}
