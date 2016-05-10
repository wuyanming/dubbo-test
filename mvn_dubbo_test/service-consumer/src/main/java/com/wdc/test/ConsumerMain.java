package com.wdc.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class ConsumerMain
{
    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"classpath:consumer.xml"});
        context.start();

        FirstService firstService = (FirstService)context.getBean("firstService"); // 获取远程服务代理
        firstService.sayHello("world"); // 执行远程方法
    }
}
