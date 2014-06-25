/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vit.sendMail;

/**
 *
 * @author sujitl
 */
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClientLogic {

    public static void main(String[] args) {
//        Resource res = new ClassPathResource("spconfig.xml");
//        BeanFactory factory = new XmlBeanFactory(res);
//
//        Object o = factory.getBean("id2");
//        MailLogic ml = (MailLogic) o;
//
        ApplicationContext context = new ClassPathXmlApplicationContext("spconfig.xml");
        MailLogic m1 = (MailLogic) context.getBean("id2");
        m1.sendM("sujitl@vitinfotech.com", "sujitl@vitinfotech.com", "mail", "you got the mail");

    }
}
