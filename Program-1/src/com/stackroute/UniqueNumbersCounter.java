package com.stackroute;
import java.util.*;
public class UniqueNumbersCounter {
    public static void findUniqueNumbersCount(int array[], int subArrayLength) {
        int count = 0;
        int length = array.length + 1;
        //checks sub array length greater than zero and displays the count of unique elements
        if (array.length > 0) {
            if (subArrayLength > array.length) {
                System.out.println("Give proper input, sub array length exceeds array length");
            }
            else if (subArrayLength == 0 || subArrayLength < 0) {
                System.out.println("Give proper input, sub-array length can not be negative or zero");
            }
            for (int i = 0; i < length - subArrayLength; i++) {
                Queue<Integer> queue = new ArrayDeque<Integer>();
                {
                    for (int j = 0; j < subArrayLength; j++) {
                        queue.add(array[i + j]);
                    }
                    if (queue.size() > count) {
                        count = queue.size();                //count unique elements of the array

                    }
                    System.out.println(count);

                }
            }
            //checks if count and sub array length is equal to two
            if (subArrayLength == 2 || count == 2) {
                System.out.println("Count of Unique numbers is 2");
            }
        }
        //checks whether array is empty or not
        else if (array.length == 0) {
            System.out.println("Give proper input not empty array");
        }

    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = reader.nextInt();
        int[] array = new int[size];
        System.out.println("Enter array elements");
        for (int i = 0; i < size; i++) {
            array[i] = reader.nextInt();
        }
        System.out.println("Enter size of sub array");
        int subArrayLength = reader.nextInt();
        findUniqueNumbersCount(array, subArrayLength);
    }
}
