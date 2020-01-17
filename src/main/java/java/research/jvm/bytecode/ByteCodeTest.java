/*
 * Copyright: 2020 forchange Inc. All rights reserved.
 */

package dev.research.jvm.bytecode;

/**
 * @fileName: ByteCodeTest.java
 * @description: 字节码查看
 * @author: by echo huang
 * @date: 2020-01-14 17:07
 */
public class ByteCodeTest {
    /**
     * 可以看到局部变量区7单元
     * 操作数栈4单元
     *
     * @param a
     * @param b
     */
    public void test1(long a, double b) {
        double v = a + b;
        System.out.println(v);
    }

    public int test2(int a) {
        return 2 * a;
    }

    public void test3() {
        //pop 没有用到test2的返回值所以直接pop将数据存操作数栈中弹出
        test2(3);
    }

    public void test4() throws Exception {
        Object i = 1;
        if (i instanceof Integer) {
            System.out.println("test");
        }
    }
}
