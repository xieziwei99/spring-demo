package com.xzw.aop;

import org.springframework.stereotype.Component;

/**
 * @author xieziwei99
 * 2020-06-15
 */
@Component
public class ArithmeticImpl implements Arithmetic {

    @Override
    public int add(int a, int b) {
        return a + b;
    }

    @Override
    public int sub(int a, int b) {
        return a - b;
    }
}
