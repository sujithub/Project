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
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;

public class MailLogic {

    private MailSender mail;

    public void setMail(MailSender mail) {
        this.mail = mail;
    }

    public void sendM(String from, String to, String subject, String msg) {

        SimpleMailMessage message = new SimpleMailMessage();

        message.setFrom(from);
        message.setTo(to);
        message.setSubject(subject);
        message.setText(msg);

        mail.send(message);
        System.out.println("Mail Sent Successfully...!");
    }
}
