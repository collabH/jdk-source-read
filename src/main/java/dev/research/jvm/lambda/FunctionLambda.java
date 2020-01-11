/*
 * Copyright: 2020 forchange Inc. All rights reserved.
 */

package dev.research.jvm.lambda;

import java.util.function.IntUnaryOperator;
import java.util.stream.IntStream;

/**
 * @fileName: FunctionLambda.java
 * @description: FunctionLambda.java类说明
 * @author: by echo huang
 * @date: 2020-01-08 11:48
 */
public interface FunctionLambda<T> {
    void apply(T data);
}

class TestFunction {
    public static void main(String[] args) {
        //FunctionLambda<String> function = System.out::println;
        //function.apply("张三");
        /**
         * 查看Lambda通过invokedynamic生成的适配器设置参数
         *         -Djdk.internal.lambda.dumpProxyClasses=/Users/babywang/Documents/reserch/dev/workspace/jvm/target/classes/dev/research/jvm/lambda
         *  private final PrintStream arg$1;
         *
         *     private TestFunction$$Lambda$2(PrintStream var1) {
         *         this.arg$1 = var1;
         *     }
         *
         *     private static IntConsumer get$Lambda(PrintStream var0) {
         *         return new TestFunction$$Lambda$2(var0);
         *     }
         *     每次调用都会生成一个新的TestFunction$$Lambda$2的适配器实例
         */
        IntStream.of(10)
                .map(IntUnaryOperator.identity()).forEach(System.out::println);
    }
}
