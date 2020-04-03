package com.wz.step.step1;

/**
 * @Description: test
 * @Author: wz
 */
public class App {
    public static void main(String[] args) {
        // 1、初始化beanFactory
        BeanFactory beanFactory = new BeanFactory();

        // 2、注册bean
        BeanDefinition beanDefinition = new BeanDefinition(new HelloWorldService());
        beanFactory.registerBeanDefinition("helloWorldService", beanDefinition);

        // 3、获取bean
        HelloWorldService helloWorldService = (HelloWorldService) beanFactory.getBean("helloWorldService");
        helloWorldService.sayHello();
    }
}
