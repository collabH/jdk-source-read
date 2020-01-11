/*
 * Copyright: 2020 forchange Inc. All rights reserved.
 */

package dev.research.jvm.gc;

/**
 * @fileName: ObjectLifeTimeTest.java
 * @description: ObjectLifeTimeTest.java类说明
 * @author: by echo huang
 * @date: 2020-01-11 23:37
 */
public class ObjectLifeTimeTest {
    private static final int K = 1024;
    private static final int M = K * K;
    private static final int G = K * M;

    private static final int ALIVE_OBJECT_SIZE = 32 * M;

    public static void main(String[] args) {
        int length = ALIVE_OBJECT_SIZE / 64;
        ObjectOf64Bytes[] array = new ObjectOf64Bytes[length];
        for (long i = 0; i < G; i++) {
            array[(int) (i % length)] = new ObjectOf64Bytes();
        }
    }
}

class ObjectOf64Bytes {
    long placeholder0;
    long placeholder1;
    long placeholder2;
    long placeholder3;
    long placeholder4;
    long placeholder5;
}