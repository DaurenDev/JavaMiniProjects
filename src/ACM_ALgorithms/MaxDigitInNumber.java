package ACM_ALgorithms;

import java.util.Scanner;

public class MaxDigitInNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number:");
        int number = in.nextInt();

        byte maxDigit, minDigit;
        maxDigit = minDigit = (byte)(number % 10);
        while (number > 0) {
            byte curDigit = (byte)(number % 10);
            if (curDigit > maxDigit)
                maxDigit = curDigit;
            if (curDigit < minDigit)
                minDigit = curDigit;
            number /= 10;
        }

        System.out.println("Max digit is " + maxDigit + ", min digit is " + minDigit);
    }
}
