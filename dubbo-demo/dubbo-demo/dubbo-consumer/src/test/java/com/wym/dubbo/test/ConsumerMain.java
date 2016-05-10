package com.wym.dubbo.test;

import com.wym.dubbo.service.RegisterInterface;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class ConsumerMain
{
    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"classpath:spring-dubbo-consumer.xml"});
        context.start();

        RegisterInterface registerInterface = (RegisterInterface)context.getBean("registerInterface"); // 获取远程服务代理
        registerInterface.SayHello("world"); // 执行远程方法
    }
}
