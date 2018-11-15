package com.dubbo.provider;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * Provider
 *
 * @author DingwenDeng
 * @summary Provider
 * @since 2018-11-14 15:07
 */
public class Provider {

    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("provider.xml");
        System.out.println(context.getDisplayName()+"服务端准备启动");
        context.start();
        System.out.println("服务端已启动");
        System.in.read();
    }

}