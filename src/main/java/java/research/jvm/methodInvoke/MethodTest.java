/*
 * Copyright: 2020 forchange Inc. All rights reserved.
 */

package dev.research.jvm.methodInvoke;

/**
 * @fileName: MethodTest.java
 * @description: 方法调用测试
 * @author: by echo huang
 * @date: 2020-01-05 00:00
 */
public class MethodTest {
    public static void staticMethod() {
        System.out.println("调用静态方法");
    }

    public void invokeMethod() {
        System.out.println("调用非私有方法");
    }

    private void invokePrivateMethod() {
        System.out.println("调用私有方法");
    }

    public void invokeInterface(InterfaceMethod method) {
        method.interfaceMethod();
    }

    public static void main(String[] args) {
        MethodTest test=new MethodTest();//INVOKESPECIAL
        test.invokeInterface(new InterfaceMethod() {//INVOKEVIRTUAL
            public void interfaceMethod() {
                System.out.println("张三");
            }
        });
        test.invokeMethod();//INVOKEVIRTUAL
        test.invokePrivateMethod();//INVOKESPECIAL
        MethodTest.staticMethod();//INVOKESTATIC
        //常量池里的符号引用
        // InterfaceMethodref #47.#48        // dev/research/jvm/methodInvoke/InterfaceMethod.interfaceMethod:()V
        //   #8 = Class              #49            // dev/research/jvm/methodInvoke/MethodTest
        //   #9 = Methodref          #8.#39         // dev/research/jvm/methodInvoke/MethodTest."<init>":()V
    }
}
