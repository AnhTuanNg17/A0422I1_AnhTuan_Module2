package ss3_array.baitap;

public class MargeArray {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {7, 8, 9, 10};
        int k = arr1.length + arr2.length;
        int[] arr3 = new int[k];
        int i;
        for (i = 0; i < arr1.length; i++) {
            arr3[i] = arr1[i];
        }
        k = i;
        for (i = 0; i < arr2.length; i++, k++) {
            arr3[k] = arr2[i];
        }
        System.out.print("Mang da duoc gop la: ");
        for (i = 0; i < k; i++) {
            System.out.print("\narr[" + i + "]: " + arr3[i]);
        }
    }
}

