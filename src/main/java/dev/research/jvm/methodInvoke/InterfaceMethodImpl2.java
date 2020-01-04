/*
 * Copyright: 2020 forchange Inc. All rights reserved.
 */

package dev.research.jvm.methodInvoke;

/**
 * @fileName: InterfaceMethodImpl2.java
 * @description: InterfaceMethodImpl2.java类说明
 * @author: by echo huang
 * @date: 2020-01-05 00:39
 */
public class InterfaceMethodImpl2 implements InterfaceMethod {
    public final void interfaceMethod() {
        System.out.println("2");
    }

    public static void main(String[] args) {
        InterfaceMethod method=new InterfaceMethodImpl2();
        method.interfaceMethod();
    }
}
