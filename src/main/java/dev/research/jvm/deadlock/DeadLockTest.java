/*
 * Copyright: 2020 forchange Inc. All rights reserved.
 */

package dev.research.jvm.deadlock;

/**
 * @fileName: DeadLockTest.java
 * @description: 死锁测试
 * @author: by echo huang
 * @date: 2020-01-16 20:46
 */
public class DeadLockTest {
    private static final Object lock = new Object();
    private static final Object lock1 = new Object();

    public static void test1() {
        synchronized (lock) {
            System.out.println("test1");
            synchronized (lock1) {
                System.out.println("re test1");
            }
        }
    }

    public static void test2() {
        synchronized (lock1) {
            System.out.println("test2");
            synchronized (lock) {
                System.out.println("re test2");
            }
        }
    }

    public static void main(String[] args) {
        Thread thread = new Thread(DeadLockTest::test1);
        Thread thread1 = new Thread(DeadLockTest::test2);
        thread.start();
        thread1.start();

    }
}
