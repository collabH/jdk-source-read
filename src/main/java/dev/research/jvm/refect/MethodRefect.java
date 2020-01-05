/*
 * Copyright: 2020 forchange Inc. All rights reserved.
 */

package dev.research.jvm.refect;

import java.lang.reflect.Method;

/**
 * @fileName: MethodRefect.java
 * @description: JVM反射的原理
 * @author: by echo huang
 * @date: 2020-01-05 23:20
 */
public class MethodRefect {
    /**
     * 循环20次，看报错的异常栈轨迹信息，你会发现15次以后使用的委托方法切换的方法为动态实现
     * Java 虚拟机设置了一个阈值 15（可以通过 -Dsun.reflect.inflationThreshold= 来调整），
     * 当某个反射调用的调用次数在 15 之下时，采用本地实现；
     * 当达到 15 时，便开始动态生成字节码，并将委派实现的委派对象切换至动态实现，这个过程我们称之为 Inflation。
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        for (int i = 0; i < 20; i++) {
            Class<?> aClass = Class.forName("dev.research.jvm.refect.MethodRefect");
            Method hello = aClass.getMethod("target", int.class);
            hello.invoke(null, i);
        }
    }

    public static void target(int i) {
        new Exception("#" + i).printStackTrace();
    }
}


