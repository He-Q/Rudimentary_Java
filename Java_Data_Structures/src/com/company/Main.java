package com.company;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Array numbers = new Array(3);
        numbers.insert(10);
        numbers.insert(20);
        numbers.insert(30);
        numbers.insert(40);
        numbers.insertAt(25,2);
//        numbers.removeAt(4);
        numbers.print();
        System.out.println("--------------------");
//        numbers.reversed();
        System.out.println("''''''''");
        System.out.println(numbers.indexOf(40));
        System.out.println("''''''''");
        System.out.println("MAX: "+ numbers.max());
        numbers.print();

    }
}
