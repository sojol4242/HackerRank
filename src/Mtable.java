/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank;

import java.util.Scanner;

public class Mtable {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();

        while (N > 1 && N < 1000) {

            for (int i = 1; i <= 10; i++) {

                System.out.println(i + " x " + N + " = " + i * N);
            }

            break;
        }

    }

}
