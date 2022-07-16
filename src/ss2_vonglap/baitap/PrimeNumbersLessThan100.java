package ss2_vonglap.baitap;

public class PrimeNumbersLessThan100 {
    public static void main(String[] args) {
        System.out.print("Enter number: ");
        for (int number = 2; number < 100; number++) {
            boolean check = true;
            int i = 2;
            while (i < Math.sqrt(number)) {
                if (number % i == 0) {
                    check = false;
                    break;
                }
                i++;
            }
            if ((check)) {
                System.out.println(" " + number);
            }
        }
    }
}
