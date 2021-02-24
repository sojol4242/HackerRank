package daychallenge;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Day8 {

    public static void main(String[] args) {

        Map<String, Integer> phonebook = new HashMap<>();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 1; i <= n; i++) {
            String name = in.next();
            int num = in.nextInt();
            phonebook.put(name, num);
        }

        while (in.hasNext()) {
            String s = in.next();
            Integer phoneNumber = phonebook.get(s);
            System.out.println(
                    (phoneNumber != null)
                            ? s + "=" + phoneNumber
                            : "Not found"
            );
        }
        in.close();

    }
}
