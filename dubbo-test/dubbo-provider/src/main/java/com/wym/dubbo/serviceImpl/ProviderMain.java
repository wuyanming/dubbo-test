package com.wym.dubbo.serviceImpl;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 */
public class ProviderMain {
    public static void main(String[] args) throws Exception{
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                new String[]{
                        "classpath:META-INF.spring/dubbo-provider.xml"
                });
        context.start();
        System.in.read(); // 按任意键退出
    }
}
