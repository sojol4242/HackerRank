
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */

public class Day28 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<String> nameList  = new ArrayList<String>();
        
        int n = in.nextInt();
        for(int i = 0; i < n; i++){
            String name = in.next();
            String[] email = in.next().split("@");
            if(email[1].equals("gmail.com")){
                nameList.add(name);
            }
        }
        in.close();
        Collections.sort(nameList);

        for(String name : nameList){
            System.out.println(name);
        }
    }
}