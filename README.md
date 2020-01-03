# boolean类型在Jvm中的表示
```text
boolean类型支持true和false俩种值，但是jvm是无法识别这两种值的，因此在 Java 虚拟机规范中，
boolean 类型则被映射成 int 类型。具体来说，“true”被映射为整数 1，而“false”被映射为整数 0。
这个编码规则约束了 Java 字节码的具体实现。
```