package com.wz;

/**
 * @Author: wz
 */
public class HelloServiceImpl implements HelloService{

    @Override
    public void sayHello(String name) {
        System.out.println("Hello " + name);
    }
}
