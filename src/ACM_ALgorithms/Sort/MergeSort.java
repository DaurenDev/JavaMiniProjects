package ACM_ALgorithms.Sort;

import java.util.Arrays;

public class MergeSort {
    public static int[] mergeSort(int[] array){
        mergeSort(array, new int[array.length], 0, array.length - 1);
        return array;
    }

    public static void mergeSort(int[] array, int[] temp, int leftStart, int rightEnd){
        //if start goes out of bounds
        if(leftStart >= rightEnd){
            return;
        }

        //else
        //find out the middle
        int middle = (leftStart + rightEnd) / 2;

        //merge sort on the left half
        mergeSort(array,temp, leftStart, middle);

        //merge sort on the right half
        mergeSort(array, temp,middle + 1, rightEnd);

        //merge two halves
        mergeHalves(array, temp, leftStart, rightEnd);
    }

    //temp is array we use entire time instead of creating new array each time

    public static void mergeHalves(int[] array, int[] temp, int leftStart, int rightEnd){
        //since it's difficult to merge in existing array we have to create a temporary array to copy into while merging
        int leftEnd = (leftStart + rightEnd) / 2;
        int rightStart = leftEnd + 1;

        //number of elements we copy over to new temp array
        int size = rightEnd - leftStart + 1;

        //indexes to start
        int left = leftStart;
        int right = rightStart;

        //index for temp array to copy over elements
        int index = leftStart;

        while (left <= leftEnd && right <= rightEnd){
            if(array[left] <= array[right]){
                temp[index] = array[left];
                left++;
            }
            else{
                temp[index] = array[right];
                right++;
            }
            index++;
        }

        //copy remainder into the left side of elements
        System.arraycopy(array, left, temp, index, leftEnd - left + 1);

        //copy remainder into the right side of elements
        System.arraycopy(array, right, temp, index, rightEnd - right + 1);

        //copy all from temp into actual array
        System.arraycopy(temp, leftStart, array, leftStart, size);

        //NOTE: only one side will have remaining elements and one side will be out of boundary so that means only
        //ONE copied side will have its effect (either left OR right)
    }

    public static void main(String[] args) {
        int[] arr = {3,4,1,8,9,2};
        System.out.println(Arrays.toString(mergeSort(arr)));
    }
}
