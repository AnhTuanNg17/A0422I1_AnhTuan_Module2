package ss1.Baitap;

import java.util.Scanner;

public class CurrencyConversion {
    public static void main(String[] args) {
        double vnd = 23000;
        double  usd;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số tiền USD cần chuyển đổi: ");
        usd = scanner.nextDouble();
        double chuyendoi = usd * 23000;
        System.out.print("Giá trị của VND là: " + chuyendoi);
    }
}
