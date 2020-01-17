/*
 * Copyright: 2020 forchange Inc. All rights reserved.
 */

package dev.research.jvm.gc;

/**
 * @fileName: SafepointTest.java
 * @description: 安全点测试
 * @author: by echo huang
 * @date: 2020-01-11 19:50
 * -XX:+PrintGC -XX:+PrintGCApplicationStoppedTime
 * -XX:+PrintSafepointStatistics -XX:+UseCountedLoopSafepoints
 */
public class SafepointTest {
    static double sum = 0;

    public static void foo() {
        for (int i = 0; i < 0x77777777; i++) {
            sum += Math.sqrt(i);
        }
    }

    public static void bar() {
        for (int i = 0; i < 50_000_000; i++) {
            new Object().hashCode();
        }
    }

    public static void main(String[] args) {
        new Thread(SafepointTest::foo).start();
        new Thread(SafepointTest::bar).start();
    }
}
