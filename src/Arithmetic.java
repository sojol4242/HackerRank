/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daychallenge;
//day2

import java.util.Scanner;

public class Arithmetic {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double mealCost = scan.nextDouble(); // original meal price
        int tipPercent = scan.nextInt(); // tip percentage
        int taxPercent = scan.nextInt(); // tax percentage
        scan.close();

        // Calculate Tax and Tip:
        double tip = mealCost * tipPercent / 100;
        double tax = mealCost * taxPercent / 100;

        // cast the result of the rounding operation to an int and save it as totalCost 
        int totalCost = (int) Math.round(mealCost + tax + tip);

        System.out.println("The total meal cost is " + totalCost + " dollars.");
    }
}
