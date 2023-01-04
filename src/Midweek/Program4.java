package Midweek;

import java.util.Scanner;

public class Program4 {

    public static void main(String[] args) {
        int a,b;
        Scanner sc=new Scanner(System .in);
        System.out.println("Enter the length");
        a=sc.nextInt();

        System.out.println("Enter a breath");
        b=sc.nextInt();

        if(a==b){
            System.out.println("It is Square");
        }
        else {
            System.out.println("It is not Square");
        }

    }

}
