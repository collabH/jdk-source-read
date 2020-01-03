package dev.research.jvm;

/**
 * @FileName: BooleanTest.java
 * @Description: BooleanTest.java类说明
 * @Author: by shimin.huang
 * @Date: 2020-01-03 23:57
 */
public class BooleanTest {
    public static void main(String[] args) {
        boolean flag=true;//iload iconst_1 istore 1
        if (flag) System.out.println("hello world1"); //iload 1 ifeql l3 iconst_1
        if (flag==true) System.out.println("hello world2");//iload 1 iconst_1
    }
}
