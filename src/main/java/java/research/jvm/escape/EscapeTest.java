package dev.research.jvm.escape;

import java.util.ArrayList;
import java.util.function.Consumer;

/**
 * 逃逸分析
 */
public class EscapeTest {
 
  public static void forEach(ArrayList<Object> list, Consumer<Object> f) {
    for (Object obj : list) {
      f.accept(obj);
    }
  }
 
  public static void main(String[] args) {
    ArrayList<Object> list = new ArrayList<>();
    for (int i = 0; i < 100; i++) {
      list.add(i);
    }
    for (int i = 0; i < 400_000_000; i++) {
      forEach(list, obj -> {});
    }
  }
}
 