/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class FizzBuzz {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for (int i = 1; i <= n; i++) {
            if ((i % 15 == 0)) {
                System.out.println("fizzbuzz");
            } else if ((i % 5) == 0) {
                System.out.println("buzz");
            } else if ((i % 3) == 0) {
                System.out.println("fizz");
            } else {
                System.out.println(i);
            }

        }
        long startTime = System.nanoTime();

        long stopTime = System.nanoTime();
        System.out.println("Time " + (stopTime - startTime));
//        for (int i = 0; i < 3; i++) {
//            String s1 = in.next();
//            int x = in.nextInt();
//            System.out.printf("%-15s%03d %n", s1, x);
//            //Complete this line
//        }
    }
}
