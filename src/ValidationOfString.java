package hackerrank;

import java.util.Scanner;

public class ValidationOfString {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String s = in.nextLine();
        for (int i = 0; i <= n; i++) {

            if (s.length() > 30 || s.length() < 8) {
                System.out.println("Invalid");
            }

        }
    }
}
