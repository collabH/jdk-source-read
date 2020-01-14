/*
 * Copyright: 2020 forchange Inc. All rights reserved.
 */

package dev.research.jvm.analysisSwitch;

/**
 * @fileName: SwitchTest.java
 * @description: switch语句分析
 * @author: by echo huang
 * @date: 2020-01-13 15:46
 */
public class SwitchTest {
    /**
     * switch相当于一个hash桶
     * lookupswitch  { // 2
     * 10: 32 对应的调用语句
     * 11: 43
     * default: 54
     * }
     *
     * @param args
     */
    public static void main(String[] args) {
        int a = 10;
        switch (a) {
            case 10:
                System.out.println("a");
                break;
            case 11:
                System.out.println("b");
                break;
            default:
                System.out.println("zz");
                break;
        }
    }
}
