package com.codegym;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean check = false;
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Chuyển đổi tiền tệ");
            System.out.println("1. Chuyển từ USD sang VNĐ");
            System.out.println("2. Chuyển từ VNĐ sang USD");
            System.out.println("Chọn chức năng");
            System.out.print("==>  ");
            int actionMenu = Integer.parseInt(scanner.nextLine());
            switch (actionMenu) {
                case 1:
                    transferUSD();
                    break;
                case 2:
                    transferVND();
                    break;
                default:
                    System.out.println("Nhập sai, vui lòng nhập lại");
                    check = true;
                    continue;
            }
            boolean checkActionMenuContinue = false;
            do {
                checkActionMenuContinue = false;
                System.out.println("Bạn có muốn tiếp tục hay không? Yes(y)/No(n)");
                String actionMenuContinue = scanner.nextLine();
                switch (actionMenuContinue) {
                    case "y":
                        check = true;
                        break;
                    case "n":
                        check = false;
                        break;
                    default:
                        System.out.println("Nhập Không đúng định dạng, vui lòng nhập lại!");
                        checkActionMenuContinue = true;
                }
            } while(checkActionMenuContinue);
        } while (check);
    }

    public static void transferUSD() {
        Scanner sc = new Scanner(System.in);
        double vnd = 23000;
        double usd;
        System.out.println("Mời bạn nhập số tiền USD: ");
        usd = sc.nextDouble();
        double quydoi = usd * vnd;
        System.out.println("Giá trị khi quy đổi sang VNĐ: " + quydoi);
    }

    public static void transferVND() {
        Scanner sc = new Scanner(System.in);
        double vnd;
        double usd = 23000;
        System.out.println("Mời bạn nhập số tiền VND: ");
        vnd = sc.nextDouble();
        double quydoi = vnd / usd;
        System.out.println("Giá trị khi quy đổi sang USD: " + quydoi);
    }
}