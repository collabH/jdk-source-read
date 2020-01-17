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
 * @fileName: JexlText2.java
 * @description: JexlText2.java类说明
 * @author: by echo huang
 * @date: 2020-01-08 14:32
 */
public class JexlText2 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("isTamperPck", "篡改包");
        String script = "if(label.get('isTamperPck').equals('篡改包')){return label;}";
        JexlContext context = new MapContext();
        context.set("label", map);
        JexlEngine engine = new JexlEngine();
        System.out.println(engine
                .createExpression(script)
                .evaluate(context));

    }
}
