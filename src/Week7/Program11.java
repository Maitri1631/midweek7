package Week7;

import java.util.Scanner;

//Same as above program-8 using switch statement.
public class Program11 {

    String name;
    public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            System.out.println("Input any alphabet from A to F : ");
            String city = scanner.next();

            switch (city) {
                case "A":
                    System.out.println("Ahmedabad");
                    break;
                case "B":
                    System.out.println("Baroda");
                    break;
                case "C":
                    System.out.println("Chandigad");
                    break;
                case "D":
                    System.out.println("Dholka");
                    break;
                case "E":
                    System.out.println("Etawha");
                    break;
                case "F":
                    System.out.println("Faridabad");
                    break;
                default:
                    System.out.println("Invalid Entry");
            }

        }
    }