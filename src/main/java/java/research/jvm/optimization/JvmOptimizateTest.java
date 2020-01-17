/*
 * Copyright: 2020 forchange Inc. All rights reserved.
 */

package dev.research.jvm.optimization;

/**
 * @fileName: JvmOptimizateTest.java
 * @description: Jvm优化测试
 * @author: by echo huang
 * @date: 2020-01-16 14:22
 */
public class JvmOptimizateTest {
    private static void loop(int a,int b,int [] arr){
        for (int i = 0; i < arr.length; i++) {
            int c = a * b;
            System.out.println(c);
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 23, 4, 5};
        for (int i = 0; i < arr.length; i++) {
            int c = arr[i] * 4;
            System.out.println(c);
        }
    }
}
