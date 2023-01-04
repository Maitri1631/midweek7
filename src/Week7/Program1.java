package Week7;
//Write a java program that tells us that Input number is odd or even?
//        HINT: use ternary operator (? :)

import java.util.Scanner;

public class Program1 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter number:");
        int number = sc.nextInt();

        //ternary operator to check number
        String result = number%2==0 ? "Even" :"Odd";

        System.out.println(number   +"is"     +result);
    }

}
