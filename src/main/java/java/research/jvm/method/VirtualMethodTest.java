/*
 * Copyright: 2020 forchange Inc. All rights reserved.
 */

package dev.research.jvm.method;

/**
 * @fileName: VirtualMethodTest.java
 * @description: VirtualMethodTest.java类说明
 * @author: by echo huang
 * @date: 2020-01-14 20:34
 */
public class VirtualMethodTest extends TestOp {

    @Override
    public int apply(int a, int b) {
        return a + b;
    }
}
class Sub extends TestOp{

    @Override
    public int apply(int a, int b) {
        return a-b;
    }
}

abstract class TestOp {
    public abstract int apply(int a, int b);
}
