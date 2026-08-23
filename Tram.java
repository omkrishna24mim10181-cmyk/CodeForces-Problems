import java.util.Scanner;

public class Tram {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int current = 0;
        int max = 0;

        for (int i = 0; i < n; i++) {

            int out = sc.nextInt();
            int in = sc.nextInt();

            current = current - out + in;

            if (current > max) {
                max = current;
            }
        }

        System.out.print(max);
    }
}
