import java.util.Scanner;
import java.util.Arrays;

public class Twins {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int Totalsum = 0;

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            Totalsum += arr[i];
        }

        Arrays.sort(arr);

        int mySum = 0;
        int count = 0;

        for (int i = n - 1; i >= 0; i--) {

            mySum += arr[i];
            count++;

            if (mySum > Totalsum - mySum) {
                break;
            }
        }

        System.out.println(count);
    }
}
