/*
 * Copyright: 2020 forchange Inc. All rights reserved.
 */

package dev.research.jexl;

import org.apache.commons.jexl2.JexlContext;
import org.apache.commons.jexl2.JexlEngine;
import org.apache.commons.jexl2.MapContext;

/**
 * @fileName: JexlText.java
 * @description: JexlText.java类说明
 * @author: by echo huang
 * @date: 2020-01-06 10:43
 */
public class JexlText {
    public static void main(String[] args) {
        JexlContext context = new MapContext();
        String expression = "if(a){return a;};";
        context.set("a", true);
        JexlEngine engine = new JexlEngine();
        Object evaluate = engine.createExpression(expression).evaluate(context);
        System.out.println(evaluate);
    }
}
