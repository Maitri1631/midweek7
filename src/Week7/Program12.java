package Week7;

import java.util.Scanner;

//Write a java program to input any two number and ask user to enter their symbol (+, -,
///, *) find addition, Subtraction, multiplication and division according to their symbol
//(using if else)
public class Program12 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num1,num2,result;
        char ch;

        System.out.println("Enter any two numbers:");
        num1 = sc.nextInt();
        num2 = sc.nextInt();

        System.out.println("Enter the operators (+,-,*,/):");
        ch = sc.next().charAt(0);

        if (ch == '+')
            result=num1 + num2;
        else if (ch == '-')
            result=num1 - num2;
        else if (ch == '*')
            result=num1 * num2;
        else if (ch == '/')
            result=num1 / num2;
        else
        {
            System.out.println("Invalid Input");
            return;

        }
        System.out.println("Result = "+result);
    }
}
