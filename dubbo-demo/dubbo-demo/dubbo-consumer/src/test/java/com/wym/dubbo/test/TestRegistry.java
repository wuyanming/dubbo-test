package com.wym.dubbo.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
/**
 * Created by Administrator on 2016/4/8.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:spring-context.xml","classpath*:spring-dubbo-consumer.xml"})
public class TestRegistry {
    @Resource
//    private RegistryInterface registryInterface;

    @Test
    public void SayHello(){

    }

}
