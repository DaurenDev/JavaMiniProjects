package ACM_ALgorithms.Sort;

import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int amount = scanner.nextInt();
        int[] arr = new int[amount];

        //elements for insertion sort
        int outerItemIndex;
        int innerItemIndex;
        int key;
        int temp;

        for(int i = 0; i < arr.length; i++){
            arr[i]= scanner.nextInt();
        }

        //we'll start from first index cause zero element in sequence is already sorted

        for(outerItemIndex = 1; outerItemIndex < arr.length; outerItemIndex++){
            key = arr[outerItemIndex];
            innerItemIndex = outerItemIndex - 1; //we have to start from very first element (zero element in array) for comparison

            while(innerItemIndex >= 0 && key < arr[innerItemIndex]){
                temp = arr[innerItemIndex];
                arr[innerItemIndex] = arr[innerItemIndex + 1];
                arr[innerItemIndex + 1] = temp;
                innerItemIndex--;
            }
        }

        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
