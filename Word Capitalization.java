import java.util.Scanner;

public class Word Capitalization {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        char first = Character.toUpperCase(s.charAt(0));
        String rest = s.substring(1);

        System.out.println(first + rest);
    }
}
