package Midweek;

public class Program2 {

    public static void main(String[] args) {
        int tablenum =24;

        System.out.println("Generating the table 24");

        for(int i=1; i<=10; i++){
            System.out.format("%d  * %d  =%d \n",tablenum,i,tablenum*i );
        }

        //generating the 50 table
        int tablenum1 =50;

        System.out.println("Generating the table 50");

        for(int i=1; i<=10; i++){
            System.out.format("%d  * %d  =%d \n",tablenum1,i,tablenum1*i );
        }

        int tablenum3 =29;

        System.out.println("Generating the table 29");

        for(int i=1; i<=10; i++){
            System.out.format("%d  * %d  =%d \n",tablenum3,i,tablenum3*i );
        }
    }

}
