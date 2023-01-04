package Week7;

//Write a Java program to calculate the average value of array elements.
public class Program21 {

    public static void main(String[] args) {
        int[] num=new int[]{10,20,30,40,50,60,70};
        int sum = 0;

        for(int i=0; i< num.length ; i++)
        sum = sum + num[i];

        //calculate average value
        double average = sum / num.length;

        System.out.println("Average value of array elements is : " + average);
    }
}
