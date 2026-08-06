import java.util.Arrays;
import java.util.Scanner;

public class Helpful_Maths {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        String[] arr = s.split("\\+");

        int[] num = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            num[i] = Integer.parseInt(arr[i]);
        }

        Arrays.sort(num);

        for (int i = 0; i < num.length; i++) {
            if (i > 0)
                System.out.print("+");

            System.out.print(num[i]);
        }
    }
}
