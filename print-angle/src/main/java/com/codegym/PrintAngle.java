package com.codegym;

import java.util.Scanner;

public class PrintAngle {
    public static void main(String[] args) {
        int choice = -1;
        Scanner scanner = new Scanner(System.in);
        while(choice != 0) {
            System.out.println("Menu");
            System.out.println("1. Print the rectangle");
            System.out.println("2. Print the square triangle");
            System.out.println("3. Print isosceles triangle");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("The Rectangle");
                    drawRectangle();
                    break;
                case 2:
                    System.out.println("The Square Triangle");
                    drawSquareTriangle();
                    break;
                case 3:
                    System.out.println("Isosceles Triangle");
                    drawIsoscelesTriangle();
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("No choice!");
            }
        }
    }

    public static void drawRectangle() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter width (>1): ");
        int width = scanner.nextInt();
        System.out.print("Enter height (>1): ");
        int height = scanner.nextInt();
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= width; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void drawSquareTriangle() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter size (>1): ");
        int size = scanner.nextInt();
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();

        for (int i = size; i >0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void drawIsoscelesTriangle() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter size (>1): ");
        int size = scanner.nextInt();
        for (int i = size; i > 0; i--) {
            for (int j = 1; j <= size; j++) {
                if (j >= i) {
                    System.out.print("* ");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}