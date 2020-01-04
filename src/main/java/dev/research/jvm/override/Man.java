/*
 * Copyright: 2020 forchange Inc. All rights reserved.
 */

package dev.research.jvm.override;

/**
 * @fileName: Man.java
 * @description: Man.java类说明
 * @author: by echo huang
 * @date: 2020-01-04 23:51
 */
public class Man extends People {
    /**
     * 重写类父类方法
     */
    @Override
    public void say() {
        System.out.println("man say");
        super.say();
    }

    /**
     * 隐藏了父类的静态方法
     */
    public static void sayStatic(){
        System.out.println("man sayStatic");
    }

    public static void main(String[] args) {
        Man man = new Man();
        man.say();
        Man.sayStatic();
    }
}
