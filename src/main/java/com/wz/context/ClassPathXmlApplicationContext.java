package com.wz.context;

/**
 * @Author: wz
 */
public class ClassPathXmlApplicationContext extends AbstractApplicationContext{
    String configLocation;

    public ClassPathXmlApplicationContext(String configLocation) {
        this.configLocation = configLocation;
    }
}
