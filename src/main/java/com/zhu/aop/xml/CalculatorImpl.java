package com.zhu.aop.xml;

/**
 * @description: CalculatorImpl
 * @date: 2023/4/16 13:21
 * @author: zdp
 * @version: 1.0
 */
public class CalculatorImpl implements Calculator {
    @Override
    public int add(int i, int j) {
        return i + j;
    }

    @Override
    public int sub(int i, int j) {
        return i - j;
    }

    @Override
    public int mul(int i, int j) {
        return i * j;
    }

    @Override
    public int div(int i, int j) {
        /*if (j == 0) {
            throw new IllegalArgumentException("除数不能为0");
        }*/
        return i / j;
    }
}
