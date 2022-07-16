package ss3_array.baitap;

import java.util.Scanner;

public class FindTheMaxLestValue {
    public static void main(String[] args) {
        int m, n;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter some line: ");
        m = scanner.nextInt();
        System.out.print("Enter some columns: ");
        n = scanner.nextInt();
        int[][] matrix = new int[m][n];
for(int i = 0; i < m; i++){
    for(int j = 0; j < n; j++){
        System.out.print("matrix["+ i +"][" + j + "]");
        matrix[i][j] = scanner.nextInt();
    }
}
int max = matrix[0][0];
for(int i = 0; i < m; i++){
    for(int j = 0; j < n; j++){
        max = matrix[i][j];
    }
}
System.out.println("Max element" + "\t" + max);
    }
}
