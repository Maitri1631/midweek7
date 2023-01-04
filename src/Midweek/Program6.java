package Midweek;

import java.util.Scanner;

public class Program6 {

    public static void main(String[] args) {

        int eng, math, sci, guj;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter English marks:    ");
        eng = sc.nextInt();
        System.out.println("Enter Maths Marks:      ");
        math = sc.nextInt();
        System.out.println("Enter Science Marks:    ");
        sci = sc.nextInt();
        System.out.println("Enter Gujarati Marks:    ");
        guj = sc.nextInt();

        double total = eng + math + sci + guj;
        double per = (total / 400) * 100;

        String grade = null;

        if (per < 25) {
            System.out.println("Your Grade is:  F");
        } else if ((per >= 25) && (per< 45)) {
            System.out.println("Your Grade is:  E");

        } else if ((per >= 45) && (per < 50)) {
            System.out.println("Your Grade is:  D");

        } else if ((per >= 50) && (per < 60)) {
            System.out.println("Your Grade is:  c");

        } else if ((per >= 60) && (per < 80)) {
            System.out.println("Your Grade is:  B");

        } else if ((per >= 80 && (per< 100))) {
            System.out.println("Your Grade is:  A");
           // System.out.println("Your grade is:     " + grade);
        }
        else {
            System.out.println("Invalid grade");
        }
    }
}