package com.codegym;

import java.util.LinkedList;

public class LinkedList1 {
    public static void main(String[] args) {
        LinkedList<String> cars = new LinkedList<>();
        cars.add("1");
        cars.add("2");
        cars.add("3");
        System.out.println("chua add " + cars);
        cars.addFirst("4");
        System.out.println("add o truoc " + cars);
        cars.addLast("5");
        System.out.println("add o sau " + cars);
    }
}