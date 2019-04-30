package com.app.test;

import com.app.bean.Bank;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Bank b = (Bank) context.getBean("b");
        b.balance();
        b.interest();
        b.withdraw();
    }
}
