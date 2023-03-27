package ru.ibs.program12;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        String str = "I like Java!!!";

        //1.
        System.out.println("Содержит ли строка подстроку “Java”: ");
        if (str.contains("Java")) {
            System.out.println("true");
            //2.
            System.out.println("Начинается ли строка с подстроки “I like”: ");
            if (str.startsWith("I like")) {
                System.out.println("true");
                //3.
                System.out.println("Заканчивается ли строка с подставки “!!!” ");
                if (str.endsWith("!!!")) {
                    System.out.println("true");
                    //4.
                    System.out.println(str.toUpperCase(Locale.ROOT));
                }
                else {
                    System.out.println("false");
                }
            }
            else {
                System.out.println("false");
            }
        }
        else {
            System.out.println("false");
        }
        //5.
        System.out.println(str.replace('a','o').substring(7,11));
    }
}
