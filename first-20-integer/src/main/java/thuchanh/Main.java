package thuchanh;

public class Main {
    public static void main(String[] args) {
        int count = 0;
        int number = 2;
        while (count < 20) {
            int count1 = 0;
            for (int i = 1; i <= number; i++) {
                if (number % i == 0) {
                    count1++;
                }
            }
            if (count1 == 2) {
                System.out.println(number);
                count++;
            }
            number++;
        }
    }
}