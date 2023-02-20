package com.codegym.ThucHanh;

import static com.codegym.ThucHanh.MyGenericStack.stackOfIString;
import static com.codegym.ThucHanh.MyGenericStack.stackOfIntegers;

public class GenericStackClient {
    public static void main(String[] args) {
        System.out.println("1. Stack of integers");
        stackOfIString();
        System.out.println("\n2.Stack of Strings");
        stackOfIntegers();
    }
}
