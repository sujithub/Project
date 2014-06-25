/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vit.springaop;

import com.vit.springaop.services.ShapeServices;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author sujitl
 */
public class MainAop {

    public static void main(String args[]) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        ShapeServices shpe = context.getBean("shpaeServices", ShapeServices.class);
        System.out.println("\n\n\n");
        System.out.println(shpe.getCircle().getName());
        System.out.println(shpe.getTriangle().getName());
    }
}
