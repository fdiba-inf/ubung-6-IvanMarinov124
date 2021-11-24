package exercise6;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = input.nextInt();

        int numberReverse = 0;
        int mNum = n;

        while (mNum > 0)
        {
          int nextDigit = mNum % 10;
          numberReverse = numberReverse * 10 + nextDigit;
          mNum = mNum / 10;
        }
        boolean palindrom = n == numberReverse;
        System.out.println("Palindrome: " + palindrom);

    }
}

