/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day12;

public class Student extends Person {

    private int[] testScores;

    Student(String firstName, String lastName, int identification, int[] scores) {
        super(firstName, lastName, identification);
        this.testScores = scores;
    }

    public char calculate() {
        int a = 0;
        for (int i = 0; i < testScores.length; i++) {
            a += testScores[i];
        }
        a  = a  / testScores.length;

        if (a >= 90) {
            return 'O'; 
        } else if (a  >= 80) {
            return 'E'; 
        } else if (a  >= 70) {
            return 'A';  
        } else if (a  >= 55) {
            return 'P'; 
        } else if (a  >= 40) {
            return 'D'; 
        } else {
            return 'T';  
        }
    }
}
