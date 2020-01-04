/*
 * Copyright: 2020 forchange Inc. All rights reserved.
 */

package dev.research.jvm;

import sun.misc.Unsafe;

/**
 * @fileName: UnsafeTest.java
 * @description: UnsafeTest.java类说明
 * @author: by echo huang
 * @date: 2020-01-04 15:00
 */
public class UnsafeTest {
    public static void main(String[] args) {
        boolean flag=true;
        try {
            Unsafe.getUnsafe().putBoolean(flag,1L,false);
            System.out.println(flag);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
