/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day;

import java.util.Scanner;

public class Day1 {

    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";

        Scanner scan = new Scanner(System.in);
        int a;
        double b;
        String s1;
        a = scan.nextInt();
        b = scan.nextDouble();
        scan.nextLine();
        s1 = scan.nextLine();
        System.out.println(i + a);
        System.out.println(d + b);
        System.out.println(s + s1);
        scan.close();
    }
}
