package com.wym.dubbo.serviceImpl;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Administrator on 2016/4/8.
 */

public class DemoProvider {
    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                new String[]{
                        "classpath:META-INF.spring/spring-dubbo-provider.xml"
                });
        context.start();
        System.in.read(); // 按任意键退出
    }
}