package Array;

import java.util.Scanner;

public class JavaCode1 {
    public static void main(String[] args) {
        float n1 = 7, n2 = 8;

        System.out.println(" average two numbers " + (n1 + n2) / 2);

        Scanner input = new Scanner(System.in);
        //input.nextInt();
        int size = input.nextInt();
        int[] intArray = new int[size];
        //intArray = {3, 5, 10}:
        for (int i = 0; i < size; i++) {
            intArray[i] = input.nextInt();

        }
        int sum=0;

        for (int i = 0; i<size; i++){
            // intArray[i]

            sum = sum + intArray[i];


        }
        System.out.println(sum/size);
        for (int i = 0; i<size; i++){
            // intArray[i]

            if(intArray[i] % 2 == 0)

                System.out.println(intArray[i] + " is even");
            else
                System.out.println(intArray[i]+ " is odd");

        }
    }
}

