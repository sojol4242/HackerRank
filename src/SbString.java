package hackerrank;

import java.util.Scanner;

public class SbString {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();
        in.close();
        String s = S.substring(start, (end ));
        System.out.println(s);

    }
}
