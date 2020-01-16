/*
 * Copyright: 2020 forchange Inc. All rights reserved.
 */

package dev.research.jvm.anno;

/**
 * @fileName: Hello.java
 * @description: Hello.java类说明
 * @author: by echo huang
 * @date: 2020-01-16 15:57
 */

public class Hello {

    private int age;

    @CheckGetter
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
