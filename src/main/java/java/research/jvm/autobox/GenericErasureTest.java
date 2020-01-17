/*
 * Copyright: 2020 forchange Inc. All rights reserved.
 */

package dev.research.jvm.autobox;

/**
 * @fileName: GenericErasureTest.java
 * @description: 泛型擦除
 * @author: by echo huang
 * @date: 2020-01-12 23:16
 */
public class GenericErasureTest {
    public static void main(String[] args) {
    }

    class GenericTest<T extends Number> {
        T foo(T t) {
            return t;
        }
    }
}
