package Week7;
//Write a java program to print the numbers between 1 to 100 which can be divided by 3
//and 5 separately.
public class Program13 {
    public static void main(String[] args) {
        System.out.println("\n Divided by 3:");
        for (int i=1; i<100; i++){
            if (i%3==0)
                System.out.println(i +", ");
        }
        System.out.println("\n\ndivided by 5:");
        for (int i=1; i<100; i++){
            if (i%5==0)
                System.out.println(i +", ");
        }
        System.out.println("\n\ndivided by 3 & 5:");
        for (int i=1; i<100; i++) {
            if (i%3==0 && i%5==0)
                System.out.println(i +", ");
        }
        System.out.println("\n");
    }
}
