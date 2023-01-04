package Week7;

import java.util.Scanner;

//Input any alphabet from “A" to “F” and print their city name accordingly (use if else) if
//any other alphabet should be invalid entry
public class Program10 {

    public static void main(String[] args) {
        char a='A';

        char f='F';

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter A or F:");
        char alphabetic = sc.next().charAt(0);

         if(alphabetic =='A'){
             System.out.println("Country is America");
         }
         else if(alphabetic=='F'){
             System.out.println("Country is France");
         }else {
             System.out.println("Other Country");
         }
    }

}
