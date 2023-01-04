package Midweek;

import java.util.Scanner;

public class Program7 {

    public static void main(String[] args) {
        int age1,age2,age3;

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter age of first person ");
        age1=sc.nextInt();

        System.out.println("Enter age of second person");
        age2=sc.nextInt();

        System.out.println("Enter age of third person");
        age3=sc.nextInt();

        if((age1>age2)  && (age1>age3)){
            System.out.println("First person is Oldest");
        } else if (age2>age1 && age2>age3) {
            System.out.println("Second person is Oldest");
        } else if (age3>age1 && age3>age2) {
            System.out.println("Third person is Oldest");
        }else {
            System.out.println("All person is equal");
        }
    }

}
