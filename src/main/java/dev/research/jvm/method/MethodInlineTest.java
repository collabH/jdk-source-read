/*
 * Copyright: 2020 forchange Inc. All rights reserved.
 */

package dev.research.jvm.method;

/**
 * @fileName: MethodInlineTest.java
 * @description: 方法内联测试
 * @author: by echo huang
 * @date: 2020-01-14 17:31
 */
public class MethodInlineTest {
    public static boolean flag = true;
    public static int value0 = 0;
    public static int value1 = 1;

    public static int foo(int value) {
        int result = bar(flag);
        if (result != 0) {
            return result;
        } else {
            return value;
        }
    }

    public static int bar(boolean flag) {
        return flag ? value0 : value1;
    }
}
