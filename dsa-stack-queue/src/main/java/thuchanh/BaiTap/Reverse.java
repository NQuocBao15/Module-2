package thuchanh.BaiTap;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class Reverse<i> {
    public static void main(String[] args) {
        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();
        int[] arr = {1,2,3,4,5};
        for (int i = 0; i < arr.length; i++) {
            stack1.push(arr[i]);
        }
        System.out.println(stack1);
        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }
        System.out.println(stack2);

        Stack<String> stack3 = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chuỗi bất kì: ");
        String string = scanner.nextLine();

        String[] arr1 = string.split("");
        System.out.println(Arrays.toString(arr1));

        for (String item : arr1) {
            stack3.push(item);
        }

        string = "";
        while (!stack3.isEmpty()) {
            string += stack3.pop() + "";
        }
        System.out.println(string);
    }
}
