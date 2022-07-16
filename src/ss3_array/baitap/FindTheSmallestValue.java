package ss3_array.baitap;

import java.util.Scanner;

public class FindTheSmallestValue {
    public static void main(String[] args) {
       int [] array = {3,4,7,9,10};
       int min = array[0];
       for(int i = 1; i < array.length; i++){
           if(min < array[i]){
               min = array[i];
           }
       }
System.out.println("The smallest element in the array" + "\t" + min);
    }
}
