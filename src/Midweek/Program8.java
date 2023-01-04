package Midweek;

import java.util.Scanner;

public class Program8 {

    public static void main(String[] args) {
        int a,b;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter Number of classes held:   ");
        a=sc.nextInt();
        System.out.println("Enter Number of classes attended:  ");
        b=sc.nextInt();

        float per;
        per=(b*100)/a;

        if(per>=75){
            System.out.println("student is allowed to sit in exam");
        }else {
            System.out.println("student is not allowed to sit in exam");
        }
    }
}
