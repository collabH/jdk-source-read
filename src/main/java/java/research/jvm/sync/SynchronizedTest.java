/*
 * Copyright: 2020 forchange Inc. All rights reserved.
 */

package dev.research.jvm.sync;

/**
 * @fileName: SynchronizedTest.java
 * @description: Synchronized字段字节码分析
 * @author: by echo huang
 * @date: 2020-01-12 17:05
 */
public class SynchronizedTest {

    public void lockTest() {
        synchronized (this) {
            System.out.println("张三");
        }
    }

    public synchronized void lockMethod(){
        System.out.println("张三");
    }

    public static void main(String[] args) {
        SynchronizedTest lock = new SynchronizedTest();
        lock.lockTest();
    }
}
