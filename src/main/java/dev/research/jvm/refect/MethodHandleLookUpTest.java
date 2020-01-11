/*
 * Copyright: 2020 forchange Inc. All rights reserved.
 */

package dev.research.jvm.refect;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;

/**
 * @fileName: MethodHandleLookUpTest.java
 * @description: 方法句柄测试
 * @author: by echo huang
 * @date: 2020-01-07 20:03
 */
public class MethodHandleLookUpTest {
    public void say(String word) {
        System.out.println(word);
    }

    public static void main(String[] args) throws Throwable {
        MethodHandles.Lookup lookup = MethodHandles.lookup();
        MethodType methodType = MethodType.methodType(void.class, String.class);
        MethodHandle say = lookup.findVirtual(MethodHandleLookUpTest.class, "say", methodType);
        say.invokeWithArguments("zhangsan");
        System.out.println(say);
    }
}
