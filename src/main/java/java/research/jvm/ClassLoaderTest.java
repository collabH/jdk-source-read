/*
 * Copyright: 2020 forchange Inc. All rights reserved.
 */

package dev.research.jvm;

/**
 * @fileName: ClassLoaderTest.java
 * @description: 类的加载顺序
 * @author: by echo huang
 * @date: 2020-01-04 23:31
 */
public class ClassLoaderTest {
    private ClassLoaderTest() {}
    private static class LazyHolder {
        static final ClassLoaderTest INSTANCE = new ClassLoaderTest();
        static {
            System.out.println("LazyHolder.<clinit>");
        }
    }
    public static Object getInstance(boolean flag) {
        if (flag) return new LazyHolder[2];//类的数组时不加载
        return LazyHolder.INSTANCE;
    }
    public static void main(String[] args) {
        getInstance(true);//不打印
        System.out.println("----");
        getInstance(false);//打印LazyHolder
    }
}
