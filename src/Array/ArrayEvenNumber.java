package Array;

public class ArrayEvenNumber {

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++)
            System.out.print(array[i] + " ");
        System.out.println();
    }
    public static void main (String[]args){
        int n = 8;
        // array with N size
        int array[] = {27, 53, 54, 6, 76, 66, 2, 71};

        int evenSize = 0;

        for (int i = 0; i < n; i++) {
            if (array[i] % 2 == 0)
                evenSize++;

        }
        int[] even = new int[evenSize];
        int j = 0, k = 0;
        for (int i = 0; i < n; i++) {
            if (array[i] % 2 == 0)
                even[j++] = array[i];

        }
        System.out.print("Even Array contains: ");
        printArray(even);
    }

}
