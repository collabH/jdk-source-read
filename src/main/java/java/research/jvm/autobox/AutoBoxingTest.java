/*
 * Copyright: 2020 forchange Inc. All rights reserved.
 */

package dev.research.jvm.autobox;

import java.util.ArrayList;
import java.util.List;

/**
 * @fileName: AutoBoxingTest.java
 * @description: 自动拆装箱测试
 * @author: by echo huang
 * @date: 2020-01-12 23:09
 */
public class AutoBoxingTest {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(0);// invokestatic  #4    // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        int a = list.get(0);// Method java/lang/Integer.intValue:()I
        // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z泛型与类型擦除
    }
}
