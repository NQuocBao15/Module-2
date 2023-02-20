package com.codegym.BaiTap;

import java.util.Stack;

public class Convert {
    public static void main(String[] args) {
        Stack<Integer> wStack = new Stack<>();
        int num = 1234;
        while (num > 0) {
            wStack.push(num % 2);
            num /= 2;
        }
        while (!wStack.isEmpty()) {
            System.out.print(wStack.pop());
        }
    }
}