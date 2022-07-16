package ss2_vonglap.baitap;

import java.util.Scanner;

public class Show_first_20primes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of primes ");
        double numbers = sc.nextDouble();
        int count = 0;
        int N = 2;
        int i;
        boolean check;
        System.out.println("Show prime numbers");
        while (count < numbers) {
            check = true;
            if (N != 2) {
                double cSQRT = Math.ceil(Math.sqrt(N));
                for (i = 2; i <= cSQRT; i++) {
                    if (N % i == 0) {
                        check = false;
                    }
                }
            }
            if (check) {
                count++;
                System.out.println(N);
            }
            N++;

        }
    }
}

