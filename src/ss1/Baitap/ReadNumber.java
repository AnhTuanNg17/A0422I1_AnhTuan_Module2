package ss1.Baitap;

import java.util.Scanner;

public class ReadNumber {
    public static void main(String[] args) {
        int number;
        number = 0;
        Scanner scanner = new Scanner(System.in);
        number = scanner.nextInt();

        if (number < 10) {
            switch (number) {
                case 0:
                    System.out.print("Zero");
                    break;
                case 1:
                    System.out.print("One");
                    break;
                case 2:
                    System.out.print("Two");
                    break;
                case 3:
                    System.out.print("Three");
                    break;
                case 4:
                    System.out.print("Four");
                    break;
                case 5:
                    System.out.print("Five");
                    break;
                case 6:
                    System.out.print("Six");
                    break;
                case 7:
                    System.out.print("Seven");
                    break;
                case 8:
                    System.out.print("Eight");
                    break;
                case 9:
                    System.out.print("Nine");
                    break;
            }
        }
        if (number >= 10 && number < 20) {
            int a = number % 10;
            switch (a) {
                case 0:
                    System.out.print("Ten");
                    break;
                case 1:
                    System.out.print("Eleven");
                    break;
                case 2:
                    System.out.print("Twelve");
                    break;
                case 3:
                    System.out.print("Thirteen");
                    break;
                case 4:
                    System.out.print("Fourteen");
                    break;
                case 5:
                    System.out.print("Fifteen");
                    break;
                case 6:
                    System.out.print("Sixteen");
                    break;
                case 7:
                    System.out.print("Seventeen");
                    break;
                case 8:
                    System.out.print("Eighteen");
                    break;
                case 9:
                    System.out.print("Nineteen");
                    break;
            }
        }
        if (number >= 20 && number < 100) {
            int a = number / 10;
            double b = Math.floor(a);
            switch ((int) b) {
                case 2:
                    System.out.print("Twenty");
                    break;
                case 3:
                    System.out.print("Thirty");
                    break;
                case 4:
                    System.out.print("Fourty");
                    break;
                case 5:
                    System.out.print("Fifty");
                    break;
                case 6:
                    System.out.print("Sixty");
                    break;
                case 7:
                    System.out.print("Seventy");
                    break;
                case 8:
                    System.out.print("Eighty");
                    break;
                case 9:
                    System.out.print("ninety");
                    break;
            }
        }
    }
}
