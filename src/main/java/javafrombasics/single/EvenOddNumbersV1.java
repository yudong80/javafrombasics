package javafrombasics.single;

import java.util.Scanner;

public class EvenOddNumbersV1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = Integer.parseInt(in.nextLine());

        if (number % 2 == 0) {
            System.out.println("this is even number.");
        } else {
            System.out.println("this is odd number.");
        }
    }
}
