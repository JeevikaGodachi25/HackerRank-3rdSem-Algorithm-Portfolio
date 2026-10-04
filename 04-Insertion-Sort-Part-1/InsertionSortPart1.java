import java.util.*;

public class InsertionSortPart1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of elements:");

        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int value = arr[n - 1];

        int i = n - 2;

        while (i >= 0 && arr[i] > value) {

            arr[i + 1] = arr[i];

            printArray(arr);

            i--;
        }

        arr[i + 1] = value;

        printArray(arr);

        sc.close();
    }

    public static void printArray(int[] arr) {

        for (int num : arr) {
            System.out.print(num + " ");
        }

        System.out.println();
    }
}