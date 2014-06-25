/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vit.springaop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 *
 * @author sujitl
 */
@Aspect
public class LoginAspect {

    @Before("execution(public String com.vit.springaop.model.Circle.getName())")
    public void loginAdvice() {
        System.out.println("This is the advice method");
    }
}
