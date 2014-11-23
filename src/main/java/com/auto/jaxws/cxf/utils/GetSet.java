package com.auto.jaxws.cxf.utils;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;
import java.lang.annotation.RetentionPolicy;
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface GetSet {
	int numberOfTimesToInvoke() default 1;
}