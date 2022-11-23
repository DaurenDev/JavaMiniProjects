package ACM_ALgorithms.Sort;

import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int amount = scanner.nextInt();
        int[] array = new int[amount];

        int outerItem;
        int innerItem;
        int minValueInArray;
        int minValueIndexInArray;
        int temp;

        for(int i = 0; i < array.length; i++){
            array[i] = scanner.nextInt();
        }

        //of course none of elements is sorted, so we start from zero element
        for(outerItem = 0; outerItem < array.length; outerItem++){
            minValueInArray = array[outerItem];
            minValueIndexInArray = outerItem;

            //inner loop we start from first unsorted item
            for(innerItem = outerItem; innerItem < array.length; innerItem++){
                //now we find the smallest value with its index in array
                if(array[innerItem] < minValueInArray){
                    minValueInArray = array[innerItem];
                    minValueIndexInArray = innerItem;
                }
            }

            if(minValueInArray < array[outerItem]){
                temp = array[outerItem];
                array[outerItem] = array[minValueIndexInArray];
                array[minValueIndexInArray] = temp;
            }
        }

        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
    }
}
