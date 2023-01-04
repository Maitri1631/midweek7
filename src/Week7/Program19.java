package Week7;


//Write a Java program to sort a numeric array and a string array.
import java.util.Arrays;

public class Program19 {

    public static void main(String[] args) {
        int[] num={4,5,7,6,8};
        String[] str={"Maitri", "Karan"};

        Arrays.toString(num);
        Arrays.toString(str);


        System.out.println(Arrays.toString(num));
        System.out.println(Arrays.toString(str));

        Arrays.sort(num);
        Arrays.sort(str);

        System.out.println(Arrays.toString(num));
        System.out.println(Arrays.toString(str));

    }
}
