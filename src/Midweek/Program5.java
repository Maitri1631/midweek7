package Midweek;

import java.util.Scanner;

public class Program5 {

    public static void main(String[] args) {

        int num1,num2;

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number1");
        num1=sc.nextInt();

        System.out.println("Enter number2");
        num2=sc.nextInt();

        if(num1>num2){
            System.out.println("First number is greater than the second number");
        } else if (num2>num1) {
            System.out.println("Second number is greater than the First number");
        }else {
            System.out.println("Both are equal");
        }
    }
}
