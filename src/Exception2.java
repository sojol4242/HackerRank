
import java.util.Scanner;

class Exception2 {

    int power(int n, int p) {

        if (n < 0 || p < 0) {
            throw new IllegalArgumentException("n and p should be non-negative");
        }
        return (int) Math.pow(n, p);

    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {

            int n = in.nextInt();
            int p = in.nextInt();
            Exception2 myCalculator = new Exception2();
            try {
                int ans = myCalculator.power(n, p);
                System.out.println(ans);
            } catch (IllegalArgumentException e) {
                System.out.println(e);
            }
        }
        in.close();
    }
}
