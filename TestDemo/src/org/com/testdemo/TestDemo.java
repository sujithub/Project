/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.com.testdemo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author sujitl
 */
public class TestDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List<String> list = new ArrayList<String>();
        list.add("first");
        list.add("second");
        list.add("third");
        list.add("fourth");
        list.add("five");
        list.add("six");
        list.add("seven");
        list.add("Eight");
        list.add("nine");
        list.add("ten");

        //----for print
        for (String val : list) {
            System.out.println(val);
        }
    }

}
