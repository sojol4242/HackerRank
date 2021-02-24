package daychallenge;

import java.util.Scanner;

public class Solve extends Solution {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        double meal_cost = in.nextDouble();
        int tax_percent = in.nextInt();
        int tip_percent = in.nextInt();
        in.close();

        Solve sol = new Solve();
        sol.meal_cost = meal_cost;
        sol.tax_percent = tax_percent;
        sol.tip_percent = tip_percent;

        sol.result();

    }

}
