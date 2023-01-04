package Week7;

import java.util.Scanner;

//Write a java program to input student Name, roll No, and three subjects Math, Science and
//English marks (marks is between 0 to 100 and if it is out of range print error message “Invalid
//Input, Marks should between 0 to 100”) and find out total, percentage and result.
//If he is pass or fail on basis of percentage (pass>=35) and also give them grade if %> = 80 A+,
//%> = 60 A, %> = 50 B, %> = 35 C And print Mark Sheet in following format
public class Program5 {


    public static void main(String[] args) {
        String name,grade;
        int rn,math,sci,eng;
        int total=0;
        double per;
       // int result = total;
        Scanner sc= new Scanner(System.in);
        name=sc.next();
        rn=sc.nextInt();
        math=sc.nextInt();
        sci=sc.nextInt();
        eng=sc.nextInt();


        System.out.println("------------------------------------------------------------");
        System.out.println("|                          Marksheet                       |");
        System.out.println("|--                                                        |");
        System.out.println("|Name:                                         "+name+    "|");
        System.out.println("|Roll No:                                       "+rn+     "|");
        System.out.println("|                                                          |");
        System.out.println("|----------------------------------------------------------|");
        System.out.println("|Subject:                                       Marks      |");
        System.out.println("|----------------------------------------------------------|");
        System.out.println("| Math                :                         "+math+   "|");
        System.out.println("| Science             :                         "+sci+    "|");
        System.out.println("| English             :                         "+eng+    "|");
        System.out.println("|----------------------------------------------------------|");
        total= math+sci+eng;
        per= (double)((total /3));
        System.out.println("| Total                                        "+total+   "|");
        System.out.println("|----------------------------------------------------------|");
        System.out.println("|                                                          |");
        System.out.println("|----------------------------------------------------------|");
        System.out.println("| Percentage                                   "+per+     "|");


        if(total>=105){

            System.out.println("| Result:                                          Pass|");
        }
        else {
            System.out.println("| Result:                                          Fail|");
        }

        if(per>=80){
            System.out.println("| Grade :                                          A+  |");
        }else if (per>=60){
            System.out.println("| Grade :                                          A   |");
        } else if (per>=50) {
            System.out.println("| Grade :                                          B   |");
        } else if (per>=35) {
            System.out.println("| Grade :                                          C   |");
        }


    }
}
