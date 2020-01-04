/*
 * Copyright: 2020 forchange Inc. All rights reserved.
 */

package dev.research.jvm;

/**
 * @fileName: ChangeParamTest.java
 * @description: 可变参数调用的重载问题
 * @author: by echo huang
 * @date: 2020-01-04 23:39
 */
public class ChangeParamTest {
    public void test1(String b,String... a) {
        System.out.println("method1");
    }

    public void test1(String b,String c, String... a) {
        System.out.println("method1");
    }

    public static void main(String[] args) {
        ChangeParamTest changeParamTest = new ChangeParamTest();
        //changeParamTest.test1("h","sd");//编译报错，无法识别对应方法
        changeParamTest.test1("a",new String[]{});//编译通过，因为他会选择最为贴切的重载方法
    }
}
