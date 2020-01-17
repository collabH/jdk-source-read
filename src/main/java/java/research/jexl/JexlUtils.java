/*
 * Copyright: 2020 forchange Inc. All rights reserved.
 */

package dev.research.jexl;

import org.apache.commons.jexl2.JexlContext;
import org.apache.commons.jexl2.JexlEngine;
import org.apache.commons.jexl2.MapContext;

import java.util.HashMap;
import java.util.Map;

/**
 * @fileName: JexlUtils.java
 * @description: JexlUtils.java类说明
 * @author: by echo huang
 * @date: 2020-01-08 15:02
 */
public class JexlUtils {
    public static Object executor(Map<String, Object> values, String script) {
        JexlContext context = new MapContext(values);
        JexlEngine engine = new JexlEngine();
        return engine.createExpression(script).evaluate(context);
    }

    public static void main(String[] args) {
        Map<String, Object> values=new HashMap<>();
        values.put("a",10);
        values.put("b",12);
        values.put("c",14);
        String script="return a+b+c;";
        System.out.println(executor(values, script));
    }
}
