package com.wdc.test;

import org.springframework.stereotype.Service;

/**
 * Created by wdc on 16-4-7 at 上午2:23.
 */
@Service("firstService")
public class FirstServiceImpl implements FirstService {
    @Override
    public void sayHello(String words) {
        System.out.println("hello " + words);
    }
}
