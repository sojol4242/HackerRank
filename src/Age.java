package hackerrank;

import java.util.Scanner;

public class Age {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0, count = 0;
        while (true) {
            int age = sc.nextInt();
            if (age < 0) {
                break;
            } else {
                sum += age;
                count++;
            }
        }
        double x = sum / (double) count;
        System.out.printf("%.2f\n", x);
    }
}
