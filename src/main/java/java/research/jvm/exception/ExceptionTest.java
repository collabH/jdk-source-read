/*
 * Copyright: 2020 forchange Inc. All rights reserved.
 */

package dev.research.jvm.exception;

/**
 * @fileName: ExceptionTest.java
 * @description: ExceptionTest.java类说明
 * @author: by echo huang
 * @date: 2020-01-05 17:14
 */
public class ExceptionTest {
    public static void main(String[] args) {
        try {
            throw new RuntimeException("test");
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            throw new RuntimeException("");
        } catch (ArrayIndexOutOfBoundsException e) {
            e.fillInStackTrace();
        }
        /**
         *  Code:
         *       stack=3, locals=2, args_size=1
         *          0: new           #2                  // class java/lang/RuntimeException
         *          3: dup
         *          4: ldc           #3                  // String test
         *          6: invokespecial #4                  // Method java/lang/RuntimeException."<init>":(Ljava/lang/String;)V
         *          9: athrow
         *         10: astore_1
         *         11: aload_1
         *         12: invokevirtual #6                  // Method java/lang/Exception.printStackTrace:()V
         *         15: return
         *       Exception table: //from to表示异常表的范围，to不包含10
         *          from    to  target type
         *              0    10    10   Class java/lang/Exception
         */
    }
}
