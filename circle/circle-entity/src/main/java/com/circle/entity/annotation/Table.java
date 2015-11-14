package com.circle.entity.annotation;

import java.lang.annotation.*;

/**
 * Created by Administrator on 2015/11/12.
 */
@Documented
@Inherited
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface Table {
	String value();
}
