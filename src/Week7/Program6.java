package Week7;

import java.util.Scanner;

//WAP to input employee id, name, basic salary then find HRA, TA, DA, PF and Gross
//salary
//HRA = basic salary 10%
//DA = Basic salary 8%
//TA = Basic salary 9%
//PF= Basic salary 20%
//Gross salary = basic salary + HRA + TA + DA –PF
public class Program6 {
    public static void main(String[] args) {
        String eid,ename;
        int basicsal;
        Scanner sc=new Scanner(System.in);
        eid=sc.next();
        ename=sc.next();
        basicsal=sc.nextInt();


        System.out.println("--------------------------------------------------------------------");
        System.out.println("|                           Salary Slip                            |");
        System.out.println("|                                                                  |");
        System.out.println("--------------------------------------------------------------------");
        System.out.println("| Employee id:                                        "+eid+      "|");
        System.out.println("| Employee Name:                                      "+ename+    "|");
        System.out.println("|                                                                  |");
        System.out.println("--------------------------------------------------------------------");
        System.out.println("| Basic Salary:                                     "+basicsal+   "|");
      double  HRA=10*basicsal/100;
        System.out.println("| HRA 10%:                                           "+HRA+       "|");
       float TA=9*basicsal/100;

        System.out.println("| TA 8%:                                             "+TA+        "|");
        double DA=8*basicsal/100;
        System.out.println("| DA 9%:                                             "+DA+        "|");
       double PF=20*basicsal/100;
        System.out.println("| PF- 20&:                                             "+PF+        "|");
        System.out.println("|                                                                  |");
        System.out.println("--------------------------------------------------------------------");
        double grosssal=basicsal+HRA+TA+DA-PF;
        System.out.println("| Gross salary:                                            "+grosssal+        "|");
        System.out.println("|==============================================================================|");
    }
}
