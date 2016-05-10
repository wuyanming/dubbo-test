package com.wym.dubbo.serviceImpl;

import com.wym.dubbo.service.RegisterInterface;

/**
 * Created by Administrator on 2016/4/8.
 */
public class RegistryInterfaceImpl implements RegisterInterface{
    public String SayHello(String name){
        System.out.print(name);
        return "Hello "+name;
    }
}
