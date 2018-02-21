package com.ttn.asgn;
import org.apache.commons.lang3.StringUtils; //Q4

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World");
        bye b = new bye();
        b.display();

        String n="Vaibhav";
        String n1=StringUtils.upperCase(n);
        System.out.println(n1);

    }
}

