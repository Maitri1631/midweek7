package Week7;

import java.util.Scanner;

//Write the java program to check if enter number is “POSITIVE”, “NEGATIVE” or
//“ZERO”
public class Program18 {
    public static void main(String[] args) {
        int num;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number:");
        num=sc.nextInt();
        if(num>0){
            System.out.println("Number is positive");
        } else if (num<0) {
            System.out.println("Number is negative");
        }else {
            System.out.println("Number is zero");
        }
    }

}
