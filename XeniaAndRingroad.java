import java.util.Scanner;

public class XeniaAndRingroad {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        long current = 1;
        long time = 0;

        for (int i = 0; i < m; i++) {

            int house = sc.nextInt();

            if (house >= current) {
                time += house - current;
            } else {
                time += n - current + house;
            }

            current = house;
        }

        System.out.println(time);
    }
}
