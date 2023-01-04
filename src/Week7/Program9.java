package Week7;

import java.util.Scanner;

//Write a java program input sales id, seller's name, sales amount, and salary basic and
//then fined this sales
//Commission
//Sales amount >= 50,000 35%
//Sales amount >= 30,000 20%
//>= 20,000 10%
//>= 10,000 5%
//< 10,000 2%
public class Program9 {

    public static void main(String[] args) {
        String  sid,sname;
        double samt,basicsal,commission=0;
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Seller id:");
        sid=sc.next();
        System.out.println("Enter Seller name:");
        sname=sc.next();
        System.out.println("Enter sale amount");
        samt=sc.nextDouble();
        System.out.println("Enter Salary basic:");
        basicsal=sc.nextDouble();


        if (samt>=50000) {
            commission = samt * 0.35;
        }
        else if (samt>=30000) {
            commission = samt * 0.20;
        }
        else  if (samt>=20000) {
            commission = samt * 0.10;
        }
        else if (samt>=10000) {
            commission = samt * 0.5;
        } else if (samt<10000) {
            commission = samt * 0.2;
        }
        System.out.println("Commission is : " +commission);
    }

}
