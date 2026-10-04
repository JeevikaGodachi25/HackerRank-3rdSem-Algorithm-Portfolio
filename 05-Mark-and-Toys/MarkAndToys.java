import java.util.*;

public class MarkAndToys {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of toys:");

        int n = sc.nextInt();

        System.out.println("Enter budget:");

        int k = sc.nextInt();

        int[] prices = new int[n];

        System.out.println("Enter toy prices:");

        for (int i = 0; i < n; i++) {
            prices[i] = sc.nextInt();
        }

        Arrays.sort(prices);

        int count = 0;
        int spent = 0;

        for (int price : prices) {

            if (spent + price <= k) {
                spent += price;
                count++;
            }
            else {
                break;
            }
        }

        System.out.println("Maximum number of toys: " + count);

        sc.close();
    }
}