/*
 * Copyright: 2020 dingxiang-inc.com Inc. All rights reserved.
 */

package dev.research.jvm.anno;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @fileName: CheckGetter.java
 * @description: CheckGetter.java类说明
 * @author: by echo huang
 * @date: 2020-01-16 15:22
 */
@Target({ElementType.METHOD,ElementType.FIELD})
@Retention(RetentionPolicy.SOURCE)
@Documented
public @interface CheckGetter {
}
