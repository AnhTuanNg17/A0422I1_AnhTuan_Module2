package ss2_vonglap.baitap;

import java.util.Scanner;

public class ShowType {
    public static void main(String[] args) {
        int choose;
        System.out.println("Print the rectangle");
        System.out.println("Print the square triangle");
        System.out.println("Print isosceles triangle");
        System.out.println("Exit");
        System.out.println("Please choose one");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your choosing ");
        choose = sc.nextInt();
        if (choose != 4) {
            switch (choose) {
                case 1:
                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 6; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    for (int i = 1; i <= 5; i++) {
                        for (int j = 1; j < i; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    for (int i = 7; i > 1; i--) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
            }
        } else {
            System.out.println("Exit");
            System.exit(0);
        }
    }
}
