/*
 * Copyright: 2020 forchange Inc. All rights reserved.
 */

package dev.research.jvm.autobox;

/**
 * @fileName: JoinTest.java
 * @description: 解决泛型擦取导致JVM重写问题，桥接方法
 * @author: by echo huang
 * @date: 2020-01-13 15:10
 */
public class JoinTest<T extends Number> {

    public void say(T data) {
        System.out.println(data);
    }

    public static void main(String[] args) {
        JoinTest<Float> join = new Join();
        join.say(10.0f);
    }
}

/**
 * flags: ACC_PUBLIC, ACC_BRIDGE, ACC_SYNTHETIC
 * ACC_BRIDGE代表桥接方法标示
 * ACC_SYNTHETIC 它表示该方法对于 Java 源代码来说是不可见的
 * 当你尝试通过传入一个声明类型为 Number 的对象作为参数，调用 Join 类的 say 方法时，Java 编译器会报错，并且提示参数类型不匹配。
 */
class Join extends JoinTest<Float> {
    @Override
    public void say(Float data) {
        super.say(data);
    }
}

