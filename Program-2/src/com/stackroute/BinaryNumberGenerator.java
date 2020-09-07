package com.stackroute;
import java.util.*;
class BinaryNumberGenerator {
    //checks whether the given number is less than 20 and generates binary number sequence if it is less than 20
    public static String findBinaryNumbersSequence(int number) {
        if (number > 0 && number <= 20) {
            Queue<String> queue = new LinkedList<String>();
            //add first binary number
            queue.add("1");
            while (number-- > 0) {
                String stringOne = queue.peek();
                queue.remove();
                System.out.println(stringOne);
                //assign string value to another variable
                String stringTwo = stringOne;
                queue.add(stringOne + "0");
                queue.add(stringTwo + "1");
            }
        }
        else if (number > 20) {
            System.out.println("Give proper input not greater than 20");
        }
        else if (number == 0 || number < 0) {
            System.out.println("Give proper input not zero or negative number");

        }
        return null;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        //reads a number from user
        System.out.println("Enter the Input value");
        int number = reader.nextInt();
        findBinaryNumbersSequence(number);
    }
}
