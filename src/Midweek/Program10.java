package Midweek;

import java.util.Scanner;

public class Program10 {

    public static void main(String[] args) {
        int num1,num2,num;
       // int x = 0, i=1;
       // int sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number");
        num1= sc.nextInt();

        System.out.println("Enter second number");
        num2=sc.nextInt();

        while(num1--!=0){
            num2++;
        }
        System.out.println("Addtion of two number is"         +num2);

    }
}
