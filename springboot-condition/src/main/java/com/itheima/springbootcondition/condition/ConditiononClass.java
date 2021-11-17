package com.itheima.springbootcondition.condition;

import org.springframework.context.annotation.Conditional;

import java.lang.annotation.*;

/**
 * @author bowen.lu
 */
@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Conditional(ClassCondition.class)
public @interface ConditiononClass {
    String[] values();
}
