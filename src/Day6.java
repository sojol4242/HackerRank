/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daychallenge;

import java.io.*;
import java.util.*;

public class Day6 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int testCases = scan.nextInt();
        for (int i = 0; i < testCases; i++) {
            char[] inputString = scan.next().toCharArray();

            // Print even chars
            for (int j = 0; j < inputString.length; j += 2) {
                System.out.print(inputString[j]);
            }
            System.out.print(" ");

            // Print odd chars
            for (int j = 1; j < inputString.length; j += 2) {
                System.out.print(inputString[j]);
            }
            System.out.println();
        }
        scan.close();
    }
}
