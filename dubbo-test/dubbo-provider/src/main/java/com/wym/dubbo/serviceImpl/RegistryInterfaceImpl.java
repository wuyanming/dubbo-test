package com.wym.dubbo.serviceImpl;

import com.wym.dubbo.service.RegistryInterface;
import org.springframework.stereotype.Service;
/**
 * Created by Administrator on 2016/4/8.
 */
//@Service("registryInterface")
public class RegistryInterfaceImpl implements RegistryInterface {
    @Override
    public String SayHello(String name){
        return "Hello "+ name;
    }
}
