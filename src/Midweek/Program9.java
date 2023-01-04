package Midweek;

import java.util.Scanner;

public class Program9 {
    public static void main(String[] args) {
        int a,b;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter Number of classes held:   ");
        a=sc.nextInt();
        System.out.println("Enter Number of classes attended:  ");
        b=sc.nextInt();
        System.out.println("Have any medical cause  \\\"true or false?\\\"");
        char medical =sc.next().charAt(0);

        float per;
        per=(b*100)/a;

        if(per>=75 || medical=='Y'){
            System.out.println("student is allowed to sit in exam");
        }
        else if (per>=75 ||medical=='F') {
            System.out.println("Student is not allowed");
        }else
        {
            System.out.println("student is not allowed to sit in exam");
        }
    }
}
