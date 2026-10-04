import java.util.*;

public class BirthdayCakeCandles {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of candles:");

        int n = sc.nextInt();

        int max = 0;
        int count = 0;

        System.out.println("Enter candle heights:");

        for (int i = 0; i < n; i++) {

            int height = sc.nextInt();

            if (height > max) {
                max = height;
                count = 1;
            }
            else if (height == max) {
                count++;
            }
        }

        System.out.println("Number of tallest candles: " + count);

        sc.close();
    }
}