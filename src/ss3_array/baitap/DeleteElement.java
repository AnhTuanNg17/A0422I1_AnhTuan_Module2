package ss3_array.baitap;

import java.util.Scanner;

public class DeleteElement {
    public static void main(String[] args) {
        int array[] = new int[15];
        int n = 10;
        int atIndex = 4;
        for (int i = 0; i < n; i++) {
            array[i] = i + 1;
        }
        System.out.println("Before delete ");
        for (int element : array) {
            System.out.println(element + " ");
        }
        System.out.println("");
        for (int i = atIndex; i < array.length - 1; i++) {
            array[i] = array[i + 1];
        }
        System.out.println("After delete ");
        for (int element : array) {
            System.out.println(element + " ");
        }
    }
}
