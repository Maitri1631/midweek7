package Week7;

import java.util.Scanner;

//Write a java program to input any number and find out if it’s odd or even
public class Program7 {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        if(num%2==0){
            System.out.println(num   +     "is Even");
        }
        else {
            System.out.println(num     +      "is odd");
        }
    }

}
