package Midweek;


import java.util.Scanner;

//Take 10 integers from keyboard using loop and print their average value on the
//screen.
public class Program1 {

    public static void main(String[] args) {

        int n=1; //local variable
        int sum=0,num;  //local variable
        float avg;  //local variable

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number ");

        while(n<=10){
            //System.out.print("Enter a number: ");
            sum = sum + sc.nextInt();
            n++;
        }
        avg=sum/10;
        System.out.println("Average is"+avg);
    }

}
